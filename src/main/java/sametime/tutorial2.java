package sametime;


    
    class ThreadSensors extends Thread {
        private Thread t;
        private String threadName;
        
        ThreadSensors( String name) {
           threadName = name;
           System.out.println("Creating " +  threadName );
        }
        
        public void run() {
           System.out.println("Running " +  threadName );
           try {
              for(int i = 4; i > 0; i--) {
                 System.out.println("Thread: " + threadName + ", " + i);
                 // Let the thread sleep for a while.
                 Thread.sleep(50);
              }
           } catch (InterruptedException e) {
              System.out.println("Thread " +  threadName + " interrupted.");
           }
           System.out.println("Thread " +  threadName + " exiting.");
        }
        
        public void start () {
           System.out.println("Starting " +  threadName );
           if (t == null) {
              t = new Thread (this, threadName);
              t.start ();
           }
        }
     }
     
     public class tutorial2 {
     
        public static void main(String args[]) {
           ThreadSensors T1 = new ThreadSensors( "Thread-1B");
           T1.start();
           
           ThreadSensors T2 = new ThreadSensors( "Thread-2B");
           T2.start();
        }   
     }

