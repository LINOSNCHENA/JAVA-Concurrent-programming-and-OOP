package ncz;
import java.util.*;
public class ArrayM {

    /////////////////////////////////////////////////////

    static int removeDuplicates(int arr[], int n) {
        if (n == 0 || n == 1)
            return n;
        int[] temp = new int[n];
        int j = 0;
        for (int i = 0; i < n - 1; i++)
            if (arr[i] != arr[i + 1])
                temp[j++] = arr[i];
        temp[j++] = arr[n - 1];
        for (int i = 0; i < j; i++)
            arr[i] = temp[i];
        return j;
    }

    public int solution(int[] A) {
        int sizeX = A.length;
        int valueX = 0;
        Arrays.sort(A);

        int n = removeDuplicates(A, sizeX);
        for (int i = 0; i < n; i++)
        { System.out.print(A[i] + "|"+(i+1) +"|||=");}

        // Print updated array
        for (int i = 0; i < n; i++)
           { System.out.println(A[i] + "=|="+(i+1));
        if(A[i]!=(i+1)){
            System.out.println(A[i] + " difference-"+(i+1));
            valueX = (i+1);
            System.out.println("ANSWERS TWO NOT EQUAL SERIALS = | " + valueX);
            return valueX;
        }
    }
           // System.out.print(A[i] + "");

        ////////////////////////////////////////////////////////////////////////////////////////////
        // for (int s = 1; s < sizeX - 1; s++) { // A(s) and A(s+1)
        //     System.out.print(A[s] + "x");
        //     System.out.println(s + 1 + "|=============|" + A[s] + "=========" + valueX + "===" + A[s]);
        //     System.out.print(A[s] + "x");
        //     if (s == A[s]) {
        //         System.out.println(s + 1 + "|=============|" + A[s] + "=========" + valueX + "===" + A[s]);
        //         System.out.println("=S================A[S]=============Value===");
        //         valueX = s + 1;
        //         // System.out.println("ANSWERS ONE NOT EQUAL SERIALS = | " + valueX);
        //     } else {
        //         valueX = s;
        //         System.out.println("ANSWERS TWO NOT EQUAL SERIALS = | " + valueX);
        //         return valueX;
        //     }
        // }

        //////////////////////////////////////////////////////
        // for (int s = 1; s < sizeX - 1; s++) { // A(s) and A(s+1)
        //     System.out.println(s + 1 + "|=============|" + A[s] + "=========" + valueX);
        //     if (s - 1 == A[s - 1]) {
        //         System.out.println(s + 1 + "|=============|" + A[s] + "=========" + valueX);
        //         System.out.println("=S================A[S]=============Value===");
        //         valueX = s + 1;
        //         // System.out.println("ANSWERS ONE NOT EQUAL SERIALS = | " + valueX);
        //     } else {
        //         valueX = s;
        //         System.out.println("ANSWERS TWO NOT EQUAL SERIALS = | " + valueX);
        //         return valueX;
        //     }
        // }
        return valueX;
    }

}
