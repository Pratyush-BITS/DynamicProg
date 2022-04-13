package Array_prep;

import java.util.HashMap;
import java.util.Map;

/*  You're given an array having n elements.
    WAP to find the element which occurs more than n/2 times.
    If there are no such element return -1
 */

public class MajorityElement {

    private int FindMajorityElement(int[] arr,int len){
        Map<Integer,Integer> countMap = new HashMap<>();
        int limit =len/2;
        for(int ele:arr){
            if(countMap.containsKey(ele)) {
                int val = countMap.get(ele)+1;
                if(val>limit)
                    return ele;
                countMap.put(ele,val);
            }
            countMap.putIfAbsent(ele, 1);
        }
        return -1;
    }

    public static void main(String[] args) {
        int []arr= {1,15,15,1,3,15,2,4,15,3,2,15,1,15,15,3};
        int value = new MajorityElement().FindMajorityElement(arr,arr.length);
        System.out.println( value==-1 ? "No such value" : value);
    }
}
