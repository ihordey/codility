package binary_gap.my_opinion;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class LoopConversionTest {
    LoopConversion conversion = new LoopConversion();

    @Test
    public void convert() {
        assertThat(conversion.convert(17), is(10001L));
    }
}