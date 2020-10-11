package com.monze.pemba;

import com.monze.pemba.config.AppConfig;
import com.monze.pemba.thread.PrintActiveTask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@SpringBootApplication
public class PembaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PembaApplication.class, args);

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		try { // PEMBA
			ThreadPoolTaskExecutor taskExecutor = (ThreadPoolTaskExecutor) context.getBean("taskExecutor");

			PrintActiveTask printTask1 = (PrintActiveTask) context.getBean("printActiveTask");
			printTask1.setName("Thread A1");
			taskExecutor.execute(printTask1);
			PrintActiveTask printTask2 = (PrintActiveTask) context.getBean("printActiveTask");
			printTask2.setName("Thread A2");
			taskExecutor.execute(printTask2);
			PrintActiveTask printTask3 = (PrintActiveTask) context.getBean("printActiveTask");
			printTask3.setName("Thread A3");
			taskExecutor.execute(printTask3);

			for (;;) {
				int count = taskExecutor.getActiveCount();
				System.out.println("Active Threads : " + count);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if (count == 0) {
					taskExecutor.shutdown();

					break;
				}
			}
		}

		finally { // CHOMA
			((AbstractApplicationContext) context).close();
		}
	}
}