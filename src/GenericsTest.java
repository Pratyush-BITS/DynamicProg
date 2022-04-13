public class GenericsTest <T>{
    public void TypeOfData (T data){
        System.out.println("datatype of "+data+" is "+ data.getClass().getSimpleName());
    }

    public static void main(String[] args) {

        GenericsTest<Object> gen = new GenericsTest<>();
        gen.TypeOfData(23);
        gen.TypeOfData("23");
        gen.TypeOfData('A');
        gen.TypeOfData(false);
        gen.TypeOfData(23L);
        gen.TypeOfData(23.00f);
        gen.TypeOfData(23.00);
    }
}
