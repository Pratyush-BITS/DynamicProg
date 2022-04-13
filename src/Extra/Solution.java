package Extra;

import java.util.LinkedHashMap;
import java.util.Map;

public class Solution {

    static void sherlockAndAnagrams(String s) {

        int len = s.length();

        Map<String,Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < len; i++)
            for (int j = i; j <= len; j++) {
                int minIndex = Math.min(i,j);
                int maxIndex = Math.max(i,j);
                if(maxIndex!=minIndex) {
                    String a = s.substring(minIndex, maxIndex);
                    System.out.println(a+" "+minIndex+","+(maxIndex-1));
                    map.computeIfPresent(a, (key, val) -> ++val);
                    map.putIfAbsent(a, 0);
                }
            }

        int count =0;

        for(int ele:map.values())
            if(ele>0)
                count+=ele;

        System.out.println(map);
        System.out.println(count);


    }

    static int gcd(int a, int b)
    {
        if (a == 0)
            return b;
        if (b == 0)
            return a;

        if (a == b)
            return a;

        if (a > b)
            return gcd(a%b, b);
        return gcd(a, b%a);
    }



    public static void main(String[] args) {

        //sherlockAndAnagrams("kkkk");

        System.out.println(gcd(12,56));

    }

}
