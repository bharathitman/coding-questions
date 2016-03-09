package random;

/**
 * Created by bharath on 3/8/2016.
 */
public class recursiveSum {

    public static void main(String[] args) {

        calcSum(1,15,0);

        System.out.println(calcSum(1,10));
    }

    public static void calcSum(int a, int b, int sum) {

        sum = a + sum;

        if(a == b) {
            System.out.println(sum);
            return;
        }

        calcSum(a+1, b, sum);
    }

    public static int calcSum(int from, int to) {

        if(from == to)
            return from;
        else
            return from + calcSum(from+1, to);

    }



}
