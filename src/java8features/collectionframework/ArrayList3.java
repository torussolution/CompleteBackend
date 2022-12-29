package java8features.collectionframework;

import com.sun.org.apache.xpath.internal.operations.UnaryOperation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList3 {
    static List<String> list2 = new ArrayList<>();
    static List<String> intList = new ArrayList<>();
    public static   void insertFunctions()
    {
        // this is not a good practice

        list2.add("ten");
        list2.add("nine");
        list2.add("eight");
        list2.add("seven");
        list2.add("six");
        list2.add("five");
        list2.add("four");
        list2.add("ten");
        list2.add("three");
        list2.add("ten");

        intList.add("*");
    }

    public static void replaceData()
    {
        System.out.println("Before replacing data "+list2);
       boolean result = Collections.replaceAll(list2,"ten","*");
        System.out.println(result);
        System.out.println("After replacing value"+list2);
    }

    public static void setData(String newData,int index)
    {
        System.out.println(list2+"\n Before setting newValue to currentIndex : "+index+" : "+list2.get(index));

        list2.set(index,newData);

        System.out.println(list2+"\n After setting newValue to currentIndex : "+index+" : "+list2.get(index));
    }

    public static void replaceData2()
    {
        System.out.println("Before replacing data "+list2);
        list2.replaceAll(data->data.toUpperCase());
        list2.replaceAll(data->data+"-");
        System.out.println("After replacing value"+list2);
    }

    public static void main(String[] args) {
        insertFunctions();
        replaceData2();
    }
}
