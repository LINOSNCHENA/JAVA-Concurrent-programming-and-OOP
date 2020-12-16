package ncz;

public class ArrayA {
    int sortAddArray(int[] A) {
        int sizeX = A.length;
        int valueX = 0;
        System.out.println("\n =========/FIRST-5Tests/============" + "\n");

        for (int s = 0; s < sizeX - 1; s++) {
            if (sizeX > 22) {
                valueX = -1;
                return valueX;// Max
            }
            if (A[s] < -4 || A[s] > 9 || A[s + 1] < -3 || A[1 + s] > 10) {
                valueX = -1;
                return valueX; // Exit Function
            }
            if ((A[s + 1] - A[s]) != 1) {
                valueX = 1 + A[s];
                break; // Exit Loop
            }
            if (A[sizeX - 1] == -1) {
                valueX = 1; // special case
                break;
            } else {
                valueX = 1 + A[sizeX - 1]; // Final
            }
        }
        return valueX;
    }
}
