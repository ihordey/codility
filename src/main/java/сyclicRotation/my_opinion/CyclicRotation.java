package сyclicRotation.my_opinion;

import сyclicRotation.Strategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CyclicRotation  implements Strategy {

    public int[] solution(final int[] source, final int steps) {
        if (source == null || source.length == 0) {
            return new int[]{};
        }
        int size = source.length;
        List<Integer> result = new ArrayList<>();
        int concreteSteps = steps >= size ? size % steps : steps;
        for (int i = size - 1, j = 0; j != concreteSteps; i--, j++) {
            result.add(source[i]);
        }
        Collections.reverse(result);
        for (int i = 0; i < size - concreteSteps; i++) {
            result.add(source[i]);
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
