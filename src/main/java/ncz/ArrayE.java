package ncz;

import java.util.*;

public class ArrayE {
    public int solution(int[] A) {

        int sizeX = A.length;
        int valueX = -1;

        Arrays.sort(A);
        for (int i = 0; i < sizeX; i++) { // A(s) only
            if ((sizeX) == 1) {
                if (A[i] < -1000000) {
                    System.out.println("size-1X1");
                    return -1;
                }
                if (A[i] > 1000000) { //size-Min-Max-Good
                    System.out.println("size-1X2");
                    return -1;
                }
                if (A[i] < 0) {
                    System.out.println("size-1X3");
                    return 1;
                }
                valueX = 1 + A[i];
                System.out.println("size-1X4");
                return valueX;

            }
        }
        for (int s = 0; s < sizeX - 1; s++) { // A(s) and A(s+1)
            if (sizeX > 1000000) {
                valueX = -1;
                System.out.println("size-1X");
                return valueX;// 2
            }
            if (A[s] < -1000000 || A[s] > 1000000) {
                valueX = -1;
                System.out.println("size-2X");
                return valueX;// 3
            }
            if ((A[s + 1] - A[s]) > 2) {
                valueX = -1;
                System.out.println("size-3X");
                return valueX;// 4

            }

            //////////////////////////////////////////////////////
            if (A[s + 1] - A[s] != 1 && A[s + 1] != A[s]) {
                valueX = 1 + A[s];
                System.out.println("size-4X");
                return valueX;// 5
            }

            if (A[sizeX - 1] < 0 || A[sizeX - 1] == 0) {
                valueX = 1;
                System.out.println("size-5X");
                return valueX;// 6
            }
            if ((A[s + 1] - A[s]) < 0) {
                valueX = 1;
                System.out.println("Test6x");
                return valueX;// 8
            } 
            if ((A[s + 1] - A[s]) == 0 && A[s + 1] == A[sizeX - 1]) {
                valueX = 1 + A[s];
                System.out.println("size-7x");
                return valueX;// 7  Unknown
            }
            else {
                System.out.println("Test8");
                valueX = 1 + A[sizeX - 1];// 8
            }
        }
        System.out.println("Test9");
        return valueX;
    }

}
