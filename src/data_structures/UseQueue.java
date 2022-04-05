package data_structures;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Queue that includes add, peek, remove & poll elements.
         * Use For-Each loop and While-Loop with Iterator to retrieve data_structures.data.
         *
         * Store and retrieve data_structures.data from/to a database table.
         */

        Queue<String> restaurantLine = new LinkedList<>();

        restaurantLine.add("John");
        restaurantLine.add("Hannah");
        restaurantLine.add("Adam");
        restaurantLine.add("Aaron");
        restaurantLine.add("Jay");

        System.out.println("Initial Queue: " + restaurantLine);

        restaurantLine.peek();
        System.out.println("Peeking at: " + restaurantLine.peek());

        restaurantLine.remove("Adam");
        System.out.println("After removal: " + restaurantLine);

        restaurantLine.poll();
        System.out.println("Final Queue after Poll: " + restaurantLine);

        Queue<String> letters = new LinkedList<>();

        letters.add("A");
        letters.add("B");
        letters.add("C");

        Iterator iterator = letters.iterator();

        while (iterator.hasNext())
        {
            System.out.print(iterator.next() + " ");
        }

        for (String s : letters)
        {
            System.out.print(s + " ");
        }
    }

}
