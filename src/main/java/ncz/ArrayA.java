package ncz;

public class ArrayA {
    int sortAddArray(int[] A) {
        int sizeX = A.length;
        int valueX = 0;
        System.out.println("\n =========/Size1/RANGE2/Minus3One4/BADGAP5/============" + "\n");

        for (int s = 0; s < sizeX - 1; s++) {
            if (sizeX > 22) {
                System.out.print(s + 1 + "-# Failed T1: Total items is : ");
                System.out.print(sizeX + "\t");
                System.out.print("\n");
                valueX = -1;
                System.out.print(s + 2 + " Thus " + (sizeX) + " is too many Elements. Return1 >>>  ");
                return valueX;// break;
            }
            if (A[s] < -3 || A[s] > 9 || A[s + 1] < -2 || A[1 + s] > 10) {
                System.out.print(s + 1 + "-# Failed T2: Range -10 to 10 element values : ");
                System.out.print(A[s] + "\t");
                System.out.print(A[s + 1] + "\t");
                System.out.print("\n");
                valueX = 1 + A[s];
                System.out.print(s + 2 + " Thus " + (valueX) + " too Large/S. Return2 >>> : " + (valueX) + "\n");
                return valueX;// break;
            }
            // /////////////////////////////////////////////////////////////////////////////////////////////////
            if (A[s] == -2 && A[s + 1] == -1 && sizeX == 2) {
                System.out.print(s + 1 + "- # Failed T3:  Bridge Fix neg-one at Position -2,-1,0,1-: ");
                System.out.print(s + 1 + "\t");
                System.out.print(A[s] + "\t");
                System.out.print("\n");
                valueX = 1;
                System.out.print(s + 2 + " THUS POSITION " + (s + 2) + " THEN BECOMES3 == >>> :  " + valueX + "\n");
                break;
            } else {
                    System.out.print(s + 1 + "- # Success T4: Negative-one avoided at Position : ");
                    System.out.print(s + 1 + "\t");
                    System.out.print(A[s] + "\t");
                    System.out.print("\n");
                    valueX = 1 + A[s];
                    System.out.print(s + 2 + " Thus position " + (s + 2) + " Converts to4 == >>> :  " + valueX + "\n");
               
                          } 
            //////////////////////////////////////////////////////////////////////////////////////////////////////
            if ((A[s + 1] - A[s]) != 1) {
                System.out.print(s + 1 + "- # Failed T5: BAD-GAP at Position : ");
                System.out.print(s + 1 + "\t");
                System.out.print(A[s] + " And " + A[s + 1] + "\n");
                valueX = 1 + A[s];
                System.out.print(s + 2 + " Thus Position " + (s + 2) + " is changed5 == >>> :  " + valueX + "\n");
                break;
            } else {
                valueX = 1 + A[sizeX - 1];
                System.out.print(s + 1 + "-#6 PASSED All five tests : " + "\n");
                System.out.print(s + 1 + " th iteration =" + (sizeX + 1) + " completes#6 by == >>> :  " + valueX + "\n");

            }
     }
return valueX; 
}
}
