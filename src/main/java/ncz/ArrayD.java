package ncz;
import java.util.Arrays;

public class ArrayD {
    int sortAddArray(int[] A) {
        int sizeX = A.length;
        int valueX = 99;

        Arrays.sort(A);
        for (int s = 0; s < sizeX - 1; s++) {
            if (sizeX > 22) {
                valueX = -1;
                return valueX;//1
            }
            if (A[s] < -14 || A[s] > 14 || A[s + 1] < -15 || A[1 + s] > 15) {
                return valueX;//2
            }
            if ((A[s + 1] - A[s]) > 2) {
                valueX =-2;
                return valueX;//3

            } 
            if (A[s + 1] - A[s] != 1 && A[s + 1] != A[s]) {
                valueX = 1 + A[s];
                return valueX;//4
            }

            if (A[sizeX - 1] < 0 || A[sizeX - 1] == 0) {
                valueX = 1;
                return valueX;//5
            }

            if ((A[s + 1] - A[s]) == 0 && A[s + 1] == A[sizeX - 1]) {
                valueX = 1 + A[s];
                return valueX;//6

            }
     
            
            else {
                valueX = 1 + A[sizeX - 1];//7
            }
        }
        return valueX;
    }
}
