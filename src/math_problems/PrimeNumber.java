package math_problems;

public class PrimeNumber {

    /** INSTRUCTIONS
     * Write a method to print a list of all prime numbers from 2 to 1,000,000.
     *  Print out the prime numbers in the given range.
     *
     * BONUS: Figure out how to improve algorithmic efficiency
     */
    static boolean isPrime(int n) {
        if (n <= 1)
            return false;

        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }
    static void primeNumber(int n)
    {
        for (int i = 2; i <= n; i++)
        {
            if (isPrime(i))
                System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        int n = 1000000;
        primeNumber(n);

    }
}
