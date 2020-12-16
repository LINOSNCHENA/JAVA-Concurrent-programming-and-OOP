package ncz;

import java.util.Arrays;

public class ArrayA {
    int sortAddArray(int[] A) {
        int sizeX = A.length;
        int valueX = 99;
        System.out.println("\n =========/FIRSTA-5Tests/============" + "\n");
        Arrays.sort(A);
        for (int s = 0; s < sizeX - 1; s++) {
            if (sizeX > 22) {
                valueX = -1;
                System.out.println("\n =========/size/============" + valueX + "\n");
                return valueX; // MAX-ELEMENTS // Final Exit fuctions
            }
            if (A[s] < -14 || A[s] > 14 || A[s + 1] < -15 || A[1 + s] > 15) {
                valueX = -2;
                System.out.println("\n =========/range/============" + valueX + "\n");
                return valueX; // OVER-RANGE // Final Exit Function
            }
            if ((A[s + 1] - A[s]) > 1) {
                valueX = -1;
                System.out.println("\n =========/WrongInput/============" + valueX + "\n");
                return valueX; // # 5 Ignore equal elements//Not-One-Gap at loop-End Exit Function

            }

             if (A[s + 1] - A[s] != 1 && A[s + 1] != A[s]  ) {
                valueX =1+A[s];
                System.out.println("\n =========/notOneBalacNotRepeat/============" + valueX + "\n");
                 return valueX; // BIG GAP; // Final Exit function
             }
            ////////////////////////////////////////////////////////////////////////////RANKING FILTERS
            if (A[sizeX - 1] < 0||A[sizeX - 1] == 0) {
                valueX = 1;
                System.out.println("\n =========/zeroFina/============" + valueX + "\n");
                return valueX; // # 4 Zero Gap OR Negative Exit Function
            }

            if ((A[s + 1] - A[s]) == 0 && A[s + 1] == A[sizeX - 1]) {
                valueX = 1 + A[s];
                System.out.println("\n =========/doubles/============" + valueX + "\n");
                return valueX; // # 5 Ignore equal elements//Not-One-Gap at loop-End Exit Function

            }

      
            if (A[s + 1] - A[s] == -1 && A[sizeX] == -1) {
                valueX = 1;
                System.out.println("\n =========/defaultx/============" + valueX + "\n");
                return valueX;// # 6 Special case of zero to One; // Exit functions
            } else {
                valueX = 1 + A[sizeX - 1]; // Final
                System.out.println("\n =========/default/============" + valueX + "\n");
               
            }
        }
        return valueX;
    }
}
