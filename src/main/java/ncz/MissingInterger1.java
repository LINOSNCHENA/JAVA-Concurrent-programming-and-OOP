package ncz;
//  Hunderd Percentage Result
import java.util.HashSet;
import java.util.Set;

public class MissingInterger1 {

    public int solution(int[] A) {
        int smallestMissingInteger = 1;
        if (A.length == 0) {
            return smallestMissingInteger;
        }
        Set<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < A.length; i++) {
            if (A[i] > 0) {
                set.add(A[i]);
            }
        } // FIRST
        while (set.contains(smallestMissingInteger)) {
            smallestMissingInteger++;
        } // SECOND
        return smallestMissingInteger;
    
    }
    
}
