package Extra;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Practice_2D {



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int rows = Integer.parseInt(br.readLine().trim());
        int outputCount = Integer.parseInt(br.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();
        for (int i = 0; i < rows; i++)
            arr.add(Arrays.stream(br.readLine().trim().split(" "))
                                    .map(Integer::valueOf)
                                    .collect(Collectors.toList()));


        while (outputCount-- > 0) {
            String[] indices = br.readLine().split(" ");
            int rI =Integer.parseInt(indices[0]);
            int cI =Integer.parseInt(indices[1]);
            if(rI<rows && cI<arr.get(rI).size())
              System.out.println(arr.get(rI).get(cI));
            else
              System.out.println("No element present");
        }
    }
}