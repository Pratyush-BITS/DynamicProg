package Array_prep;

/*  You're given an Array of n elements and there is one faulty number among them.
    A faulty number is a number which occurs odd number of times.
    Complete the Imposter function to find the faulty number.
    Note: No element in the array is 0.
 */

public class FaultyNumber {

    static int FindImposter(int []arr){
        int faultyNum =0;
        for (int ele : arr)
            faultyNum ^= ele;

        return faultyNum;
    }

    public static void main(String[] args) {

        int []arr={1,4,2,6,5,7,2,1,6,7,5,7,3,4,1,5,7,3,2,6,5,1,2,6,5,7,1,6,7,6,1};
        System.out.println(FindImposter(arr));

    }
}