package sorting;

public class Sorting {


    /**
     * INSTRUCTIONS
     * You must implement all of the sorting algorithms below. Feel free to add any helper methods that you may need,
     * but make sure they are private, as to not be accessed outside of this class.
     * <p>
     * You must also store the sorted arrays into their own individual database tables (Selection Sort should be stored
     * in table `selection_sort`, Insertion Sort should be stored in table `insertion_sort`)
     */

    long executionTime = 0;

    public static void printSortedArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public int[] selectionSort(int[] array) {
        final long startTime = System.currentTimeMillis();

        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min])
                    min = j;
            }

            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }

        final long endTime = System.currentTimeMillis();
        this.executionTime = endTime - startTime;

        return array;
    }

    public int[] insertionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        // IMPLEMENT HERE

        int n = array.length;
        for (int i = 1; i < n; ++i) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }

        final long endTime = System.currentTimeMillis();
        this.executionTime = endTime - startTime;

        return array;
    }

    public int[] bubbleSort(int[] array) {
        // IMPLEMENT HERE
        final long startTime = System.currentTimeMillis();

        int n = array.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }

        final long endTime = System.currentTimeMillis();
        this.executionTime = endTime - startTime;


        return array;
    }

    public int[] mergeSort(int[] array) {
        // IMPLEMENT HERE

        final long startTime = System.currentTimeMillis();

        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min])
                    min = j;
            }

            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }

        final long endTime = System.currentTimeMillis();
        this.executionTime = endTime - startTime;

        return array;
    }

    public int[] quickSort(int[] array) {
        // IMPLEMENT HERE
        final long startTime = System.currentTimeMillis();

        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min])
                    min = j;
            }

            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }

        final long endTime = System.currentTimeMillis();
        this.executionTime = endTime - startTime;

        return array;

    }

    public int[] heapSort(int[] array) {
        // IMPLEMENT HERE

        int n = array.length;
        for (int i = n / 2 - 1; i >= 0; i--)
            heap(array, n, i);
        for (int i = n - 1; i > 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            heap(array, i, 0);
        }
        return array;
    }

    private void heap(int[] arr2, int k, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        if (l < k && arr2[l] > arr2[largest])
            largest = l;
        if (r < k && arr2[r] > arr2[largest])
            largest = r;
        if (largest != i) {
            int swap = arr2[i];
            arr2[i] = arr2[largest];
            arr2[largest] = swap;
            heap(arr2, k, largest);
        }

    }



    public int[] bucketSort(int[] array) {
        //implement here
        final long startTime = System.currentTimeMillis();

        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min])
                    min = j;
            }

            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }

        final long endTime = System.currentTimeMillis();
        this.executionTime = endTime - startTime;

        return array;
    }

    public int[] shellSort(int[] array) {
        //implement here
        final long startTime = System.currentTimeMillis();

        int n = array.length;
        for (int i = 0; i < n; ++i) {
            n = array.length;

        for (int gap = n/2; gap > 0; gap /= 2) {
            for (i = gap; i < n; i += 1) {
                int temp = array[i];
                int j;
                for (j = i; j >= gap && array[j - gap] > temp; j -= gap)
                    array[j] = array[j - gap];

                array[j] = temp;
            }
        }

        }

        final long endTime = System.currentTimeMillis();
        this.executionTime = endTime - startTime;

        return array;
    }
}
