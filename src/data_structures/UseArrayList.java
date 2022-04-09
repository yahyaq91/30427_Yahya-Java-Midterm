package data_structures;

import databases.SharedStepsDatabase;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class UseArrayList {

    public static void main(String[] args) throws Exception{

        /*
         * Demonstrate how to use ArrayList that includes using the add, peek, remove & retrieve methods.
         * Use For-Each loop and While-loop with Iterator to retrieve data_structures.data.
         *
         * Store and retrieve data_structures.data from/to a database table.
         */

        SharedStepsDatabase ssdb = new SharedStepsDatabase();


        List<Object> carList = new ArrayList();

        carList.add("Audi");
        carList.add("BMW");
        carList.add("Mercedes");
        carList.add("Tesla");
        carList.add("Bugatti");
        System.out.println("Initial ArrayList: " + carList);

        carList.remove("BMW");
        System.out.println("After removal: " + carList);


        String tableName = "Cars";
        String columnName = "car_make";

        ssdb.insertArrayList(tableName, carList);

        String query = "SELECT * FROM Cars";
        carList = Collections.singletonList(ssdb.executeQueryReadAll(query));

         System.out.println(carList);

    }

}
