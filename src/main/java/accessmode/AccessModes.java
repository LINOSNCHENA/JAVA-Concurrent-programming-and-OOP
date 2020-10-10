package accessmode;

public class AccessModes {
   public static void main(String args[]) {
      objectABC obj = new objectABC();
      System.out.println("\n ===================START=======================\n");
      System.out.println("       OriginalObject : " + obj.numberXOriginal);
      System.out.println("       Squared-Object : " + obj.numberXSqaured(12));
      System.out.println("\n =================== END =======================\n");
   }
}

class objectABC {

   // private double numberXOriginal = 14;
   // private int numberXSqaured(int a){return a*a; }

   public double numberXOriginal = 14;

   public int numberXSqaured(int a) {
      return a * a;
   }
}