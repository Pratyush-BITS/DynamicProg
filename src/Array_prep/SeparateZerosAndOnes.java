package Array_prep;

/*  You're given an array of 0's and 1's.
    Separate them in such a way that 0's are on the left and 1's are on the right
    TC : O(n)
 */

public class SeparateZerosAndOnes {

    static int[] Separator(int[] arr, int len){

        for (int i=0,j=len-1;i<=j;){

            int leftPointer = arr[i], rightPointer = arr[j];
            if(leftPointer==1 && rightPointer==0){
                arr[i++] = rightPointer;
                arr[j--] = leftPointer;
            }
            if (leftPointer == 0) i++;
            if (rightPointer == 1) j--;
        }
        return arr;
    }

    public static void main(String[] args) {

        int []arr = {1,0,1,1,0,1,1,0,0,0,1,0,1,0,1,0,0,0,1,1,1,0,0,0,1,1,0,1,1,0,1};
        int[] ans = Separator(arr, arr.length);

        for (int a:ans)
            System.out.print(a+" ");

    }
}