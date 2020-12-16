package ncz;
import java.util.Arrays;

public class ArrayB {

    int sortAddArray(int[] A) {
        int sizeX = A.length;
        int valueX = 0;
        Arrays.sort(A);
        System.out.println("\n =========/SECOND-5Tests/============" + "\n");
 
        for (int s = 0; s < sizeX - 1; s++) {
            if (sizeX > 22) {
                System.out.print(s + 1 + "-# Failed T1: Total items is : ");
                System.out.print(sizeX + "\t");
                System.out.print("\n");
                valueX = -1;
                System.out.print(s + 2 + " Thus " + (sizeX) + " is too many Elements. Return1 >>>  ");
                return valueX;// break;
            }
            if (A[s] < -4 || A[s] > 9 || A[s + 1] < -3 || A[1 + s] > 10) {
                System.out.print(s + 1 + "-# Failed T2: Range -10 to 10 element values : ");
                System.out.print(A[s] + "\t");
                System.out.print(A[s + 1] + "\t");
                System.out.print("\n");
                valueX = -1;//1 + A[s];
                System.out.print(s + 2 + " Thus " + (valueX) + " too Large/S. Return2 >>> : " + (valueX) + "\n");
                return valueX;// break;
            }
            if ((A[s + 1] - A[s]) != 1) {

                System.out.print(s + 1 + "- # Failed T4: BAD-GAP at Position : ");
                System.out.print(s + 1 + "\t");
                System.out.print(A[s] + " And " + A[s + 1] + "\n");
                valueX = 1 + A[s];
                System.out.print(s + 2 + " Thus Position " + (s + 2) + " is changed4 == >>> :  " + valueX + "\n");
                break;
            } 
            if (A[sizeX - 1] == -1) {
                // if (A[s] == -2 && A[s + 1] == -1 && sizeX == 2) {
                System.out.print(s + 1 + "- # Failed T3: Minus-One Bad-GAP Position -2,-1,: ");
                System.out.print(s + 1 + "\t");
                System.out.print(A[s] + "\t");
                System.out.print("\n");
                valueX = 1;
                System.out.print(s + 2 + " THUS POSITION " + (s + 2) + " THEN BECOMES3 == >>> :  " + valueX + "\n");
                break;
            }else {
                valueX = 1 + A[sizeX - 1];
                System.out.print(s + 1 + "-#5 PASSED All five tests : " + "\n");
                System.out
                        .print(s + 1 + " th iteration =" + (sizeX + 1) + " completes#5 by == >>> :  " + valueX + "\n");

            }
        }
        return valueX;
    }

}
