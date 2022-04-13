package DynamicProgramming;

/**
 * Using Kadane's algorithm to calculate the maximum contiguous SubArray sum
 * with starting and Ending index
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 *@author = Pratyush
 */
public class MaximumContiguousSubArray {

    public static void main(String[] args) throws IOException {

        int maxSumSoFar=0, currentSum =0,endIndex=0,startIndex=0,tempSI = 0;
        BufferedReader bufferedReader =new BufferedReader(new InputStreamReader(System.in));

        int[] arr = Arrays.stream(bufferedReader.readLine()
                .split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int len=arr.length;

        for(int i=0;i<len;i++){
            currentSum = Math.max(arr[i]+currentSum,0);
            if(currentSum>maxSumSoFar) {
                maxSumSoFar = currentSum;
                startIndex = tempSI;
                endIndex= i;
            }
            if(maxSumSoFar==0)
                tempSI = i+1;
        }

        System.out.println("MaxSubArray starts at "+startIndex+" & ends at "+endIndex);

    }
}