package DivideAndConquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class MajorityElement {

    private static int majorityElement(int[]arr){

        int lastIndex = arr.length-1;
        if (lastIndex == 0)
            return arr[0];

        int nby2Plus1Index = arr.length/2;

        for (int i=0;nby2Plus1Index<=lastIndex;i++,nby2Plus1Index++ )
            if (arr[i]== arr[nby2Plus1Index])
                return arr[i];

        return -1;
    }

    public static void main(String[] args)throws IOException {
        int []arr = {1,2,3,3,3,3,3,10,10,10,10,10,10,10,10};
        System.out.println(majorityElement(arr));
        arr = new int[]{1,1,1,1,1,1,1, 3, 3, 3,10,10,10};
        System.out.println(majorityElement(arr));
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        arr = Stream.of(buff.readLine().split(" ")).mapToInt(Integer::valueOf).toArray();
        System.out.println(majorityElement(arr));
    }
}