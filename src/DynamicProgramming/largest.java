package DynamicProgramming;

import java.util.Scanner;
/**
 **
 *@author = Pratyush
 */
public class largest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int y=sc.nextInt();
        int z=sc.nextInt();
        int largerst4 = 9999;
        int x= largerst4-(largerst4%y);
        int sumZ = x%z;
        if(sumZ!=0)
            sumZ=x +(z-sumZ);

        System.out.println("DynamicProgramming.largest no divisible by "+y+" = "+x);
        System.out.println("smallest No. to be added to "+x+" for it to be divisible by "+z+" = "+sumZ);
    }

}
