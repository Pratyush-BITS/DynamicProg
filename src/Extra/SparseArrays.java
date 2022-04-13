package Extra;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SparseArrays {

    static int[] matchingStrings(String[] strings, String[] queries) {

        Map<String,Integer> map =new HashMap<>();
        for(String ele:strings){
            map.computeIfPresent(ele,(key,val)->++val);
            map.putIfAbsent(ele,1);
        }

        int []arr =new int[queries.length];
        int i=0;
        for (String ele:queries){
            if(map.containsKey(ele))
                arr[i++]=map.get(ele);
            else
                arr[i++]=0;
        }

        return arr;
    }

    public static void main(String[] args) {
        Arrays.stream(matchingStrings(new String[]{"f", "d","f"}, new String[]{"b","f","e","d"})).forEach(ele-> System.out.println(ele));

    }

}
