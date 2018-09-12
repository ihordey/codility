package сyclicRotation.my_opinion;

import org.junit.Before;
import org.junit.Test;
import сyclicRotation.Solution;
import сyclicRotation.SolutionJava8;
import сyclicRotation.Strategy;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CyclicRotationTest {
    private List<Strategy> strategies = new ArrayList<>();

    @Before
    public void setUp() {
//        strategies.add(new CyclicRotation());
//        strategies.add(new Solution());
        strategies.add(new SolutionJava8());
    }

    @Test
    public void rotateZeroCollection() {
        final int[] source = {0, 0, 0};
        executeStrategy(source, 1, source);
    }

    @Test
    public void rotateSourceByThreeSteps() {
        executeStrategy(new int[]{3, 8, 9, 7, 6}, 3, new int[]{9, 7, 6, 3, 8});
    }


    @Test
    public void rotateWithOneLoop() {
        executeStrategy(new int[]{1, 2, 3, 4}, 4, new int[]{1, 2, 3, 4});
    }

    private void executeStrategy(int[] source, int step, int[] expectedResult) {
        strategies.forEach(strategy -> {
            System.out.println(strategy.getClass());
            assertThat(strategy.solution(source, step), is(expectedResult));
        });
    }
}