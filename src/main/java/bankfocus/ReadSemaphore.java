package bankfocus;
import java.util.concurrent.Semaphore;
public class ReadSemaphore {

    static Semaphore semaphore = new Semaphore(0);
    static Semaphore mutex = new Semaphore(1);
    
    // I'll producing new Integer every time
    static class Producer extends Thread {
        public void run() {         
            int counter = 1;
            try {
                while (true) {
                    String threadName = Thread.currentThread().getName() + counter++;
                    mutex.acquire(); // List.add(threadName);
                    System.out.println("Producer is prdoucing new value: " + threadName);
                    mutex.release();
                    // release lock
                    semaphore.release(); Thread.sleep(500);   }
            } catch (Exception x) {  return;     }
        }
    }
    
    // I'll be consuming Integer every stime
    static class Consumer extends Thread {
        String consumerName;        
        public Consumer(String name) {    this.consumerName = name;    }        
        public void run() {
            try {
                while (true) {
                    semaphore.acquire();
                     mutex.acquire();
                    String result = "";
    System.out.println(consumerName+" consumes value: "+result+"List.size(): "+1+"\n");
                    mutex.release();         }
            } catch (Exception e) {return;  }
        }
    }
        public static void main(String[] args) {
        new Producer().start();
        new Consumer("ReadJob").start(); 
        new Consumer("WriteJob").start();
    }
}