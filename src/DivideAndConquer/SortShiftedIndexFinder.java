package DivideAndConquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SortShiftedIndexFinder {

    private static int PivotIndex(int[] arr,int mid ,int firstIndex,int lastIndex){

        if(arr[firstIndex]<arr[lastIndex])
            return lastIndex;

        int midEle = arr[mid];
        int beforeMid = arr[mid-1];
        int afterMid  = arr[mid+1];

        if(beforeMid>midEle)
            return mid-1;
        else if(midEle>afterMid)
            return mid;
        else if(arr[firstIndex] > afterMid)
            return PivotIndex(arr,mid/2,firstIndex,mid);
        else
            return PivotIndex(arr,(lastIndex+mid)/2,mid,lastIndex);

    }

    final static BufferedReader buff =new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {

//        int[] arr = Stream.of(buff.readLine().split(" "))
//                    .mapToInt(Integer::parseInt).toArray();
//        int lastIndex = arr.length-1;
//        int pivotIndex = PivotIndex(arr,lastIndex/2,0,lastIndex);
//        System.out.println("The pivoting Index is "+pivotIndex+" and the element is "+ arr[pivotIndex]);

        double a =  7.99;
        System.out.println(a+1);

    }
}