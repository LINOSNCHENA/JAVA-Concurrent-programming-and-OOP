package ncz;

import java.util.Arrays;

public class ArrayO {
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
        int n = A.length;
        Arrays.sort(A);

        Arrays.sort(A);
        // for (int i = 0; i < n; i++) {
        //     if ((n) == 1) {
        //         if (A[i] < -999999) {
        //             return 1;
        //         }
        //         if (A[i] > 999999) {
        //             return 1;
        //         }
        //         if (A[i] == 1) {
        //             return 2;
        //         }
        //         n = 1;
        //         return n;
        //     }
        // }

        n = removeDuplicates(A, n);

        for (int i = 0; i < n; i++) {
             if (A[i] != (i + 1)) {
                n = (i + 1);
                return n;
            }
        }
        return n + 1;
    }
}
