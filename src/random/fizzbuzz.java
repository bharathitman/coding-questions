package random;

/**
 * Created by bharath on 1/22/2016..
 * Fizzbuzz Problem
 */

public class fizzbuzz {

    public static void main(String[] args) {

        fizzbuzz_1(18);

    }

    public static void fizzbuzz_1(int n) {

        for(int i = 1; i <= n; i++) {

            if(i % 15 == 0) {
                System.out.print("FIZZBUZZZ ");
            }
            else if(i % 5 == 0) {
                System.out.print("BUZZ ");
            }
            else if(i % 3 == 0) {
                System.out.print("FIZZ ");
            }
            else {
                System.out.print(i+ " ");
            }

        }

    }

}
