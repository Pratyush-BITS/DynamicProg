package DynamicProgramming;

import java.util.*;

public class MasterDictionary {

    static boolean isSubsequence(String master,String dictWord){

        System.out.println(dictWord);
        int len1= master.length();
        int len2 = dictWord.length();
        int j=0;
        for(int i=0; i < len1 && j< len2; i++){
            if( master.charAt(i) == dictWord.charAt(j))
                j++;
        }
        System.out.println(j);
        return j==len2;
    }

    static List<String> PossibleWords(String masterWord,int n,String []dict){
        List<String> ans = new ArrayList<>();

        for(String word:dict){
            if(isSubsequence(masterWord,word))
                ans.add(word);
        }
        Collections.sort(ans);
        return ans;
    }

    final static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {

        String masterWord = sc.nextLine();
        int n = sc.nextInt();
        sc.nextLine();
        String []dict = sc.nextLine().split(" ");

        List<String> list = PossibleWords(masterWord,n,dict);

        for(String ele:list)
            System.out.print(ele+" ");

    }

}
