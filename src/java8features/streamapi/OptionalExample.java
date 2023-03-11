package java8features.streamapi;

import java.util.Optional;

public class OptionalExample {
    public static Integer avg(Optional<Integer> x, Optional<Integer> y)
    {
        System.out.println("x data is there or not "+x.isPresent());
        System.out.println("y data is there or not "+y.isPresent());

        System.out.println("check if data is there in x object,if not add 20 : "+x.orElse(20));
        System.out.println(y.get());
        Integer val1 = x.orElse(20);
        Integer val2 = y.get();
        return (val1+val2)/2;
    }
    public static void main(String[] args) {
//        String data = null;
//        String data2 = "hai";
//        System.out.println(data);
//        //option is a notnull type of object
//        System.out.println("Null data "+Optional.ofNullable(data));
//        System.out.println("data "+Optional.ofNullable(data2));
//        try {
//            System.out.println("null data " + Optional.of(data));
//        }
//        catch (Exception e)
//        {
//            e.printStackTrace();
//        }
//        System.out.println("data "+Optional.of(data2));
        Integer x = null;
        Integer y = new Integer(10);

        System.out.println("average data "+ avg(Optional.ofNullable(x),Optional.of(y)));

    }
}
