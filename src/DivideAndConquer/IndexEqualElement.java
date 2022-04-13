package DivideAndConquer;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class IndexEqualElement {

    private int findMirrorIndex(int[] arr, int start, int end){

        int mid;
        int midElement;
        while (end>start){

            mid = (start+end)/2;
            midElement = arr[mid];

            if( midElement == mid )
                return mid;
            else if( mid > midElement )
                start = mid+1;
            else
                end = mid -1;

        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr = Stream.of(sc.nextLine().trim().split(" ")).sorted()
                    .mapToInt(Integer::parseInt).toArray();
        IndexEqualElement iee = new IndexEqualElement();
        int start = 0;
        int end = arr.length - 1;
        System.out.println(Arrays.toString(arr));
        int a = iee.findMirrorIndex(arr,start,end);
        System.out.println(a);
    }

}
