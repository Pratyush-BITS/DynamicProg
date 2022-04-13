package Extra; //update package name

import java.util.ArrayList;
import java.util.TreeSet;

/**
 *
 * @author Pratyush
 */

class BUS{

    String sourcePlace;
    String destinationPlace;
    int charge;

    BUS(String sourcePlace,String destinationPlace,int charge){

        this.sourcePlace = sourcePlace;
        this.destinationPlace = destinationPlace;
        this.charge =charge;
    }

    public String getSourcePlace() {
        return sourcePlace;
    }

    public String getDestinationPlace() {
        return destinationPlace;
    }

    public int getCharge() {
        return charge;
    }

}

class Ticket{
    ArrayList<BUS> busList =new ArrayList<>();

    public void addTicket(String sourcePlace, String destinationPlace, int charge){
        BUS bus = new BUS(sourcePlace,destinationPlace,charge);
        busList.add(bus);
    }

    public ArrayList<String> getAllCity (){

        TreeSet<String> cities = new TreeSet<>();
        for (BUS bus : busList) {
            String a = bus.getSourcePlace();
            String b = bus.getDestinationPlace();
            cities.add(a);
            cities.add(b);
        }
        return new ArrayList<>(cities);
    }


    public ArrayList<String> getDestinationCities(String sourceCity){

        TreeSet<String> destination = new TreeSet<>();

        for (BUS bus : busList) {
            if (sourceCity.equals(bus.getSourcePlace())) {
                destination.add(bus.destinationPlace);
            }
        }
        return new ArrayList<>(destination);
    }

}

public class BusAndTicket{

    public static void main(String[] args) {

        Ticket obj = new Ticket();
        obj.addTicket("Delhi","Pune",350);
        obj.addTicket("Agra","Noida",130);
        obj.addTicket("Noida","Mathura",150);
        obj.addTicket("Noida","Sagar",500);
        obj.addTicket("Delhi","Patna",250);


        System.out.println(obj.getAllCity());
        System.out.println(obj.getDestinationCities("Noida"));
        System.out.println(obj.getDestinationCities("Delhi"));

    }
}