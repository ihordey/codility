package binary_gap.my_opinion;

public class RecursionConversion implements Conversion {

    @Override
    public long convert(int n) {
        return n == 0 ? 0 : (n % 2 + 10 * convert(n / 2));
    }
}
