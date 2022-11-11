import java.util.List;

public class Result {
    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here
        int countPositive = 0;
        int countNegative = 0;
        int countZero = 0;
        
        for (Integer integer : arr) {
            if(integer > 0){
                countPositive++;
            }else if(integer < 0){
                countNegative++;
            }else{
                countZero++;
            }
        }
        
        
        float ratioPositive = (float) countPositive / arr.size();
        System.out.printf("%.6f\n", ratioPositive);
        float ratioNegative = (float) countNegative / arr.size();
        System.out.printf("%.6f\n", ratioNegative);
        float ratioZero = (float) countZero / arr.size();
        System.out.printf("%.6f\n", ratioZero);
            
    }
}