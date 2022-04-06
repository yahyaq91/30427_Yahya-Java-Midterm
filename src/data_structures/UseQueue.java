package data_structures;

import databases.SharedStepsDatabase;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class UseQueue {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Queue that includes add, peek, remove & poll elements.
         * Use For-Each loop and While-Loop with Iterator to retrieve data_structures.data.
         *
         * Store and retrieve data_structures.data from/to a database table.
         */

        List<Object> restaurantLine = new LinkedList<>();

        restaurantLine.add("John");
        restaurantLine.add("Hannah");
        restaurantLine.add("Adam");
        restaurantLine.add("Aaron");
        restaurantLine.add("Jay");

        System.out.println("Initial Queue: " + restaurantLine);

        ((LinkedList<Object>) restaurantLine).peek();
        System.out.println("Peeking at: " + ((LinkedList<Object>) restaurantLine).peek());

        restaurantLine.remove("Adam");
        System.out.println("After removal: " + restaurantLine);

        ((LinkedList<Object>) restaurantLine).poll();
        System.out.println("Final Queue after Poll: " + restaurantLine);

        Queue<String> letters = new LinkedList<>();

        letters.add("A");
        letters.add("B");
        letters.add("C");

        Iterator iterator = letters.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        for (String s : letters) {
            System.out.print(s + " ");
        }

        String tableName = "Restaurant_Line";
        String coloumnName = "name";
        SharedStepsDatabase sql = new SharedStepsDatabase();

        // IMPLEMENT HERE

        sql.insertList(tableName, coloumnName, restaurantLine);

        String query = "SELECT * FROM Restaurant_Line";

        try {
            coloumnName = String.valueOf(sql.executeQueryReadAll(query));
        } catch (
                SQLException e) {
            e.printStackTrace();
        }
        System.out.println(coloumnName);
    }
}
