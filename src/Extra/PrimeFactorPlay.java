package Extra;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class PrimeFactorPlay {

    static boolean isPrime(Long i){
        long root = (long) Math.sqrt(i);
        for(long j =2L; j<=root;j++)
            if(i%j==0)
                return false;
       return true;
    }

    static boolean isPrime(String i){
        BigInteger big =new BigInteger(i);
        return big.isProbablePrime(3);
    }



    static void  addLarge(String a, String b){
        System.out.println( new BigInteger(a).add(new BigInteger(b)));
    }
    static void  multiplyLarge(String a, String b){
        System.out.println( new BigInteger(a).multiply(new BigInteger(b)));
    }

    static List<BigInteger> list =new ArrayList<>();
    static {
        BigInteger i = new BigInteger("2");
        BigInteger one = new BigInteger("1");
        while (list.size()<16) {
            if (isPrime(i))
                list.add(i);
            i=i.add(one);
        }
    }

    static boolean isPrime(BigInteger i){
        return i.isProbablePrime(3);
    }

    static int getCount(long n){
        int count =0;
        if(n==1)
            return count;
        int len = list.size();
        Long prod =list.get(0).longValue();
        for(int a = 1 ;a<len && prod < n;a++ ){
            count++;
            prod *= list.get(a).longValue();
        }

        return count;
    }


    public static void main(String[] args)throws IOException {

        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
//        String a = "40000000000";
//        String b = "97317371345645673717";
//        String c = "503782986701";
        int a =Integer.parseInt(buff.readLine().trim());
        while (a-->0) {
            String num1 = buff.readLine();
            String num2 = buff.readLine();
            System.out.print("sum of " + num1 + " & " + num2 +" is ");
            addLarge(num1, num2);
            System.out.print("product of " + num1 + " & " + num2 +" is ");
            multiplyLarge(num1, num2);
        }
        //System.out.println(getCount(10000000000L));

    }
}