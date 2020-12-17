package ncz;

import java.util.*;

public class ArrayN {
    //////////////////////////////////////////////////////////////////////
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

    ////////////////////////////////////////////////////////////////////////
    public int solution(int[] A) {
        int n = A.length;
        Arrays.sort(A);
        n = removeDuplicates(A, n);

        // Print created array
        for (int i = 0; i < n; i++)
            System.out.println(A[i] + " xy " + (i + 1));

        for (int i = 0; i < n; i++) {
            System.out.println(A[i] + "=|=" + (i + 1));
            if (A[i] != (i + 1)) {
                n = (i + 1);
                System.out.println("ANSWERS TWO NOT EQUAL SERIALS1 = | " + (1 + n));
                System.out.println("ANSWERS TWO NOT EQUAL SERIALS2 = | " + A[i]);
                return n;
            }
        }
        return n + 1;
    }
}
