package Array_prep;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

// SAP Labs 2021 batch

public class DateSort {

    public static void main(String[] args) {

        String[] inputs = {"24 Jul 2017", "25 Jul 2017", "11 Jun 1996",
                "01 Jan 2019", "12 Aug 2005", "01 Jan 1997"};

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern( "dd MMM yyyy" , Locale.US );

        List< LocalDate > dates = new ArrayList<>( inputs.length );
        for ( String input : inputs ) {
            LocalDate ld = LocalDate.parse(input,dtf);
            dates.add( ld );
        }

        Collections.sort(dates);
        dates.forEach(e-> System.out.print(e.format(dtf)+" "));

//        System.out.println();
//        String sorted = Arrays.stream(inputs)
//                .map(input -> LocalDate.parse(input, dtf))
//                .sorted()
//                .map(date -> date.format(dtf))
//                .collect(Collectors.toList())
//                .toString();
//
//        System.out.println(sorted);
    }
}
