package java8features.lambdaexpression;


interface Printable<T>
{
    void printData(T data);
    default String printImage(String image1,String image2)
    {
        return "printing : "+ image1+" <===> "+image2;
    }

    static void printImage2(String image1,String image2)
    {
        System.out.println( "printing : "+ image1+" <===> "+image2);
    }
}

public class LambdaExample<T>{

    public static void main(String[] args) {

        //defining or implementing function

        Printable<String> printable = (String data)-> System.out.println("Print the given data : "+data);
        Printable<Integer> printable2 = (Integer param)-> {
            System.out.println("Print the given data1 : " + param);
            System.out.println("Print the given data2 : " + param);
            System.out.println("Print the given data3 : " + param);
            System.out.println("Print the given data4 : " + param);
            System.out.println("Print the given data5 : " + param);
            System.out.println("Print the given data6 : " + param);
            System.out.println("Print the given data7 : " + param);
            System.out.println("Print the given data8 : " + param);
        };

        //call function

        printable.printData("Anusha");
        printable.printData("Raashi");
        printable2.printData(10);
        printable2.printData(20);

        //when we have one parameter
        //when we multiple parameter
        //no arguments
    }
}
