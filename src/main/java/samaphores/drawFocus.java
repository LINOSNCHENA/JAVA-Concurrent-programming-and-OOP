package samaphores;

import java.util.concurrent.Semaphore;

public class drawFocus {
  private static final int level1 = 1, level2 = 2, level3 = 2;
  private final Semaphore mutex = new Semaphore(level1);
  private final Semaphore semax = new Semaphore(level2);
  private final Semaphore semax2 = new Semaphore(level3);

  public void ScheduledWritings() {
    for (int i = 0; i < 2; i++) {
      WriteJobs groupONE = new WriteJobs();
      groupONE.start();
    }
  }

  public void ScheduledReadings() {
    for (int i = 0; i < 2; i++) {
      ReadJobs groupTwo = new ReadJobs();
      groupTwo.start();
    }
  }

  public class WriteJobs extends Thread {
    @Override
    public void run() {
      try {
        mutex.acquire();
        semax.acquire();
        semax2.acquire(); // Three locks
      } catch (InterruptedException e) {
        return;
      }
      System.out.println("Read Job :" + this.getId() + " - DBbase keys Available :" + mutex.availablePermits()
          + " -Writing keys Available :" + semax.availablePermits() + " -Reading keys Available :"
          + semax2.availablePermits());
      try {
        sleep(100);
      } catch (Exception e) {
      } finally {
        semax.release();
        semax2.release();
        mutex.release(); // Three unlocks
      }
      System.out.println("Read job :" + this.getId() + " - DBase keys Available :" + mutex.availablePermits()
          + " - Reading keys Available :" + semax.availablePermits() + " - Writing keys Available :"
          + semax2.availablePermits() + " |- Operation # " + this.getId() + " ends, then DB is again free\n");

    }
  }

  public class ReadJobs extends Thread {
    @Override
    public void run() {
      try {
        mutex.acquire();
        semax.acquire();
        semax2.acquire(); // Three locks
      } catch (InterruptedException e) {
        return;
      }

      System.out.println("Read Job :" + this.getId() + " - DBbase keys Available :" + mutex.availablePermits()
          + " -Writing keys Available :" + semax.availablePermits() + " -Reading keys Available :"
          + semax2.availablePermits());
      try {
        sleep(100);
      } catch (Exception e) {
      } finally {
        semax.release();
        mutex.release();
        semax2.release(); // Three unlocks
      }

      System.out.println("Read job :" + this.getId() + " - DBase keys Available :" + mutex.availablePermits()
          + " - Reading keys Available :" + semax.availablePermits() + " - Writing keys Available :"
          + semax2.availablePermits() + " |- Operation # " + this.getId() + " ends, then DB is again free\n");
    }
  }

  public static void main(String[] args) {
    drawFocus deployed = new drawFocus();
    deployed.ScheduledWritings(); // First Group
    deployed.ScheduledReadings(); // Second Group
  }
}
