package DivideAndConquer;

import java.util.HashMap;
import java.util.Map;

public class NutsAndBolts {

    static void MatchNutsAndBolts(char[] nuts, char[] bolts,int len){

        Map<Character,Integer> nutMap = new HashMap<>();

        for (int i = 0; i < len; i++)
            nutMap.put(nuts[i],i);

        for (int i = 0; i < len; i++) {
            if(nutMap.containsKey(bolts[i]))
                nuts[i] = bolts[i];
        }

        for (char nut : nuts)
            System.out.print(nut+" ");
        System.out.println();
        for (char bolt : bolts)
            System.out.print(bolt+" ");
    }

    public static void main(String[] args) {

        char[] nuts = {'@','$','&','!','_','^','~'};
        char []bolts = {'$','@','`','!','^','_','&'};

        MatchNutsAndBolts(nuts,bolts,nuts.length);

    }

}