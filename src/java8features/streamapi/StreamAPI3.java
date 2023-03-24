package java8features.streamapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI3 {
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

        ArrayList<Integer> list2 = new ArrayList<>();
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(10);
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(11);
        list3.add(13);
        list3.add(15);
        list3.add(17);

        Optional<Integer> firstData = list.stream().findFirst();
        System.out.println("First Element "+firstData);

        System.out.println("Min element is : "+list.stream().min(Comparator.naturalOrder()).isPresent());
        System.out.println("Min element is : "+list.stream().min(Comparator.naturalOrder()).get());

        System.out.println("Min element in list2 : "+list2.stream().min(Comparator.naturalOrder()).isPresent());

        System.out.println("Min element is equal to 20 ??: "+list2.stream().min(Comparator.naturalOrder()).equals(20));

        Supplier<Integer> supplier = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return 20;
            }
        };
        System.out.println("Min element in list2: "+list2.stream().min(Comparator.naturalOrder()).orElseGet(()->100));
        System.out.println("Min element in list1: "+list.stream().min(Comparator.naturalOrder()).orElseGet(()->100));
        System.out.println("Min element in list2: "+list2.stream().min(Comparator.naturalOrder()).orElseGet(()->Integer.MIN_VALUE));
        System.out.println("Min element in list2: "+list2.stream().min(Comparator.naturalOrder()).orElseGet(()->supplier.get()));

        System.out.println("Min element in list2: "+list2.stream().min(Comparator.naturalOrder()).orElse(10));

//        try {
//
//            System.out.println("Min element in list2: " + list2.stream().min(Comparator.naturalOrder()).orElseThrow(() -> new NullPointerException("No min element found in list2")));
//        }
//        catch (Exception e)
//        {
//            e.printStackTrace();
//        }
        list.stream().min(Comparator.naturalOrder()).ifPresent(value-> System.out.println("min value is there"));


        list.stream().min(Comparator.naturalOrder()).ifPresent((value)->{
            if(value%2==0)
                System.out.println("Even min value after modification  : "+value / 2);
            else
                System.out.println("odd min value after modification "+ value*2);
        });

        Predicate<Integer> predicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer%2==0;
            }
        };
        System.out.println("no even number found in list : "+list.stream().noneMatch(val->predicate.test(val)));
        System.out.println("no even number found in list3 : "+list3.stream().noneMatch(val->predicate.test(val)));

        list3.stream().peek((val)->
        {
            System.out.println(val+10);
        }).count();

        System.out.println("skip function");
        list.stream().skip(7).forEach(System.out::println);
    }
}
