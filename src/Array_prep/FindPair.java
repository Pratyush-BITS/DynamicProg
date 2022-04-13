package Array_prep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class FindPair {

    static List<Integer> FindPairValues(int[] arr, int sum){
        List<Integer> ans = new ArrayList<>();
        Set<Integer> set =new HashSet<>();

        for (int val : arr) {
            int num = sum - val;
            if (!set.contains(num))
                set.add(val);
            else {
                ans.add(val);
                ans.add(num);
            }
        }
        return ans;
    }

    static List<Integer> FindPairIndices(int[] arr, int sum){
        List<Integer> ansIndex = new ArrayList<>();
        Map<Integer,Integer> map =new HashMap<>();
        int len = arr.length;

        for (int i = 0; i < len; i++) {
            int val =arr[i], num = sum - val;
            if(map.containsKey(num)) {
                ansIndex.add(i);
                ansIndex.add(map.get(num));
            }
            else
                map.put(val,i);
        }
        return ansIndex;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int []arr = {1,3,5,2,6,8,9,4,0};
        int sum = Integer.parseInt(br.readLine().trim());//8

        List<Integer> ansValues = FindPairValues(arr,sum);
        List<Integer> ansIndices = FindPairIndices(arr,sum);
        int len = ansValues.size(); // = ansIndices.size();

        //for values
        for (int i = 0; i < len; )
            System.out.println(ansValues.get(i++)+" is paired with "+ansValues.get(i++));

        //for Indices(can be used for values too)
        for (int i = 0; i < len; )
            System.out.println("Index "+ansIndices.get(i++)+" is paired with index "+ansIndices.get(i++));

    }
}