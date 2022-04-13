package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *@author = Pratyush
 */
public class PerfectHillSequenceLength {

    static int PHS(List<Integer> input,int n) {

        List<Integer> lis = new ArrayList<>();
        List<Integer> lds = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            lis.add(0);
            lds.add(0);
        }


        for (int i = 1; i < n; i++)
            for (int j = 0; j < i; j++) {
                int a;
                if (input.get(i) > input.get(j) && lis.get(i) <= (a = lis.get(j)))
                    lis.set(i, a + 1);
            }

        for (int i = n - 2; i >= 0; i--)
            for (int j = n-1; j > i; j--) {
                int a;
                if (input.get(i) > input.get(j) && lds.get(i) < (a = lds.get(j)+1))
                lds.set(i, a);
            }

        int index=-1,lenHill=0;
        System.out.println(lis+"\n"+lds);
        for (int i = 0;i < n; i++){
            int a;
            if((a=lis.get(i))==lds.get(i) && a!=0) {
                index = (a * 2 + 1 > lenHill) ? i : index;
                lenHill = a * 2 + 1;
            }
        }

        return index;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> input = Arrays.stream(br.readLine().trim().split("\\s+"))
                                .map(Integer::valueOf)
                                .collect(Collectors.toList());

        System.out.println(PHS(input,input.size()));

    }

}
