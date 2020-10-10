package sametime;

class ThreadClassDemo extends Thread {
    private int number;

    // class constructor
    public ThreadClassDemo(int number) {
        this.number = number;
    }

    // run method => execution code for thread
    public void run() {
        int counter = 0;
        int numInt = 0;
        // prints the number till specified value
        do {
            numInt = (int) (counter + 3);
            System.out.println(" Temp : " + numInt+" - "+this.getName() );
            counter++;
        } while (numInt != number);
        System.out.println("** Correct! " + this.getName() + " - Sensored - " + counter + " times.**");
    }
}

public class threadKlass1 {
    public static void main(String[] args) {
      System.out.println("\n main() is STARTING...");
        System.out.println("Starting Sensor_1...");
        // create a thread class instance
        Thread thread_1 = new ThreadClassDemo(9);
        // start the thread thread_1
        thread_1.start();
        try {
            // wait for thread_1 to die
            thread_1.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }
        System.out.println("Starting Sensor_2...");
        Thread thread_2 = new ThreadClassDemo(12);
        // start thread_2
        thread_2.start();
        System.out.println("\n main() is ending...");
    }

}
