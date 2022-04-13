package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayReverse {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine().trim());
        while(n-->0){
            int len = Integer.parseInt(br.readLine().trim())-1;

            List<Integer> arr = Arrays.stream(br.readLine().trim().split("\\s+"))
                    .map(Integer::valueOf)
                    .collect(Collectors.toList());

            int sum=0;
            while (len-2>=-1) {
                sum += Math.pow(arr.get(len--), 2);
                sum -= Math.pow(arr.get(len--), 2);
            }
            if(len==0)
                sum+=Math.pow(arr.get(len--),2);

            System.out.println(sum);
        }
    }

}
