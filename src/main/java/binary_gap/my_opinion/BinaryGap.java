package binary_gap.my_opinion;

class BinaryGap {

    int solution(int n) {
        int gapCount = 0;
        int currentGapCount = 0;
        boolean started = false;
        while (n > 0) {
            if (n % 2 == 1) {
                gapCount = Math.max(currentGapCount, gapCount);
                currentGapCount = 0;
                started = true;
            } else if (started) {
                currentGapCount++;
            }
            n = n / 2;
        }
        return gapCount;
    }

}
