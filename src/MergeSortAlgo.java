import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Stream;

public class MergeSortAlgo {

    void mergeSort(int []arr, int l,int m, int r){

        int n1 = m - l + 1;
        int n2 = r - m;

        int []L= new int[n1];
        int []R = new int[n2];

        if (n1 >= 0) System.arraycopy(arr, l, L, 0, n1);
        if (n2 >= 0) System.arraycopy(arr, m+1, R, 0, n2);


        int i = 0, j = 0;
        int k =l;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i<n1)
            arr[k++] = L[i++];

        while (j < n2)
            arr[k++] = R[j++];


    }

    void sort(int []arr, int l, int r)
    {
        if (l < r) {
            int m =l+ (r-l)/2;

            sort(arr, l, m);
            sort(arr, m + 1, r);

            mergeSort(arr, l, m, r);
        }
    }


    final static BufferedReader buff =new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {

        int []arr = Stream.of(buff.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        MergeSortAlgo obj =new MergeSortAlgo();
        obj.sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

}
