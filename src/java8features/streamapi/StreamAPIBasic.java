package java8features.streamapi;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class IntData
{
    String val1,val2;
    IntData(String val1,String val2)
    {
        this.val1=val1;
        this.val2 = val2;
    }

    @Override
    public String toString() {
        return "IntData{" +
                "val1=" + val1 +
                ", val2=" + val2 +
                '}';
    }
}
public class StreamAPIBasic {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(21110);
        arrayList.add(310);
        arrayList.add(40);
        arrayList.add(150);
        arrayList.add(5);
        arrayList.add(1);
        arrayList.add(11111);
        arrayList.add(0);
        //stream we pass Collection class/arrays

        //different operations on Stream

        /* Intermediate Operation */
        // map returns a stream[list,queue/linked/array] consisting of the resultant of the function[elemnt/2, element+"hai"]
        List interList = arrayList.stream().map(val->val/2).collect(Collectors.toList());
        System.out.println(interList);

        LinkedList<String> names = new LinkedList<>();
        names.add("Anusha");
        names.add("Raashi");
        names.add("Jyothsna");
        names.add("Ramya");
        names.add("Anannya");
        names.add("Anu");
        names.add("Abhishek");

        List<String> greetList = names.stream().map(name->"Hai "+name).collect(Collectors.toList());
        System.out.println(greetList);


        /* filter---> based on condition[predicate] we can sort data */
        Predicate<String> filter = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.startsWith("A");
            }
        };
        List<String> startWithA  = names.stream().filter(val->filter.test(val)).collect(Collectors.toList());
        System.out.println(startWithA);

        names.stream().filter(val->filter.test(val)).forEach(res-> System.out.println(res));


        List<String> startWithR  = names.stream().filter(data->data.startsWith("R")).collect(Collectors.toList());
        System.out.println(startWithR);

        /*sorted function sort the stream */
        List<Integer> integerList = arrayList.stream().sorted().collect(Collectors.toList());
        System.out.println(integerList);


        /*Terminal OPerations
        * collect() returns intermediate operations performed by stream
        * forEach()
        * reduce()
        * */
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1>o2?0:-1;
            }
        };
        ArrayList<IntData> list = new ArrayList<>();
        list.add(new IntData("A","B"));
        list.add(new IntData("A","C"));
        list.add(new IntData("A","A"));
        list.add(new IntData("A","D"));
        list.add(new IntData("D","A"));


        //list.stream().sorted().forEach(res-> System.out.println(res));
        list.stream().sorted((x,y)->x.val1.compareTo(y.val2)).forEach(res-> System.out.println(res));


        System.out.println(names.stream().anyMatch(val->val.length()==10));

        LinkedList<Integer> numList = new LinkedList<>();
        numList.add(10);
        numList.add(30);
        numList.add(33);
        numList.add(12);
        numList.add(15);
        numList.add(44);
        numList.add(70);
        LinkedList<Integer> numList2 = new LinkedList<>();
        numList.add(10);
        numList.add(30);
        numList.add(30);
        numList.add(12);
        numList.add(14);
        numList.add(44);
        numList.add(70);
        System.out.println("Check numList contains at least 1 odd number : "+numList.stream().anyMatch(val->val%2!=0));
        System.out.println("Check numList contains only odd number : "+numList.stream().allMatch(val->val%2!=0));
        System.out.println("Check numList contains only even number : "+numList.stream().allMatch(val->val%2==0));
        System.out.println("Check numList contains at least 1 even number : "+numList.stream().anyMatch(val->val%2==0));
        System.out.println("Check numList contains only even number : "+numList2.stream().allMatch(val->val%2==0));

        System.out.println("concat multiple streams");
        Stream<Float> stream1 = Stream.of(11.2f,2.3f,0.4f);
        Stream<Float> stream2 = Stream.of(11.2f,12.3f,10.4f);
        Stream<Integer> stream3 = Stream.of(11,3,104);
        Stream<Integer> stream4 = Stream.of(2,12,10);
        Stream<String> stream5 = Stream.of("Hi","Hello");
        Stream<String> stream6 = Stream.of("red","blue");
        //this concat function gives sorted/ordered data if  the stream1 and stream2 is sorted/ordered
        // Stream<Float> result = Stream.concat(Stream.concat(stream1.sorted(),stream2.sorted()),Stream.concat(stream3,stream4)); gives error for data type mismatch
        Stream result = Stream.concat(
                Stream.concat(
                        Stream.concat(stream1.sorted(),stream2.sorted()),Stream.concat(stream3,stream4)),
                Stream.concat(stream5,stream6));
        result.forEach(System.out::println);


        System.out.println("count of elements "+ names.stream().count());
        Stream<Float> streams = Stream.of(11.2f,2.3f,0.4f);
        System.out.println("number of elements : " +streams.count());

        //reduce operations---> reduces the stream data to single resultant
        //1000---> avg/sum/min/max

        Optional<String> res = names.stream().reduce((w1, w2)->w1.length()>w2.length()?w1:w2);
        System.out.println("Longest string in names list : "+ res);

    }


}
