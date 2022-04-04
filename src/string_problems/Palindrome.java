package string_problems;

public class Palindrome {

    /*
      A palindrome is a word that can be reversed, and still remain the same.
      Example: MOM, DAD, MADAM, RACECAR

      Create a method to check if any given String is a palindrome or not.
     */

    // Implement here

    static String word = "Racecar";

    public static void main(String[] args) {
        Palindrome obj = new Palindrome();
        System.out.println(obj.isPalindrome(word));
    }

    boolean isPalindrome(String text) {
        boolean isPalindrome = false;

        String reversedString = reverseString(text);

        isPalindrome = text.equals(reversedString);

        return isPalindrome;
    }

    String reverseString(String input) {
        String reversedString = "";

        char[] inputArr = input.toCharArray();
        int n = inputArr.length;

        char[] reversedArray = new char[n];

        int j = 0;
        for (int i = n - 1; i >= 0; i--) {
            reversedArray[j] = inputArr[i];
            j++;
        }

        reversedString = String.valueOf(reversedArray);

        return reversedString;
    }

}
