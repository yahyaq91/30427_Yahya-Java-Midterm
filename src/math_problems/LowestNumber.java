package math_problems;

public class LowestNumber {

    /** INSTRUCTIONS
     * Write a method to find the lowest number from this array.
     */

    public static void main(String[] args) {

        int[] array = new int[] {211, 110, 99, 34, 67, 89, 67, 456, 321, 456, 78, 90, 45, 32, 56, 78, 90, 54, 32, 123,
                67, 5, 679, 54, 32, 65};


        int minValue = array[0];

        for (int i : array) {

            if (i < minValue)

                minValue = i;
        }

        System.out.println("Lowest number in array: " + minValue);
    }


}


