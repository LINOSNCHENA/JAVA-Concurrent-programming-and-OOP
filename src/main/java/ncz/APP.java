package ncz;

public class APP {

    public static void main(String[] args) {

       // int A[] = { -51, 2, 3, 4, 5, 6, 7, 8, 9, 10 ,11, 12, 13, 14, 15, 16, 17, 18, 19, 20}; // Test #1 SIZE
         int A[] = { 1, 2, 3, 4, 5, -6, 7, 8, 9, 10,11,12,13,15,15,16 }; // Test #1 RANGE ELEMENTS
        // int A[] = { -1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // Test #2 BAD GAP
        // int A[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9,10 }; // Test #3 MINUS
        // int A[] = {-2,-1,1 }; // Test #4
        // int A[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // Test #5
        // int A[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 9 }; // Test #6

        Test obj = new Test();
       
        int x = obj.getdata(2040, 100);
        System.out.print(x);
        obj.add();

        ArrayA job = new ArrayA();
        Object z = job.sortAddArray(A);
        System.out.print(z);

        System.out.println("\n");
        System.out.println("\n ================== RETURN PRODUCED =================" + "\n");

    }
}