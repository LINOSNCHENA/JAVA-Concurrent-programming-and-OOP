package ncz;
// 1000 Percentaage
public class MissingInteger {

  public int solution(int[] A) {
    int max = A.length;
    int numbInput = 1;
    boolean[] bitmap = new boolean[max + 1];


    for (int i = 0; i < A.length; i++) {
        if (A[i] > 0 && A[i] <= max) {
            bitmap[A[i]] = true;
        }

        if (A[i] > numbInput) {
            numbInput = A[i];
        }
    }// FIRST


    for (int i = 1; i < bitmap.length; i++) {
        if (!bitmap[i]) {
            return i;
        }
    }  // SECOND

    return (numbInput+1);
}
    
}
