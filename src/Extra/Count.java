package Extra;

import java.util.HashMap;
import java.util.Map;

public class Count {

    public static void main(String[] args) {
        String Str ="Good Morning";
        String lowerStr = Str.toLowerCase();         //->Converting str to lowerCase
        String unspacedStr = lowerStr.replaceAll(" ",""); //->removing space between Good & Morning
        char[] charStrArr = unspacedStr.toCharArray();    //-> Converting String to char array
 /**
        char[] charStrArr = Str.toLowerCase().replaceAll(" ","").toCharArray();
*/
        Map<Character,Integer> countMap =new HashMap<>();
        for(char ch:charStrArr){
/**
             countMap.computeIfPresent(ch,(key,val)->++val);
             countMap.putIfAbsent(ch,1)
*/
            if(countMap.containsKey(ch)){
                countMap.put(ch,countMap.get(ch)+1);
            }
            else
                countMap.put(ch,1);
        }
        char toSearchFor ='g';
        System.out.println(toSearchFor+" = "+countMap.get(toSearchFor));
    }
}
