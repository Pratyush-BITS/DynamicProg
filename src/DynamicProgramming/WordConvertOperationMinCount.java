package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WordConvertOperationMinCount {

    static int minimum(int a,int b,int c){
        return Math.min(a,Math.min(b,c));
    }

    static int[][] WCOMC(char[] word1, char[] word2, int len1, int len2){

        int[][] countArr = new int[len1][len2];

        for (int i = 0; i < len1; i++)
            for (int j = 0; j < len2; j++) {
                if(i == 0)
                    countArr[i][j] = j;
                else if(j == 0)
                    countArr[i][j] = i;
                else if(word1[i-1]==word2[j-1])
                    countArr [i][j]= countArr [i-1][j-1];
                else
                    countArr[i][j] =1+ minimum(countArr[i-1][j-1],countArr[i-1][j-1],countArr[i-1][j-1]);
            }

        return countArr;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

        char[] word1 = br.readLine().toCharArray();
        char[] word2 = br.readLine().toCharArray();

        int[][] countArr = WCOMC(word1,word2,word1.length,word2.length);

        for(int []arr:countArr) {
            for (int a : arr)
                System.out.print(a + " ");
            System.out.println();
        }
    }
}