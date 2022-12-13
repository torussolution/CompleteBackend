package java8features.collectionframework;

import java.util.ArrayList;

public class ArrayList2{
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Yellow");
        list.add("Black");
        list.add("white");
        list.add("Blue");
        list.add("Green");
        list.add("Yellow");
        list.add("purple");
        list.add("Gray");
        list.add("brown");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Green");
        list2.add("Yellow");

        System.out.println("Print list element : "+list);
        System.out.println("IndexOf is used to return the first occurrence of given object : Blue");
        System.out.println(list.indexOf("Blue"));
        System.out.println("lastIndexOf is used to return the last occurrence of given object : Blue");
        System.out.println(list.lastIndexOf("Blue"));

        System.out.println("IndexOf is used to return the first occurrence of given object : Red");
        System.out.println(list.indexOf("Red"));
        System.out.println("lastIndexOf is used to return the last occurrence of given object : Red");
        System.out.println(list.lastIndexOf("Red"));

        System.out.println("IndexOf is used to return the first occurrence of given object : pink");
        System.out.println(list.indexOf("pink"));
        System.out.println("lastIndexOf is used to return the last occurrence of given object : pink");
        System.out.println(list.lastIndexOf("pink"));

        System.out.println("===========================================================\n");
        System.out.println("Print list element : "+list);
        System.out.println("Remove based on index list.remove(0) : "+list.remove(0));
        System.out.println("Printing list after removing element at index 0 : "+list);


        System.out.println("===========================================================\n");
        System.out.println("Print list element : "+list);
        System.out.println("Remove based on object list.remove(Blue) : "+list.remove("Blue") +" remove function will remove only the first occurrence of object");
        System.out.println("Printing list after removing element Blue : "+list);

        System.out.println("===========================================================\n");
        System.out.println("Print list element : "+list);
        System.out.println("Remove based on collection object.removeAll(collectionObject) : "+list.removeAll(list2) );
        System.out.println("Printing list after removing list2 from list  : "+list);


        System.out.println("===========================================================\n");
        System.out.println("Print list element : "+list);
        System.out.println("Remove based on condition object.removeIf(condition) : remove element where the length is less than 4 ");
        list.removeIf(color->color.length()<=4);
        System.out.println("Printing list after removing list2 from list  : "+list);
    }
}
