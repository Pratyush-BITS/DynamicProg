package Array_prep;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class SumOfThreeNum {

    static int[] FindThreeNumbers(int []arr,int len, int target)  {

        for (int i=0;i<len;i++) {
            int first = arr[i];
            for (int left = i + 1, right = len - 1; left < right; ) {
                int second = arr[left];
                int third = arr[right];
                int sum = first + second+third;
                if(sum==target)
                    return new int[]{first,second,third};
                if(sum<target)
                    left++;
                else
                    right--;
            }
        }
        throw new NoSuchElementException("No elements that adds up to give "+target);
    }

    public static void main(String[] args)  {

        int[] arr = {1, 3, 5, 2, 6, 8, 9, 4, 0};
        int target = 26;
        Arrays.sort(arr);

        try {
            int[] ans = FindThreeNumbers(arr, arr.length, target);
            System.out.print("ans = ");
            for (int a: ans)
                System.out.print(a+" ");
        }
        catch(NoSuchElementException e){
            System.out.println(e.getMessage());
        }
    }
}
