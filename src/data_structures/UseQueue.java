package data_structures;

import databases.SharedStepsDatabase;

import java.sql.SQLException;
import java.util.*;

public class UseQueue {

    public static void main(String[] args) throws SQLException {
        /*
         * Demonstrate how to use Queue that includes add, peek, remove & poll elements.
         * Use For-Each loop and While-Loop with Iterator to retrieve data_structures.data.
         *
         * Store and retrieve data_structures.data from/to a database table.
         */

        Queue<String> restaurantLine = new LinkedList<>();

        restaurantLine.add("Romario");
        restaurantLine.add("Zidan");
        restaurantLine.add("Ronaldo");
        restaurantLine.add("Kaka");
        restaurantLine.add("Cristiano");
        restaurantLine.add("Haaland");
        restaurantLine.add("Bruce");

        System.out.println("Initial Queue: " + restaurantLine);

        restaurantLine.peek();
        System.out.println("Peeking at: " + restaurantLine.peek());

        restaurantLine.remove("Romario");
        System.out.println("After removal: " + restaurantLine);

        restaurantLine.poll();
        System.out.println("Final Queue after Poll: " + restaurantLine);

        Queue<String> letters = new LinkedList<>();

        letters.add("V");
        letters.add("I");
        letters.add("P");

        Iterator iterator = letters.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        for (String s : letters) {
            System.out.print(s + " ");
        }

        String tableName = "Restaurant_Line";
        String columnName = "Guest_Names";
        SharedStepsDatabase sql = new SharedStepsDatabase();

        // IMPLEMENT HERE

        sql.insertQueue(tableName, restaurantLine);

        String query = "SELECT * FROM Restaurant_Line";

        columnName = String.valueOf(sql.executeQueryReadAll(query));

        System.out.println(columnName);
    }
}
