package DivideAndConquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class createPow {

    static long powerCalculator(int num,int power){

        if(power==0)
            return 1;

        long temp = powerCalculator(num,power/2);

        if(power%2==0)
            return temp*temp;
        return num*temp*temp;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader buff =new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(buff.readLine().trim());
        int power = Integer.parseInt(buff.readLine().trim());
        long a =powerCalculator(num,power);
        System.out.println(a);
    }
}