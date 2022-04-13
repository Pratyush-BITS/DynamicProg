package Extra;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BetweenTwoSets {

    private static int GCD(int a,int b){
        if (a==0)
            return b;
        return GCD(b%a,a);
    }

    private static int LCM(int a,int b){

        return (a/GCD(a,b))*b;

    }

    public static int getTotalX(List<Integer> a, List<Integer> b) {

        int lcm =1;
        int hcf =0;
        int count =0;

        for(int ele:a)
            lcm = LCM(ele,lcm);

        for (int ele:b)
            hcf = GCD(hcf,ele);

        int i=2;
        int lcmMultiple =lcm;
        while (lcmMultiple<=hcf){
            if(hcf%lcmMultiple==0)
                count++;
            lcmMultiple = lcm*i++;
        }
        return count;
    }

    public static void main(String[] args)throws IOException {

        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> a = Stream.of(buff.readLine().replaceAll("\\s+$", "").split(" "))
                            .map(Integer::valueOf).collect(Collectors.toList());

        List<Integer> b = Stream.of(buff.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::valueOf).collect(Collectors.toList());

        System.out.println(getTotalX(a,b));
    }
}