package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LargestBitonicSubsequenceLength {

    static int LBS(List<Integer> input,int len){

        List<Integer> lis=new ArrayList<>();
        List<Integer> lds=new ArrayList<>();

        for (int i = 0; i < len; i++) {
            lis.add(1);
            lds.add(1);
        }

        for (int i = 1; i < len; i++)
            for (int j = 0; j < i; j++) {
                int a;
                if(input.get(i)>input.get(j) && lis.get(i)<(a=lis.get(j)+1))
                    lis.set(i,a);
            }

        for (int i = len-2; i >= 0; i--) {
            for (int j = len-1; j > i; j--) {
                int a;
                if(input.get(i) > input.get(j) && lds.get(i)< (a=lds.get(j)+1))
                    lds.set(i,a);
            }
        }
        System.out.println(lis+"\n"+lds);

        int max=0;

        for (int i = 0; i < len; i++) {
            int temp = lis.get(i)+lds.get(i)-1;
            max=Math.max(max,temp);
        }
        return  max;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> input = Arrays.stream(br.readLine().trim().split("\\s"))
                                .map(Integer::valueOf)
                                .collect(Collectors.toList());

        System.out.println(LBS(input,input.size()));

    }
}
