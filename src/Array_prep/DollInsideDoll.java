package Array_prep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.stream.Stream;

public class DollInsideDoll {

    static int DollCount (int[]arr){

        int count =0;
        Map<Integer,Integer> dollMap= new HashMap<>();
        for(int a: arr){
            dollMap.put(a,dollMap.getOrDefault(a,0)+1);
            int val = dollMap.get(a);
            count = Math.max(count,val);
        }
        return count;
    }



    public static void main(String[] args)throws IOException {

        BufferedReader buff =new BufferedReader(new InputStreamReader(System.in));
        int[] arr = Stream.of(buff.readLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
        int count = DollCount(arr);
        System.out.println("No of dolls left = "+count);

    }
}