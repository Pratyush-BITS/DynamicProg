package Extra;

import java.io.IOException;
import java.util.Scanner;

public class ArrayManipulation {

    static long arrayManipulation(int n, int[][] queries) {

            long []arr = new long[n];
            long ans = 0, temp =0;

            for (int[] q :queries){

                int start = q[0]-1;
                int stop = q[1];
                int val = q[2];

                arr[start] += val;
                if(stop<n)
                    arr[stop] -= val;
            }

            for(long ele:arr) {
                temp += ele;
                ans = Math.max(ans,temp);
            }
        return ans;
    }

    public static void main(String[] args)throws IOException {

        final Scanner scanner = new Scanner(System.in);

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        int[][] queries = new int[m][3];

        for (int i = 0; i < m; i++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int queriesItem = Integer.parseInt(queriesRowItems[j]);
                queries[i][j] = queriesItem;
            }
        }

        System.out.println(arrayManipulation(n, queries));

    }

}
