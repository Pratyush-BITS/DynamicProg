package DynamicProgramming;

/*
    Given a sorted array, find the element which occurs more that half it's length//
    Logic:
    Find the lowerIndex for the element X to be checked.
    If the value in the array at higherIndex i.e. lowerIndex + len/2 is same as X return true
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 @author = Pratyush
 */
public class MajorityElement {

    static int lower_bound(int[] arr,int low,int high,int X){

        if(low>high)
            return low;

        int mid = low + (high-low)/2;
        System.out.println(+low +" "+mid+" "+high);
        System.out.println("arr[mid] = "+arr[mid]+" "+ (arr[mid]>=3));
        if(arr[mid] >= X)
            return lower_bound(arr,low,mid-1,X);

        return lower_bound(arr,mid+1,high,X);
    }

    static boolean IsMaxElement(int[] arr,int len,int X){

        int indexLow,indexHigh;
        if(arr[0]==X)
            indexLow = 0;
        else
            indexLow = lower_bound(arr,0,len,X);

        indexHigh = indexLow+len/2;
        System.out.println("low = "+indexLow+" high = "+indexHigh);

        return indexHigh<len && arr[indexHigh]==X;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

        int[] arr = Arrays.stream(br.readLine().split("\\s+"))
                .mapToInt(Integer::parseInt).sorted()
                .toArray();

        int X = Integer.parseInt(br.readLine());

        System.out.println(IsMaxElement(arr,arr.length,X));
    }
}