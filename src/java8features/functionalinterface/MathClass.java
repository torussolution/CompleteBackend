package java8features.functionalinterface;

public class MathClass{

    public static void main(String[] args) {
        // Anusha

//        Adder<Integer> obj = (Integer val,Integer val2)->val+val2;
//        Adder<String> obj2 = (String val,String val2)->val+val2;
//
//        //Raashi
//        Cubic cubic = (int num)->num*num*num;
//
//        Compare<String> compare = (String name1,String name2)-> String.valueOf(name1.compareTo(name2));
//
//
//        System.out.println(obj.add(10,20));
//
//        System.out.println(obj2.add("Hai","Anusha"));
//
//        System.out.println(cubic.cube(3));
//
//        System.out.println(compare.compareData("A","a"));
//        System.out.println((int) 'A');
//        System.out.println((int) 'a');

          String obj = new Adder<String>() {
              @Override
              public String add(String val, String val2) {
                  return val+val2;
              }
          }.add(" 10 "," 20 ");

        System.out.println(obj);

        Adder<Integer> obj2 = new Adder<Integer>() {
            @Override
            public Integer add(Integer val, Integer val2) {
                return val+val2;
            }
        };

        System.out.println(obj2.add(20,30));

    }
}
