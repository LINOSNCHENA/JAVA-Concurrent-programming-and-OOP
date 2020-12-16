package ncz;

public class APP {

  public static void main(String[] args) {

    // int A[] = { 3, 4, 5, 6, 7, 8, 9, 10,11,12 }; // Test #1 MAX-10
    // int A[] = { 1, 2, 3, 4, 5, -6, 7,11,12,13,115,16 }; // Test #2 RANGE ELEMENTS
     int A[] = { 1, 2, 3, 5, 5, 6, 7, 8, 9, 10 }; // Test #3 BAD-GAP NOT ONE/ORDER
    // int A[] = { -4,-3,-2,-1,0 }; // Test #4 ZEROS AS LAST ELEMENT
    // int A[] = {-2,-1 }; // Test #5 NEGATIVES AS THE LAST

    ArrayB job2 = new ArrayB();
    int Y = job2.sortAddArray(A);
    System.out.print(Y);

    ArrayA job = new ArrayA();
    int z = job.sortAddArray(A);
    System.out.print(z);

    System.out.println("\n ================== RETURN PRODUCED =================" + "\n");

  }
}