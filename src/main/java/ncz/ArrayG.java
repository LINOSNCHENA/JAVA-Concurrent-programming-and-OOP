package ncz;

import java.util.*;

public class ArrayG {
    public int solution(int[] A) {
        int sizeX = A.length;
        int valueX = -1;
        Arrays.sort(A);

        for (int i = 0; i < sizeX; i++) { // A(s) only
            if ((sizeX) == 1) {
                if (A[i] < -1000000) {
                    return 1;
                }
                if (A[i] > 1000000) { // size-Min-Max-Good
                    return 1;
                }
                if (A[i] == 1) {
                    return 2;
                }
                valueX = 1;
                return valueX;
            }
        }

        //////////////////////////////////////////////////////
        for (int s = 0; s < sizeX - 1; s++) { // A(s) and A(s+1)
            if (sizeX > 1000000) {
                valueX = 1;
                return valueX;// 2
            }
            if (A[s + 1] < -1000000 || A[s] < -1000000) {
                valueX = 1;
                return valueX;// 3
            }
            if (A[s + 1] > 1000000 || A[s] > 1000000) {
                valueX = 1;
                return valueX;// 3
            }

            /////////////////////////////////////////////////////////////////


            if (s==A[s]) {
                valueX = 1 + A[s];
                return valueX;// 5
            }
           
            if (A[s + 1] - A[s] != 1 && A[s + 1] < 0 && A[s + 1] != A[s]) {
                valueX = 1 + A[s];
                return valueX;// 5
            }
       
            if ((A[s + 1] - A[s]) > 1 && A[s + 1] < 1 && A[s] < 1) {
                valueX = 1;
                return valueX;// 4
            }
            // if ( A[s] != 1 && A[s + 1] > 1 && A[s] > 1) {
            //     valueX = 1;
            //     return valueX;// 4
            // }

            if (A[s + 1] < 0 && A[s] < 0) {
                valueX = 1;
                return valueX;// 5
            }
            if (A[s + 1] - A[s] != 1 && A[s + 1] != A[s]) {
                valueX = 1 + A[s];
                return valueX;// 5
            }
            if (A[sizeX - 1] < 0 || A[sizeX - 1] == 0) {
                valueX = 1;
                return valueX;// 6
            }
            if ((A[s + 1] - A[s]) < 0) {
                valueX = 1;
                return valueX;// 8
            }
            if ((A[s + 1] - A[s]) > 2) {
                valueX = 1 + A[s];
                return valueX;// 4
            }
            if ((A[s + 1] - A[s]) == 0 && A[s + 1] == A[sizeX - 1]) {
                valueX = 1 + A[s];
                return valueX;// 7 Unknown
            }
            if ((A[s + 1] - A[s]) == 0 && A[s + 1] == A[sizeX - 1]) {
                valueX = 1 + A[s];
                return valueX;// 7 Unknown
            } else {
                valueX = 1 + A[sizeX - 1];// 8
            }
        }
        return valueX;
    }

}
