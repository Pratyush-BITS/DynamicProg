import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayCheck {

    void arrayEditor(int []arr){
        arr[3] =3;

    }

    final static BufferedReader buff =new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {

        int []arr = Stream.of(buff.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        ArrayCheck arrayCheck = new ArrayCheck();
        arrayCheck.arrayEditor(arr);
        System.out.println(Arrays.toString(arr));
    }

}
