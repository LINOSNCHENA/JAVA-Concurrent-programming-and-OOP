package exams;

public class Solution2 {
    // you can write to stdout for debugging purposes, e.g.
    // System.out.println("this is a debug message");
    public static int[] solution(int[] A) {
        int[] AB = { 8 };
        for (int i = 0; i < 4; i++) {

            System.out.println(A[i]);
            if (A[i] > 4) {
                AB[1] = A[i];

            }
        }
        return AB;
    }
}
