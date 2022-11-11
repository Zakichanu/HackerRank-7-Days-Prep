import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
    long maxSum = 0;
    long minSum = 0;
    
    
    for (int i = 0; i < arr.size(); i++) {
        long operation = 0;
        for (int j = 0; j < arr.size(); j++) {
            if(j != i){
                operation += arr.get(j);
            }
        }
        if(maxSum == 0 && minSum == 0){
            maxSum = operation;
            minSum = operation;
        } else if(operation > maxSum){
            maxSum = operation;
        }else if(operation < minSum){
            minSum = operation;
        }
    }

    
    System.out.println(minSum + " " + maxSum);
    

    }

}
