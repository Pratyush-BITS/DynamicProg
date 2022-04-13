package Extra;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class HackerEarth_Bugs {

    static List<Integer> list =new ArrayList<>();
    private static void addNum(int num){

        int size =list.size();
        int lI = 0, rI = size-1, midI, val, index;

        while(true){

            if(rI<lI){
                index = lI;
                break;
            }

            midI =(lI+rI)/2;
            val =list.get(midI);

            if(val==num){
                index =midI;
                break;
            }
            else if(val>num)
                lI = midI+1;
            else
                rI =midI-1;

        }

        if(index==size)
            list.add(num);
        else if(index<=0)
            list.add(0,num);
        else
            list.add(index,num);

    }


    public static void main(String[] args) throws IOException {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(buff.readLine().trim());
        int z = 0;


        for (int i=0;i<n;i++){

            String[] perform = buff.readLine().trim().split(" ");
            if(Integer.parseInt(perform[0])==1){
                addNum(Integer.parseInt(perform[1]));
                z++;
            }
            else{
                if(z<3){
                    System.out.println("Not enough enemies");
                    continue;
                }
                System.out.println(list.get(z/3-1));
            }
        }
    }
}