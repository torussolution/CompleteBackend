package java8features.CollectionApi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class Improvements {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hai");
        list.add("Hello");
        list.add("Cool");
        list.add("Database");
        list.add("Java Backend");
        list.add("ice");

        //forEach method

       // list.forEach(data-> System.out.println(data));

        // remove the list object/ remove the data from list based on condition
       // list.removeIf(data->data.length()<=3);

        //System.out.println(list);

        Iterator<String> itr = list.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
        System.out.println("............................");


        Iterator<String> itr2 = list.iterator();
        //forEachRemaining----> check for the next object if and only if it is not null then will print the data
        itr2.forEachRemaining(data-> System.out.println(data));



    }
}
