package Array_prep;

/*Find the max difference in an array so that
  the larger element has higher index than smaller element
  TC : O(n)
  SC : O(1)
*/

public class DifferenceMaxOnRightOfMin {

    static int Difference(int[] arr, int len){

        int lowVal=arr[0];
        int  maxDifference=arr[1]-lowVal;

        for (int i = 1; i < len; i++) {
            int val = arr[i];
            int temp = val - lowVal;

            if(temp<0){
                lowVal = val;
                continue;
            }
            maxDifference = Math.max(temp,maxDifference);
        }
        return maxDifference;
    }

    public static void main(String[] args) {

        int []arr ={4,3,1,2,9,1,6};
        System.out.println(Difference(arr,arr.length));

    }
}