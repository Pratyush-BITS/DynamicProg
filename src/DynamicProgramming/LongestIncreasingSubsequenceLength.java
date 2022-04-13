package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *@author = Pratyush
 */
public class LongestIncreasingSubsequenceLength {

    private static int LIS(List<Integer> input, int n){
        List<Integer> lisArr = new ArrayList<>();
        for (int i=0;i<n;i++)
            lisArr.add(1);

        for(int i=1;i<n;i++)
            for(int j=0;j<i;j++){
                int a;
                if(input.get(i)>input.get(j) && lisArr.get(i)<=(a=lisArr.get(j))) {
                    lisArr.set(i, a + 1);
                    System.out.println(lisArr);
                }
            }
        return Collections.max(lisArr);
    }


    public static void main(String[] args)  throws IOException {

//        String a = "PratyushSinha", b= "ush";
//
//        int Li = a.indexOf(b);
//        System.out.println(Li);
//
//        System.out.println(a.substring(0,Li)+a.substring(Li+b.length()));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Scanner sc =new Scanner(System.in);

        //String[] arr = sc.nextLine().split(" ");

        List<Integer> input = Stream.of(sc.nextLine().trim().split("\\s+"))
                            .map(Integer::valueOf)
                            .collect(Collectors.toList());

        int n =sc.nextInt();
        int m = sc.nextInt();
        Collections.reverse(input);
        System.out.println(input);
        Collections.replaceAll(input, 1, 5);
        System.out.println(input);
//                System.out.println(LIS(input, input.size()));

    }
}