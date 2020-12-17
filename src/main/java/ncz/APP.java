package ncz;

public class APP {

  public static void main(String[] args) {

    // INPUTS AND CONDITIONS TESTED (FIRST-RANKING)
    // int A[] = { 3, 4, 5, 6, 7, 8, 9, 10,11,12 }; // Test #1 SORT +MAX-10
    // int A[] = { 10, 5, 9, 9, 9, 2, 3, 1, 5, 6, 8, 7, 9 }; // RANGEELEMENTS
  //   int A[] = { -4,-3,-2,-1,0 }; // Test #3 ZEROS AS LAST ELEMENT
    //int A[] = { 1, 2, 4, 6,5,6, 7, 8, 9 }; // Test #3 BAD-GAP NOT ONE/ORDER
    // int A[] = {-3,-2,-1}; // Test #5 NEGATIVES AS THE LAST 1 == 1
     int A[] = {-33,-32,-31}; // Test #5 NEGATIVES AS THE LAST 1 == 1
    // int A[] = {1, 3, 6, 4, 1, 2 }; // Sorting 5
  //  int A[] = {1};//-10013, -100012, -100011, }; // Sorting 2
   // int A[] = { 1, 2, 3 }; // Sorting 1
    // int A[]={4, 5, 6, 2}; // BACK TO ONE1
    // int A[]={1, 3, 6, 4, 1, 2};// [1, 3, 6, 4, 1, 2] //5
    System.out.println("\n ================== FINAL-NCHENA-PRODUCED =================" + "\n");
    ArrayO job3 = new ArrayO();
    int Y1 = job3.solution(A);
    System.out.print(Y1);
  }
}