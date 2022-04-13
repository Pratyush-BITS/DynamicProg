package Array_prep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class CountValues {

    int[] countElementValue(int []arr){
        int len =arr.length;
        int []count = new int[11];
        for (int a : arr)
            count[a] += 1;
        return count;
    }

    public static void main(String[] args)throws IOException {

        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        CountValues cv =new CountValues();
        int[] arr = Stream.of(buff.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] ans = cv.countElementValue(arr);
        for (int i=0;i<ans.length;i++)
            if(ans[i]>0)
                System.out.println(i+" : "+ans[i]);
    }
}