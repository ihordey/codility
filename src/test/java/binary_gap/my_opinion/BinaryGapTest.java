package binary_gap.my_opinion;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class BinaryGapTest {
    final BinaryGap binaryGap = new BinaryGap();

    @Test
    public void gapInMiddle() {
        // DEX 17  is BIN 10001L
        assertThat(binaryGap.solution(17), is(3));
    }

    @Test
    public void manyGaps() {
      //DEX 529 s BIN 1000010001
        assertThat(binaryGap.solution(529), is(4));
    }

    @Test
    public void oneGap() {
        //DEX 20 s BIN 10100
        assertThat(binaryGap.solution(20), is(1));
    }

    @Test
    public void noGapAllSingnIsOne() {
        //DEX 15 s BIN 1111
        assertThat(binaryGap.solution(15), is(0));
    }

    @Test
    public void firstIsOneAfterAllZero() {
        //DEX 32 s BIN 100000
        assertThat(binaryGap.solution(32), is(0));
    }
}