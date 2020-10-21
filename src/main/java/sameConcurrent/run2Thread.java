package sameconcurrent;

class ThreatElderFall extends Thread {
   private Thread t;
   private String threadName;

   ThreatElderFall(String name) {
      threadName = name;
      System.out.println("Creating " + threadName);
   }

   public void run() {
      System.out.println("Running " + threadName);
      try {
         for (int i = 4; i > 0; i--) {
            System.out.println("Thread: " + threadName + ", " + i);
            // Let the thread sleep for a while.
            Thread.sleep(1050);
         }
      } catch (InterruptedException e) {
         System.out.println("Thread " + threadName + " interrupted.");
      }
      System.out.println("Thread " + threadName + " exiting.");
   }

   public void start() {
      System.out.println("Starting " + threadName);
      if (t == null) {
         t = new Thread(this, threadName);
         t.start();
      }
   }
}

class ThreadRainfall extends Thread {
   private int number;

   // class constructor
   public ThreadRainfall(int number) {
      this.number = number;
   }
   // run method => execution code for thread
   public void run() {
      int counter = 0;
      int numInt = 0;

      // prints the number till specified value
      do {
         numInt = (int) (counter + 3);
         System.out.println("Rainfall : " + numInt + " - " + this.getName());
         counter++;
      } while (numInt != number);
      System.out.println("** Correct! " + this.getName() + " - Sensored - " + counter + " times.**");
   }
}

public class run2Thread {

   public static void main(String args[]) {
      ThreatElderFall T1 = new ThreatElderFall("Thread-1B");
      T1.start();

      ThreatElderFall T2 = new ThreatElderFall("Thread-2B");
      T2.start();
      System.out.println("\n main() is ending...");
      System.out.println("Starting Sensor_2...");
      Thread thread_2 = new ThreadRainfall(142);
      // start thread_2
      thread_2.start();
      System.out.println("\n main() is ending...");
   }
}
