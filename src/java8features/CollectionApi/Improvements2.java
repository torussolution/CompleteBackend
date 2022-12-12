package java8features.CollectionApi;

import java.util.*;

public class Improvements2 {

    public static void main(String[] args) {

        List<Integer> linkedList =  Arrays.asList(1,2,3,4,5,6);

        Iterator<Integer> iterator = linkedList.iterator();

       // iterator.forEachRemaining(val-> System.out.println(val));


        Spliterator<Integer> spliterator = linkedList.spliterator();

        //tryad--> verify if any other elements are there or not
//        while (spliterator.tryAdvance(data-> System.out.println(data)));
//        System.out.println(spliterator.tryAdvance(data-> System.out.println(data)));

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("CAT");
        list2.add("Tiger");
        list2.add("Cow");
        list2.add("Snake");
        list2.add("DOG");
        list2.add("LION");
        list2.add("Data");

        Spliterator<String>  spliterator1 = list2.spliterator();

        Spliterator<String>  spliterator2 = spliterator1.trySplit();

        System.out.println("Printing data using spliterator1: ");
        spliterator1.forEachRemaining(data-> System.out.println(data));

        System.out.println("-----------------------------------------");
        System.out.println("Printing data using spliterator2: ");
        while(spliterator2.tryAdvance(data-> System.out.println(data)));
    }
}
