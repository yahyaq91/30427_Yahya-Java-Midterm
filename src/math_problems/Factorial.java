package math_problems;

public class Factorial {

    /**
     * INSTRUCTIONS
     * Write a method to return the Factorial of any given number using Recursion, as well as iteration.
     * I have not taught you recursion. Your job is to look it up, learn about it, and use it to find a solution.
     * <p>
     * HINT: Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120
     */

    static int factorialRecursion(int n) {
        if (n == 0)
            return 1;

        return n * factorialRecursion(n - 1);
    }

    static int factorialIteration(int n)
    {
        int res = 1, i;
        for (i = 2; i <= n; i++)
            res *= i;
        return res;
    }

    public static void main(String[] args) {
        {
            int num = 5;
            System.out.println("Factorial of " + num + " is " + factorialRecursion(5));
            System.out.println("Factorial of " + num + " is " + factorialIteration(5));
        }

    }
}