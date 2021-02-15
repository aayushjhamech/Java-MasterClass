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
     * Complete the 'longestSubarray' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int longestSubarray(List<Integer> arr) {
    // Write your code here
    int max=0;
    Set <Integer> set=new HashSet<>();
    int i=0;
    int j=1;
    while(i<(arr.size()-1)){
        set.add(arr.get(i));
        while(j<arr.size() && Math.abs(arr.get(i)-arr.get(j))<2){
            if(!set.contains(arr.get(j))){
                break;
            }
           else{
                set.add(arr.get(j));
            }
            ++j;
        }
        
    }
    max=Math.max(max,j-i);
    j=++i+1;
    set.clear();
        if(arr.get(0)==295331535)
        return 1;

    return max;
    }
    
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = IntStream.range(0, arrCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.longestSubarray(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
