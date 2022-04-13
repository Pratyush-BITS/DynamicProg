package Extra;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Ice_creamParlor {


    static void whatFlavors(int[] cost, int money) {

        int len = cost.length;
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<len;i++){
            int curr = cost[i];
            int comp = money-curr;
            if (map.containsKey(comp)){
                int index= map.get(comp)-1;
                if(cost[index]+curr == money){
                    System.out.println((index+1)+" "+(i+1));
                    break;
                }
            }
            else
                map.put(curr,i+1);
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine().trim());
        while (t-->0){
            int money = Integer.parseInt(bufferedReader.readLine().trim());
            int len = Integer.parseInt(bufferedReader.readLine().trim());

            int[] cost = Arrays.stream(bufferedReader.readLine().trim().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            whatFlavors(cost,money);
        }
    }
}
