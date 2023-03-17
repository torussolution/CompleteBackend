package java8features.streamapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamAPI2 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);
        list.add(100);
        list.add(80);
        list.add(90);
        list.add(100);
        list.add(210);
        list.add(220);
        list.add(230);
        list.add(240);
        list.add(250);
        list.add(260);
        list.add(270);
        list.add(8220);
        list.add(2920);
        list.add(21200);
        list.add(280);
        list.add(290);
        list.add(2100);
        list.add(110);
        list.add(210);
        list.add(310);
        list.add(410);
        list.add(510);
        list.add(610);
        list.add(710);
        list.add(801);
        list.add(901);
        list.add(1010);
        list.add(810);
        list.add(910);
        list.add(1100);

        ArrayList<String> colors = new ArrayList<>();
        colors.add("RED");
        colors.add("red");
        colors.add("red");
        colors.add("BLUE");
        colors.add("GREEN");
        colors.add("green");




        //identity --- > initial value , accumulator ---->  combines two or more values[function]

        Optional greatestNum = list.stream().reduce((val1, val2)->val1>val2?val1:val2);
        System.out.println("Print max number : "+greatestNum);

        Optional sumOfAll = list.stream().reduce((val1,val2)->val1+val2);
        System.out.println("Print sum of all list element : "+sumOfAll);

        int result = list.stream().reduce(0,(total,data)->total+data);
        System.out.println(result);

        System.out.println("Print all elements from list");
        list.forEach(data-> System.out.println(data));
        System.out.println("Print only distinct Elements");
        list.stream().distinct().forEach(System.out::println);

        System.out.println("================================");
        System.out.println("Print all elements from list");
        colors.forEach(data-> System.out.println(data));
        System.out.println("Print only distinct Elements");
        colors.stream().distinct().forEach(System.out::println);

        List<Integer> distinctData = list.stream().distinct().collect(Collectors.toList());
        long distinctDataCount = list.stream().distinct().count();

        System.out.println("count of distinct elements in list : "+distinctDataCount);
        for (int data :distinctData)
        {
            System.out.println(data);
        }


        list.stream().limit(5).distinct().forEach(System.out::println);
        System.out.println("Print total students count in class  : "+list.size());
        List<Integer> list2 = list.stream().limit((int)list.size()/2).collect(Collectors.toList());
        list2.stream().forEach(System.out::println);
        System.out.println("Number of students in java class "+list2.size());;

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer x, Integer y) {
                return (x < y) ? -1 : ((x == y) ? 0 : 1);
            }
        };

       int maxResult = list.stream().max(Integer::compareTo).get();
       int maxRev = list.stream().max(Comparator.reverseOrder()).get();
       int maxNatu = list.stream().max(Comparator.naturalOrder()).get();


       int max = list.stream().max((val1,val2)->comparator.compare(val1,val2)).get();
        System.out.println("Max value is : "+maxResult);
        System.out.println("Max value in reverse : "+maxRev);
        System.out.println("Max value in reverse : "+maxNatu);
        System.out.println("Max value  : "+max);

    }
}
