package Array_prep;

/*  You're given a sorted array.
    WAP to find the first pair of numbers whose sum is closest to zero.
    TC : O(n)
    SC : O(1)
 */

public class ClosestToZeroSum {

    static int[] FindElements(int []arr, int len){

        int []ans =new int[2];
        int curSum , closeSum = Integer.MAX_VALUE, rightP = len-1, leftP = 0;
        while(leftP < rightP) {

            curSum = arr[leftP] + arr[rightP];
            if (curSum == 0)
                return new int[]{leftP, rightP};


            if(Math.abs(closeSum)>=Math.abs(curSum)){
                closeSum = curSum;
                ans[0] = leftP;
                ans[1] = rightP;
            }

            if(curSum>0)
                rightP--;
            else
                leftP++;

        }
        return ans;
    }

    public static void main(String[] args) {

        int []arr = {-5, -2, 1, 3, 6, 9};
        int[] ans = (FindElements(arr,arr.length));
        for(int a: ans)
            System.out.print(a+" ");

    }
}