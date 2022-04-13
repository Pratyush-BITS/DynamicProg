package Extra;

import java.util.ArrayList;
import java.util.List;

public class MatrixSpiralRotation {

    private static void
            rotate(List<List<Integer>> arr, int begin_row, int begin_col, int end_row, int end_col){

        if(begin_row>=end_row || begin_col>=end_col)
            return;

        for(int i=begin_col;i<end_col;i++)
            System.out.print(arr.get(begin_row).get(i)+" ");

        for(int i=begin_col+1;i<end_row;i++)
            System.out.print(arr.get(i).get(end_col-1)+" ");

        if((begin_row+1)!=end_row)
            for(int i=end_col-2;i>=begin_col;i--)
                System.out.print(arr.get(end_row-1).get(i)+" ");

        if((begin_col+1)!=end_col)
            for(int i=end_row-2;i>begin_row;i--)
                System.out.print(arr.get(i).get(begin_col)+" ");

        rotate(arr,begin_row+1,begin_col+1,end_row-1,end_col-1);
    }

    public static void main(String[] args) {

        int row =3, col =3, k=1;
        List<List<Integer>> arr =new ArrayList<>();
        for(int i=0;i<row;i++) {
            List<Integer> arrIn =new ArrayList<>();
            for (int j = 0; j < col; j++)
                arrIn.add(k++);
            arr.add(arrIn);
        }

        for(List<Integer> ar:arr) {
            for (int ele : ar)
                System.out.print(ele+" ");
            System.out.println();
        }

        rotate(arr,0,0,row,col);

    }


}
