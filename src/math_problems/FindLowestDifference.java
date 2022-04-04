package math_problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class FindLowestDifference {

    /**
     * INSTRUCTIONS
     * Write a method to return the lowest number, that is not shared between the 2 arrays
     * HINT: The lowest number that isn't shared between these arrays is 1
     */

    public static void main(String[] args) {

        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1, -15};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19, -15};

        System.out.println(findLowestDifference(array1, array2));
    }

    public static int findLowestDifference(int[] array1, int[]array2){

        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        ArrayList<Integer> arrayList3 = new ArrayList<>();
        int lowest = Integer.MAX_VALUE;

        for(int num : array1){
            arrayList1.add(num);
        }

        for(int num : array2){
            arrayList2.add(num);
        }

        for(Integer num : arrayList1){
            if(!(arrayList2.contains(num))){
                arrayList3.add(num);
            }
        }

        for(Integer num : arrayList3){
            if(num < lowest){
                lowest = num;
            }
        }

        return lowest;

    }
}