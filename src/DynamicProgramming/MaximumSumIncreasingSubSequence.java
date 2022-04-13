package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
/**
 *@author = Pratyush
 */
public class MaximumSumIncreasingSubSequence {

    public static void main(String[] args) throws IOException {

        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int[] arr = Arrays.stream(br.readLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int len =arr.length;
        int[] sum =new int[len];

        sum[0]=arr[0];
        for(int i=1;i<len;i++)
            for(int j=i-1;j>=0;j--){
                int a=arr[i]+sum[j];
                if(arr[i]>arr[j] && sum[i]<a)
                    sum[i] = a;
                else if(sum[i]==0)
                    sum[i]=arr[i];
            }

        //Arrays.sort(sum);
        System.out.println(Arrays.toString(sum));

    }

}
