import java.math.BigInteger;

public class Main {

        public static int factorial(int n) {
            if(n < 0 || n > 12) throw new IllegalArgumentException("Illegal argument!");
            return n <= 1 ? 1 : n * factorial(n - 1);
        }

        public static void main(String[] args) {
            System.out.println(factorial(5));
        }
    // Another ways.
        /*public int factorial(int n) {
            if (n < 0 || n > 12)
                throw new IllegalArgumentException();
            int result = 1;
            for (int i = 2; i <= n; ++i) {
                result *= i;
            }
            return result;
        }*/

    //For values bigger then 20 we can use BigInteger.
    /*public BigInteger factorialHavingLargeResult(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++)
            result = result.multiply(BigInteger.valueOf(i));
        return result;
    }*/
}
