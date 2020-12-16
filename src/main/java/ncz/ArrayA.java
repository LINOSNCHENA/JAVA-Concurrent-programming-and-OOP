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
                System.out.println("\n =========/size1/============" + valueX + "\n");
                return valueX; // MAX-ELEMENTS // Final Exit fuctions
            }
            if (A[s] < -14 || A[s] > 14 || A[s + 1] < -15 || A[1 + s] > 15) {
                valueX = -2;
                System.out.println("\n =========/range2/============" + valueX + "\n");
                return valueX; // OVER-RANGE // Final Exit Function
            }

            //////////////////////////////////////////////////////////////////////////// RANKING
            ///////////////////////// SOLVING ORDE/EXIT IMPORTANCE ////////////////////
            if ((A[s + 1] - A[s]) > 2) {
                valueX = -2;
                System.out.println("\n ==== =====/TooBigGAP6/===========" + valueX + "\n");
                return valueX; // # TOO LARGE-GAP // Exit Function

            }
            if (A[s + 1] - A[s] != 1 && A[s + 1] != A[s]) {
                valueX = 1 + A[s];
                System.out.println("\n =========/notOneBalaceNORNotRepeat3/============" + valueX + "\n");
                return valueX; // FIX-ONE-GAP; // Final Exit function
            }

            if (A[sizeX - 1] < 0 || A[sizeX - 1] == 0) {
                valueX = 1;
                System.out.println("\n =========/ZeroIsFinal4/============" + valueX + "\n");
                return valueX; // # FIX-Zero-SHIFT // Exit Function
            }

            if ((A[s + 1] - A[s]) == 0 && A[s + 1] == A[sizeX - 1]) {
                valueX = 1 + A[s];
                System.out.println("\n =========/LastDoubles5/============" + valueX + "\n");
                return valueX; // # 5 FIX -EQUALS ONLY AT END// End Exit Function

            }

            else {
                valueX = 1 + A[sizeX - 1]; // BREAK OR ANOTHER ITERATION OR FINISH== REPEATABLE
                System.out.println("\n =========/default7/============" + valueX + "\n");
            }
        }
        return valueX;
    }
}
