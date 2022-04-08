package sorting;

import java.util.List;
import java.util.Random;

import databases.SharedStepsDatabase;

    /** INSTRUCTIONS
     * Demonstrate all the different kind of sorting algorithms from the Sorting class. There is an example provided
     *  below to get you started.
     *
     *  You must store all the sorted arrays into their own database table, and retrieve the values and print them
     *  Display the execution time for each sorting. Example in below.
     *
     *  You may use any database, such as MongoDB, Oracle MySql, PostgreSQL, etc, to store data and retrieve data.
     *
     *  BONUS: Come to a conclusion about which sorting algorithm is the most efficient, given data sets with a size of:
     *         10
     *         100
     *         1000
     *         10000
     *         100000
     */

public class SortEfficiency {

    public static void main(String[] args) throws Exception {
        // Declare and initialize an array of a desired length with random numbers
        int[] numberArray = new int[10000];
        insertRandomNumbersIntoArray(numberArray);

        Sorting algo = new Sorting();
        SharedStepsDatabase ssdb = new SharedStepsDatabase();

        // region Selection Sort
//        numberArray = algo.selectionSort(numberArray);
//        long selectionSortExecutionTime = algo.executionTime;
//
//        System.out.println("***SELECTION SORT***\nArray Length: " + numberArray.length + "\nExecution TIme: "
//                + selectionSortExecutionTime + " milliseconds");
//
//         // Insert sorted array into a database table, with the desired table name and column name
//        ssdb.insertIntegerArray("selection_sort", "sorted_numbers", numberArray);
//
//         // Retrieve all elements from the newly created table
//        String query = "SELECT * FROM SELECTION_SORT";
//        List<String> sorted_numbers = ssdb.executeQueryReadAllSingleColumn(query, "sorted_numbers");
//        printValue(sorted_numbers);

        // endregion

        // You must randomize the number array after each sorting algorithm to prepare it for the next sorting algorithm
        randomize(numberArray);


        // region - Insertion Sort
//        numberArray = algo.insertionSort(numberArray);
//        long insertionSortExecutionTime = algo.executionTime;
//
//        System.out.println("***INSERTION SORT***\nArray Length: " + numberArray.length + "\nExecution TIme: "
//                + insertionSortExecutionTime + " milliseconds");
//
//        ssdb.insertIntegerArray("insertion_sort", "sorted_numbers", numberArray);
//
//        String query = "SELECT * FROM INSERTION_SORT";
//        List<String> sorted_numbers = ssdb.executeQueryReadAllSingleColumn(query, "sorted_numbers");
//        printValue(sorted_numbers);

        // endregion

        randomize(numberArray);


        // region  - Bubble Sort
//        numberArray = algo.bubbleSort(numberArray);
//        long bubbleSortExecutionTime = algo.executionTime;
//
//        System.out.println("***BUBBLE SORT***\nArray Length: " + numberArray.length + "\nExecution TIme: "
//                + bubbleSortExecutionTime + " milliseconds");
//
//        ssdb.insertIntegerArray("bubble_sort", "sorted_numbers", numberArray);
//
//        String query = "SELECT * FROM BUBBLE_SORT";
//        List<String> sorted_numbers = ssdb.executeQueryReadAllSingleColumn(query, "sorted_numbers");
//        printValue(sorted_numbers);

        // endregion

        randomize(numberArray);


        // region  - Merge Sort
//        numberArray = algo.mergeSort(numberArray);
//        long mergeSortExecutionTime = algo.executionTime;
//
//        System.out.println("***MERGE SORT***\nArray Length: " + numberArray.length + "\nExecution TIme: "
//                + mergeSortExecutionTime + " milliseconds");
//
//        ssdb.insertIntegerArray("merge_sort", "sorted_numbers", numberArray);
//
//        String query = "SELECT * FROM MERGE_SORT";
//        List<String> sorted_numbers = ssdb.executeQueryReadAllSingleColumn(query, "sorted_numbers");
//        printValue(sorted_numbers);

        // endregion

        randomize(numberArray);



        // region - Quick Sort
//        numberArray = algo.quickSort(numberArray);
//        long quickSortExecutionTime = algo.executionTime;
//
//        System.out.println("***QUICK SORT***\nArray Length: " + numberArray.length + "\nExecution TIme: "
//                + quickSortExecutionTime + " milliseconds");
//
//        ssdb.insertIntegerArray("quick_sort", "sorted_numbers", numberArray);
//
//        String query = "SELECT * FROM QUICK_SORT";
//        List<String> sorted_numbers = ssdb.executeQueryReadAllSingleColumn(query, "sorted_numbers");
//        printValue(sorted_numbers);

        // endregion

        randomize(numberArray);


        // region - Heap Sort
//        numberArray = algo.heapSort(numberArray);
//        long heapSortExecutionTime = algo.executionTime;
//
//        System.out.println("***HEAP SORT***\nArray Length: " + numberArray.length + "\nExecution TIme: "
//                + heapSortExecutionTime + " milliseconds");
//
//        ssdb.insertIntegerArray("heap_sort", "sorted_numbers", numberArray);
//
//        String query = "SELECT * FROM HEAP_SORT";
//        List<String> sorted_numbers = ssdb.executeQueryReadAllSingleColumn(query, "sorted_numbers");
//        printValue(sorted_numbers);

        // endregion

        randomize(numberArray);


        // region - Bucket Sort
//        numberArray = algo.bucketSort(numberArray);
//        long bucketSortExecutionTime = algo.executionTime;
//
//        System.out.println("***BUCKET SORT***\nArray Length: " + numberArray.length + "\nExecution TIme: "
//                + bucketSortExecutionTime + " milliseconds");
//
//        ssdb.insertIntegerArray("bucket_sort", "sorted_numbers", numberArray);
//
//        String query = "SELECT * FROM BUCKET_SORT";
//        List<String> sorted_numbers = ssdb.executeQueryReadAllSingleColumn(query, "sorted_numbers");
//        printValue(sorted_numbers);

        // endregion

        randomize(numberArray);


        // region 8 - Shell Sort
//        numberArray = algo.shellSort(numberArray);
//        long shellSortExecutionTime = algo.executionTime;
//
//        System.out.println("***SHELL SORT***\nArray Length: " + numberArray.length + "\nExecution TIme: "
//                + shellSortExecutionTime + " milliseconds");
//
//        ssdb.insertIntegerArray("shell_sort", "sorted_numbers", numberArray);
//
//        String query = "SELECT * FROM SHELL_SORT";
//        List<String> sorted_numbers = ssdb.executeQueryReadAllSingleColumn(query, "sorted_numbers");
//        printValue(sorted_numbers);

        // endregion

        randomize(numberArray);
        // endregion
    }

    // region Helper Methods
    /**
     * Inserts random integers into an int[] array. All numbers have an upper bound of 1,000,000
     *
     * @param array Array to insert numbers into
     */
    private static void insertRandomNumbersIntoArray(int[] array) {
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(1000000);
        }
    }

    /**
     * Randomizes the numbers in an int[] array
     *
     * @param array The array to be randomized
     */
    private static void randomize(int[] array) {
        Random r = new Random();
        int n = array.length;

        /*
         Start from the last element and swap one by one. We don't
         need to run for the first element that's why i > 0
         */
        for (int i = n - 1; i > 0; i--) {
            int j = r.nextInt(i);
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }

    /**
     * Prints all values in a List<String>
     *
     * @param list List containing the values to be printed
     */
    private static void printValue(List<String> list) {
        for (String st : list) {
            System.out.println(st);
        }
    }

    // endregion
}
