package DynamicProgramming;

/**
 *@author = Pratyush
 */
public class LargestSquareSubMatrixWith1 {

    private static int LargestOneSubmatrixSize(int[][] arr){

        int[][] sArr = new int[arr.length][arr.length];

        for(int i = 0;i< arr.length;i++) {
            sArr[0][i] = arr[0][i];
            sArr[i][0] = arr[i][0];
        }

        for(int i=1;i< arr.length;i++)
            for(int j=1;j<arr.length;j++){
                if(arr[i][j]==1)
                    sArr[i][j] = Math.min(sArr[i][j - 1],
                            Math.min(sArr[i - 1][j], sArr[i - 1][j - 1])) + 1;

                else
                    sArr[i][j]=0;
            }

        int temp=0;
        for(int[]a:sArr)
            for (int ele : a)
                temp = Math.max(temp,ele);

        for(int[]a:sArr) {
            for (int ele : a) {
                System.out.print(ele+" ");
            }
            System.out.println();
        }
        return temp;

    }

    private static int Largest1SubmatrixSize(int [][]arr){

        int len =arr.length;
        int[][] sArr = new int[len][len];

        for(int i = len-1;i>=0;i--) {
            sArr[len-1][i] = arr[len-1][i];
            sArr[i][len-1] = arr[i][len-1];
        }

        for(int i=len-2;i>=0;i--)
            for(int j=len-2;j>=0;j--){
                if(arr[i][j]==1)
                    sArr[i][j] = Math.min(sArr[i][j + 1],
                            Math.min(sArr[i + 1][j], sArr[i + 1][j + 1])) + 1;

                else
                    sArr[i][j]=0;
            }

        int temp=0;
        for(int[]a:sArr)
            for (int ele : a)
                temp = Math.max(temp,ele);

        for(int[]a:sArr) {
            for (int ele : a) {
                System.out.print(ele+" ");
            }
            System.out.println();
        }

        return temp;
    }

    public static void main(String[] args) {

        int[][] arr={{1,1,1,1},
                     {1,1,1,1},
                     {0,1,1,1},
                     {0,1,0,1}};

        System.out.println(LargestOneSubmatrixSize(arr));
        System.out.println("\n\nBack loop");
        System.out.println(Largest1SubmatrixSize(arr));

    }
}
