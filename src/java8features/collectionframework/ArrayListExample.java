package java8features.collectionframework;

import java.util.ArrayList;
import java.util.List;

/*List interface ----> ArrayList class*/
/*
* Array list can contains duplicate data/value/object
* Array list insertion order
* non synchronized
* via index we can access element
* primitive types are not allowed
* */
/*
* add
* addAll
* clear
* remove
* removeIf
* removeAll
* indexOf
* lastIndexOf
* get
* size
* isEmpty
* */
public class ArrayListExample {
    List list = new ArrayList();
    List<String> list1 = new ArrayList<>();
    List<String> list2 = new ArrayList<>();
    List<Integer> intList = new ArrayList<>();
    public  void insertFunctions()
    {
        // this is not a good practice

        list.add("Hi");
        list.add(10);
        list.add(1.2f);
        list.add(1.209);
        list.add('j');
        System.out.println(list);
        // declaring and init list
        // append the element/data at the end of a list
        list1.add("10");
        list1.add("9");
        list1.add("8");
        list1.add("7");
        System.out.println("Printing list1 data : \n"+ list1);
        //insert data at specific index
        System.out.println("inserting value 4 at index 2");
        list1.add(2,"4");
        System.out.println("Printing list1 data : \n"+ list1);
        System.out.println("append all the list element at end of the another list");
        list2.add("ten");
        list2.add("nine");
        list2.add("eight");
        list2.add("seven");

        list1.addAll(list2);
        System.out.println(list1);

        System.out.println("append all the list element at specific index of another list");
        list2.addAll(3,list1);
        System.out.println(list2);


    }

    public  void clearAllData()
    {
        list1.add("A");
        list1.add("B");
        list1.add("C");
        list1.add("D");
        System.out.println("Print all the elements of list1");
        System.out.println(list1);
        System.out.println("Clear all the elements from list1");
        list1.clear();
        System.out.println(list1);
        System.out.println("----------");
    }

    public void fetchData()
    {
        list1.add("A");
        list1.add("B");
        list1.add("C");
        list1.add("D");
        System.out.println("Print all the elements of list1");
        System.out.println(list1);
        System.out.println("Fetch the element form specific index ");
        System.out.println("Fetching 3rd index value : " +list1.get(3));
    }

    public void checkList()
    {
        list1.add("A");
        list1.add("B");
        list1.add("C");
        list1.add("D");
        System.out.println("Return size of list : "+ list1.size());
        System.out.println("Print all the elements of list1");
        System.out.println(list1);
        System.out.println("Clear all the elements from list1");
        list1.clear();
        System.out.println("check list is empty or not : "+ list1.isEmpty());
        System.out.println("Adding null value to list1");
        list1.add(null);
        System.out.println("check list is empty or not : "+ list1.isEmpty());
        intList.add(0);
        intList.add(0);
        intList.add(1);
        intList.add(2);
        intList.add(null);
        System.out.println(intList);
        System.out.println("Clear all the elements from list1");
        intList.clear();
        System.out.println("check list is empty or not : "+intList.isEmpty());
    }


    public static void main(String[] args) {
        ArrayListExample object = new ArrayListExample();
        object.checkList();
    }
}
