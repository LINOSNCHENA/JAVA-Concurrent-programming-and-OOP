package ncz;

public class smallestNumber {
    public static void main(String[] args) {

       //  int ArrayAAA[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 9 }; // Test #1
        // int ArrayAAA[] = { -1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // Test #2
     //   int ArrayAAA[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9,10 }; // Test #3
       int ArrayAAA[] = {-2,-1,1 }; // Test #4
       //  int ArrayAAA[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // Test #5
        // int ArrayAAA[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 9 }; // Test #6

        int d = ArrayAAA.length;
        int largest = ArrayAAA[0];
        int secondLargest = ArrayAAA[0];
        int z = ArrayAAA[0];

        System.out.println("\n =========== FIND-RANGE/OR NEGATIVES/OR-GAP/MinusOne ===============" + "\n");
        for (int s = 0; s < d - 1;s++) {
            if (d > 56) {
                System.out.print(s + 1 + "-#T1 Total Items is : ");
                System.out.print(d + "\t");
                System.out.print("\n");
                z = -1;
                System.out.print(s + 2 + " Thus " + (d) + " Is too Many elements. Return  >>> :  " + z + "\n");
                break;
            }
            if (ArrayAAA[s] < -3 || ArrayAAA[s] > 9 || ArrayAAA[s + 1] < -2 || ArrayAAA[1 + s] > 10) {
                System.out.print(s + 1 + "-#T2 Range -10 to 10 element values : ");
              //  System.out.print(s + 1 + "\t");
                System.out.print(ArrayAAA[s] + "\t");
                System.out.print(ArrayAAA[s+1] + "\t");
                System.out.print("\n");
                z = ArrayAAA[s];
                System.out.print(s + 2 + " Thus " + (z) + " is too Large/or Small. Return >>> : " + (z - 1) + "\n");
                break;
            }
            /////////////////////////////////////////////////////////////////////////////////////////////////
            if (ArrayAAA[s] == 0 && ArrayAAA[s + 1] == 1 && d == 2) {
                System.out.print(s + 1 + "- #T3 BridgeFixed at Position : ");
                System.out.print(s + 1 + "\t");
                System.out.print(ArrayAAA[s] + "\t");
                System.out.print("\n");
                z = 2;
                System.out.print(s + 2 + " THUS POSITION " + (s + 2) + " THEN BECOMES == >>> :  " + z + "\n");
                break;
            } else {
                if (ArrayAAA[s] < 1 && (ArrayAAA[s + 1] - ArrayAAA[s]) != 1) {
                    System.out.print(s + 1 + "- #T4 Negative-Found at Position : ");
                    System.out.print(s + 1 + "\t");
                    System.out.print(ArrayAAA[s] + "\t");
                    System.out.print("\n");
                    z = 1 + ArrayAAA[s];
                    System.out.print(s + 2 + " THUS POSITION " + (s + 2) + " Is CONVERTED TO == >>> :  " + z + "\n");
                    break;
                }
            }
            //////////////////////////////////////////////////////////////////////////////////////////////////////
            if ((ArrayAAA[s + 1] - ArrayAAA[s]) != 1) {
                System.out.print(s + 1 + "- #T5 BAD-GAP at Position : ");
                System.out.print(s + 1 + "\t");
                System.out.print(ArrayAAA[s] + " And " + ArrayAAA[s + 1] + "\n");
                z = 1 + ArrayAAA[s];
                System.out.print(s + 2 + " Thus Position " + (s + 2) + " is changed == >>> :  " + z + "\n");
                break;
            } else {
                z = 1 + ArrayAAA[d-1];
                System.out.print(s + 1 + "-#T6 No-Negative  or GAP found or Passed 5 Tests : " + "\n");
                System.out.print(s + 2 + " Thus Position " + (s + 2) + " is Completed by == >>> :  " + z + "\n");
              //  break;

            }
           // break;
        }
        System.out.println("\n ================== RESULTS PRODUCED =================" + "\n");
        for (int i = 0; i < d; i++) {
            if (ArrayAAA[i] > largest && ArrayAAA[i] > secondLargest) {
                secondLargest = largest; // yes, the largest is demoted second
                largest = ArrayAAA[i];
            } else if (ArrayAAA[i] > secondLargest) {
                secondLargest = ArrayAAA[i]; // yes is further demoted to third!
            }
        }

        System.out.print("\n Replacement value is :" + z);
        System.out.print("\n First largest unit is:" + largest);
        System.out.println("\n Second largest unit is:" + secondLargest + "\n");
        System.out.println("===================== SUMMARY ====================");
        System.out.print("\n First unit is:" + ArrayAAA[0]);
        // 2nd element because index starts from 0
        System.out.println("\n Last unit is:" + ArrayAAA[d - 1] + "\n");
        // 1st element because index starts from 0
        System.out.println("======================= END =======================" + "\n");
    }
}
