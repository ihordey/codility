package сyclicRotation;

import java.util.stream.IntStream;

public class SolutionJava8 implements Strategy {

    public int[] solution(final int[] source, final int steps) {
        int[] result = new int[source.length];
        IntStream.range(0, source.length)
                .forEach(i -> result[(i + steps) % source.length] = source[i]);
        return result;
    }
}
