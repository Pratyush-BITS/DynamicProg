package Extra;

public class MovingTiles {

    static double[] movingTiles(int l, int s1, int s2, int[] queries) {

        int len = queries.length;
        double []ans = new double[len];
        double root2 =  Math.sqrt(2);
        double absVel = Math.abs(s2-s1);
        for (int i = 0; i < len; i++)
            ans[i] = (l-Math.sqrt(queries[i]))*root2 / absVel;

        return ans;
    }

    public static void main(String[] args) {

        double []ans = movingTiles(10,1,2,new int[]{50,100});
        for (double d:ans)
            System.out.println(d);
    }

}
