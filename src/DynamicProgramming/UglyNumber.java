package DynamicProgramming;

/**
 WAP to find the kth ugly number
 If input =1...6 return the value as they're continuous ugly set {1,2,3,4,5,6}
 For others values a TreeSet is created and no's are added in it till Kth ugly number
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 **
 *@author = Pratyush
 */
public class UglyNumber {

    static long nthUglyNumber(long n){
        if(n==1 || n==2 || n==3 || n==4 || n==5 || n==6)
            return n;

        Set<Long> uglySet=new TreeSet<>();
        uglySet.add(1L);
        n--;

        while (n-->0){
            Iterator<Long> iterator = uglySet.iterator();
            Long x = iterator.next();
            uglySet.remove(x);
            uglySet.add(x*2L);
            uglySet.add(x*3L);
            uglySet.add(x*5L);
            System.out.println(uglySet);
        }

        return uglySet.iterator().next();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine().trim());
        System.out.println(nthUglyNumber(num));
    }
}