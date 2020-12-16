package ncz;

public class APP {

  public static void main(String[] args) {

   // int A[] = { 3, 4, 5, 6, 7, 8, 9, 10,11,12 }; // Test #1 SORT +MAX-10
  // int A[] = { 1, 2, 3, 4, 5, 6, 7,9 }; // Test #2 RANGE ELEMENTS
  // int A[] = { -4,-3,-2,-1,0 }; // Test #3 ZEROS AS LAST ELEMENT

     int A[] = { 1, 2, 3,4, 6,5,6, 7, 8, 9 }; // Test #3 BAD-GAP NOT ONE/ORDER

    // int A[] = {-3,-2,-1}; // Test #5 NEGATIVES AS THE LAST 1 == 1
  // int A[] = {1, 3, 6, 4, 1, 2};  // Sorting 5

    ArrayB job2 = new ArrayB();
    int Y = job2.sortAddArray(A);
    System.out.print(Y);
    System.out.println("\n ================== FIRST PRODUCED =================" + "\n");
    ArrayA job = new ArrayA();
    int z = job.sortAddArray(A);
    System.out.print(z);
    System.out.println("\n ================== SECOND PRODUCED =================" + "\n");

  }
}