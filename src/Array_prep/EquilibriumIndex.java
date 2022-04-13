package Array_prep;

import java.util.NoSuchElementException;

public class EquilibriumIndex {

    static int FindEquilibriumIndex(int[] arr, int len){

        int []leftSum = new int[len], rightSum = new int[len];
        leftSum[0] = arr[0];
        rightSum[len-1] = arr[len-1];

        for( int i=1, j=len-2; i<len; i++, j--) {
            leftSum[i] = arr[i] + leftSum[i - 1];
            rightSum[j] = arr[j]+rightSum[j+1];
        }

        for( int i=1; i<len-1; i++) {
            if (leftSum[i] == rightSum[i])
                return i;
        }

    throw new NoSuchElementException("No such Index available");
    }

    public static void main(String[] args) {

        int[] arr = {60,3,15,30,5,10};

        try{
            System.out.println(FindEquilibriumIndex(arr,arr.length));
        }
        catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        }
    }
}