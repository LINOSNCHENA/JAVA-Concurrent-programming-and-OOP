package accessmode;

import muntu1.Addition;

public final class klass4Main {
  private klass4Main() {
  } // Zero Initailization Locks it

  public static void main(String[] args) {
    System.out.println("\n Hello Nikolas! - This is your Abstract Object!");
    klass1Abstract objectAbstracted = new klass2Extends();

    System.out.println(objectAbstracted.doSomethingOne());
    System.out.println(objectAbstracted.doSomethingTwo());

    System.out.println("\n Hello Lorena! - This is your imported Object! ");
    klass3Function objPackageA = new klass3Function();
    Addition objPackageB = new Addition();

    int A = objPackageA.addTwoNumbers(20, 61);
    int B = objPackageB.addTwoNumbers(21, 62);
    System.out.println("\n ====================== RETURN VALUES ===========================");
    System.out.println("Result of A : " + A);
    System.out.println("Result of B : " + B);

  }

}
