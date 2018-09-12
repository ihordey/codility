package сyclicRotation;

public class Solution implements Strategy {

    public int[] solution(int[] A, int K) {
        int[] new_array = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            int new_position = (i + K) % A.length;
            new_array[new_position] = A[i];
        }
        return new_array; // return new array
    }
}
