package Extra;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class PalindromicSequence {



    private static List<String> createPalindromicSequence(char[]ch){

        List<String> list = new ArrayList<>();

        for (char c:ch)
            list.add(c+""+c);

        for (char a:ch) {
            for (char c:ch) {
                list.add(a+""+c+""+c+""+a);
            }

        }

        list.sort((s1, s2) -> {
            if (s1.length() < s2.length())
                return 1;
            else if (s1.length() > s2.length())
                return 0;
            else
                return s1.compareTo(s2);
        });
        return list;

    }

    final static BufferedReader buff =new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {

        char[] ch = {'a','b','c','d'};
        List<String> list = createPalindromicSequence(ch);
        System.out.println(list);
        int count = Integer.parseInt(buff.readLine().trim());
        while (count-->0){
            int index = Integer.parseInt(buff.readLine().trim());
            System.out.println(list.get(index-1));
        }
    }

}
