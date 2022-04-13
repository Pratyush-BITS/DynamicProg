package DivideAndConquer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 You're Given an Arithmetic Progression series from which one number is missing,
 you've to find that number.
 The missing number will never be the first/last number from the series.
 Complete the function ->
    private int findMissingNumber(List<Integer> listAP, int diff, int startIndex , int endIndex)

 Example TestCase1:
    listAp = [-2, 0, 2, 4, 8, 10, 12, 14]
    Output = 6 is Correct

 Example TestCase2:
    listAp = [5, 5, 5, 5]
    Output = 5 is Correct

 Example TestCase3:
    listAp = [144, 165, 186, 207, 228, 249, 270, 291, 333, 354, 375, 396, 417, 438]
    Output = 312 is Correct

 Example TestCase4:
    listAp = [187, 175, 163, 151, 139, 127, 115, 103, 91, 79, 67, 55, 43, 31, 19, 7, -17, -29, -41]
    Output = -5 is Correct

 20 TestCases will be generated automatically and you'll get a list which will tell you about the
 TestCases you failed along with expected result and your result.
 */


public class ArithmeticProgression {

    private int findMissingNumber(List<Integer> listAP, int diff, int startIndex , int endIndex){

        if(diff == 0)
            return listAP.get(0);

        while(endIndex>startIndex) {
            int mid =  (startIndex+endIndex)/2;
            int midEle = listAP.get(mid);
            if (midEle + diff != listAP.get(mid + 1))
                return midEle + diff;
            else if (mid > 0 && midEle - diff != listAP.get(mid - 1))
                return midEle - diff;
            else if (midEle == listAP.get(0) + diff * mid)
                startIndex =  mid + 1;
            else
                endIndex= mid - 1;
        }
        return -1;
    }

    public static void main(String[] args){

        int TestCount = 0;
        List<Integer> listAP = new ArrayList<>();
        List<String> failedCases = new ArrayList<>();
        String isCorrect = " is Correct", isWrong = " is Wrong";

        do {
            System.out.println("Running test number :"+ ++TestCount);
            listAP.clear();
            Random random = new Random();

            int a = random.nextInt(500) - 200;
            int limit = random.nextInt(50) + 3;
            int d = random.nextInt(50) - 20;

            System.out.println("a = " + a + ", d = " + d + ", no of values in original list = " + limit);

            for (int i = 0; i < limit; i++, a += d)
                listAP.add(a);

            int last = listAP.size() - 1;

            // the very first element can't be removed from the list
            int indRem;
            do{indRem = random.nextInt(last);}while (indRem ==0);

            System.out.println(" Original: "+listAP); //original list
            int removedElement = listAP.remove(indRem);
            System.out.println(" Edited  : "+listAP); //List after removing a value
            last--;
            int startIndex = 0;
            ArithmeticProgression ap = new ArithmeticProgression();
            int num = ap.findMissingNumber(listAP, d, startIndex, last);

            if(num == removedElement)
                System.out.println( num +isCorrect);
            else {
                System.out.println(num + isWrong);
                failedCases.add("TestCase "+TestCount+" Expected "+removedElement+" your output "+num);
            }
            System.out.println();

        }while(TestCount<20);

        if(failedCases.size()>0){
            System.out.println("list of test cases failed :");
            failedCases.forEach(System.out::println);
            System.out.println("It's okay Pratyush. I know you can do better");
        }
        else
            System.out.println("Congratulations Pratyush! All test cases passed :-) ");


    }
}