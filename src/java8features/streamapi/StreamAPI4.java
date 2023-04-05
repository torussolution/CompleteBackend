package java8features.streamapi;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI4 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);
        list1.add(60);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(110);
        list2.add(120);
        list2.add(130);
        list2.add(140);
        list2.add(150);
        list2.add(160);

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(210);
        list3.add(220);
        list3.add(230);
        list3.add(240);
        list3.add(250);
        list3.add(260);

        ArrayList<Integer> list4 = new ArrayList<>();
        list4.add(310);
        list4.add(320);
        list4.add(330);
        list4.add(340);
        list4.add(350);
        list4.add(360);

        List<List<Integer>> numberLists = new ArrayList<>();
        numberLists.add(list1);
        numberLists.add(list2);
        numberLists.add(list3);
        numberLists.add(list4);


        ArrayList<String> listName = new ArrayList<>();
        listName.add("Anusha");
        listName.add("Rashi");
        listName.add("Prathibha");
        listName.add("vidhya");
        listName.add("Anil");
        listName.add("Abhi");


        /*
        flatMap is used to work with streams of data. On executing the stream terminal operation, flatMap operation
        transform all the resultant streams/ streams into a single new stream
         */

        List<Integer> resultList = numberLists.stream().flatMap(testList->testList.stream().map(val->val/2)).collect(Collectors.toList());
        //resultList.forEach(System.out::println);

        //System.out.println("============================================");
        List<Integer> resultList2 = numberLists.stream().flatMap(testList->testList.stream()).collect(Collectors.toList());
        //resultList2.forEach(System.out::println);

        //System.out.println("Stream.forEach\n");
        //listName.stream().forEach(System.out::println);
        //System.out.println("parallelStream.forEach\n");
        //listName.parallelStream().forEach(System.out::println);
        Stream<String> fileData = null;
        try {
            fileData = Files.lines(new File("C:\\Users\\raojy\\Desktop\\streamData.txt").toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }

        fileData.forEach(System.out::println);
        System.out.println("\n============\n");
        fileData.close();
        try {
            fileData = Files.lines(new File("C:\\Users\\raojy\\Desktop\\streamData.txt").toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
        fileData.parallel().forEach(System.out::println);
    }
}
