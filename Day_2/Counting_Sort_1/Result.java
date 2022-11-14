public class Result {
     /*
     * Complete the 'countingSort' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> countingSort(List<Integer> arr) {
        // Write your code here
        Collections.sort(arr);
        List<Integer> arrResult = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            arrResult.add(Collections.frequency(arr, i));
        }
        
        return arrResult;

    }
}
