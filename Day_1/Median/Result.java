package Day_1.Median;

import java.util.Collections;
import java.util.List;

public class Result {
    /*
     * Complete the 'findMedian' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */
    public static int findMedian(List<Integer> arr) {
        // Write your code here
        Collections.sort(arr);
        int median = 0;
        if (arr.size() % 2 == 1) {
            median = arr.get((arr.size() + 1) / 2 - 1);
        }
        return median;
    }
}
