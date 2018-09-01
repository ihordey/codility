package binary_gap.my_opinion;

public class LoopConversion implements Conversion {

    @Override
    public long convert(int n) {
        double result = 0;
        int i = 0;
        while (n > 0) {
            result = n % 2 + Math.pow(10, i);
            n = n / 2;
            i++;
        }
        return Math.round(result);
    }
}
