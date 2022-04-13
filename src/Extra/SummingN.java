package Extra;

public class SummingN {

    static int summingSeries(long n) {

        long div =1000000007;
        n=n%div;
        int a = (int)((n*n) % div);
        return a;
    }

    public static void main(String[] args) {
        System.out.println(summingSeries(681519110));
        double []d =new double[3];
    }

}
