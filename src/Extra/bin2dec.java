package Extra;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class bin2dec {

    private static int converter(String str){
        double num =0;
        int len = str.length();
        int count =1;
        for (char ch:str.toCharArray()){
            if(ch=='1')
            num += Math.pow(2,len-count);
            count++;
        }
        return (int)num;
    }

    static long factorial(int a){
        long ans =1l;
        do{
            ans *= a;
        }while (--a>0);
        return ans;
    }

    static int gcd(int a, int b) {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }

    static int lcm(int a, int b) {
        return (a / gcd(a, b)) * b;
    }

    public static void main(String[] args)throws IOException {
        String str ="1110";
        System.out.println(converter(str));
        System.out.println(factorial(20));
        System.out.println(gcd(1190,1445));
        System.out.println(lcm(1190,1445));
        int n1 =12, n2 =32;
        int lcm = (n1 > n2) ? n1 : n2;

        while(true) {
            if( lcm % n1 == 0 && lcm % n2 == 0 ) {
                System.out.printf("The LCM of %d and %d is %d.", n1, n2, lcm);
                break;
            }
            ++lcm;
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int []input =  Stream.of(br.readLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int []arr = Stream.of(br.readLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int temp =-1, len = input[0], val = input[1];
        for( int i = 0; i<len;i++){
            if( arr[i] == val )
                temp = i+1;
        }
        System.out.println(temp);
    }

}


