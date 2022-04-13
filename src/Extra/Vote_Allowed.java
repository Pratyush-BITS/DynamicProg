package Extra;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Vote_Allowed {

    private static List<Integer> getVoterList(Map<Integer, LocalDate> voterMap){
        List<Integer>voterList = new ArrayList<>();

        LocalDate today = LocalDate.now();

        for(Map.Entry<Integer, LocalDate> map :voterMap.entrySet()){
            Period period = Period.between ( map.getValue(), today );
            System.out.println(period);
            if(period.getYears()>18)
                voterList.add(map.getKey());
        }
        return voterList;
    }

    public static void main(String[] args) {
        Map<Integer, LocalDate> voterMap = new HashMap<>();
        voterMap.put(1, LocalDate.of(2001,12,24));
        voterMap.put(2, LocalDate.of(1998,2,12));
        voterMap.put(3, LocalDate.of(1976,5,4));
        voterMap.put(4, LocalDate.of(2005,6,30));
        voterMap.put(5, LocalDate.of(2002,10,19));
        voterMap.put(6, LocalDate.of(1991,11,11));
        voterMap.put(7, LocalDate.of(2003,3,16));
        voterMap.put(8, LocalDate.of(2001,5,7));
        voterMap.put(9, LocalDate.of(2009,3,17));

        System.out.println(voterMap);
        System.out.println(getVoterList(voterMap));
    }

}
