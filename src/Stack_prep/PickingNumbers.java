package Stack_prep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class PickingNumbers {

    public static int pickingNumbers(List<Integer> a) {
        int count =0;
        Map<Integer,Integer>map =new TreeMap<>();

        for (int ele:a){
            map.computeIfPresent(ele,(key,val)->++val);
            map.putIfAbsent(ele,1);
        }
        System.out.println(map);

        List<Map.Entry<Integer,Integer>> list = new LinkedList<>(map.entrySet());
        int len = list.size();

        if(len ==1)
            return list.get(0).getValue();

        for (int i=1;i<len;i++){
            Map.Entry<Integer,Integer> one = list.get(i-1);
            int oneVal = one.getValue();
            count = Math.max(count,oneVal);
            Map.Entry<Integer,Integer> two = list.get(i);
            int twoVal = two.getValue();
            count = Math.max(count,twoVal);
            if(two.getKey()-one.getKey() <2)
               count= Math.max(count,one.getValue()+two.getValue());
        }

        return count;
    }

    public static void main(String[] args)throws IOException {
        Integer []arr ={1,2,2,3,1,2};
        System.out.println(pickingNumbers(Arrays.asList(arr)));
        arr =new Integer[]{4,6,5,3,3,1};
        System.out.println(pickingNumbers(Arrays.asList(arr)));
        arr =new Integer[]{4, 2, 3, 4, 4, 9, 98, 98, 3, 3, 3, 4, 2, 98, 1, 98, 98, 1, 1, 4, 98, 2, 98, 3, 9, 9, 3, 1, 4, 1, 98, 9, 9, 2, 9, 4, 2, 2, 9, 98, 4, 98, 1, 3, 4, 9, 1, 98, 98, 4, 2, 3, 98, 98, 1, 99, 9, 98, 98, 3, 98, 98, 4, 98, 2, 98, 4, 2, 1, 1, 9, 2, 4};
        System.out.println(pickingNumbers(Arrays.asList(arr)));

        List<Integer> a =  Arrays.stream(new BufferedReader(new InputStreamReader(System.in)).readLine().split(" "))
                .map(Integer::valueOf)
                .collect(Collectors.toList());
        System.out.println(pickingNumbers(a));

    }
}
