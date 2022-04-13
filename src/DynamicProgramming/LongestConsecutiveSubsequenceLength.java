package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSubsequenceLength {

    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

        int[] arr = Arrays.stream(br.readLine().trim().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int ans =1;

        Set<Integer> set = new HashSet<>();
        Arrays.stream(arr).forEach(set::add);

        for (int k : arr)
            if (!set.contains(k - 1)) {
                int j = k;
                while (set.contains(j))
                    j++;

                ans=Math.max(ans,j-k);
            }

        System.out.println("Length of longest subsequence : "+ans);

    }

}