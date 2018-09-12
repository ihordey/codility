package oddOccurrencesInArray.my_opinion;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

class OddOccurrencesInArray {

    static int mySolution(final int[] values) {
        Map<Integer, List<Integer>> valueIndexMap = new LinkedHashMap<>();
        for (int i = 0; i < values.length; i++) {
            valueIndexMap.computeIfAbsent(values[i], l -> new ArrayList<>()).add(i);
        }

        for (Map.Entry<Integer, List<Integer>> entry : valueIndexMap.entrySet()) {
            if (entry.getValue().size() == 1) {
                return entry.getKey();
            }
        }
        return -1;
    }

    // Time: O(N)
    // Space: O(1)
    static int xorSolution(int[] values) {
        int result = 0;
        for (int value : values) {
            result ^= value;
        }
        return result;
    }
}
