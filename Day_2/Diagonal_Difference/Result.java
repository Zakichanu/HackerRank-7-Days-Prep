public class Result {
    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int firstDiag = 0, secondDiag = 0;
        
        // Implementing firstDiag and secondDiag
        for (int i = 0; i < arr.size(); i++) {
            // Adding to firstDiag
            firstDiag += arr.get(i).get(i);
            
            // Reversing the array of i
            Collections.reverse(arr.get(i));
            
            // Adding to secondDiag
            secondDiag += arr.get(i).get(i);
        }
        
        return Math.abs(firstDiag - secondDiag);
    }
}
