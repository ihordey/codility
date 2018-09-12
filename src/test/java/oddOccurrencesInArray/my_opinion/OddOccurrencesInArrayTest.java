package oddOccurrencesInArray.my_opinion;

import org.junit.Test;

import static oddOccurrencesInArray.my_opinion.OddOccurrencesInArray.mySolution;
import static oddOccurrencesInArray.my_opinion.OddOccurrencesInArray.xorSolution;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class OddOccurrencesInArrayTest {

    private static final int[] VALUES = {9, 3, 9, 3, 9, 7, 9};

    @Test
    public void mySolutionTest() {
        assertThat(mySolution(VALUES), is(7));
    }

    @Test
    public void xorSolutionTest() {
        assertThat(xorSolution(VALUES), is(7));
    }
}