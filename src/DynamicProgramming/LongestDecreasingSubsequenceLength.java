package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 *@author = Pratyush
 */
public class LongestDecreasingSubsequenceLength {

    public static int DIS(List<Integer> input, int n ){

        List<Integer> ldsArr = new ArrayList<>();

        for(int i = 0;i<n;i++)
            ldsArr.add(1);

        for(int i = n-2;i>=0;i--)
            for (int j = n-1; j >i; j--) {
                int a;
                if (input.get(i) > input.get(j) && ldsArr.get(i)<=(a=ldsArr.get(j)))
                    ldsArr.set(i,a+1);
            }
        System.out.println(ldsArr);
        return Collections.max(ldsArr);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> input = Arrays.stream(br.readLine().trim().split("\\s+"))
                                .map(Integer::valueOf)
                                .collect(Collectors.toList());

        System.out.println(DIS(input, input.size()));

    }
}