package java8features.functionalinterface;

import java.awt.event.ActionListener;
import java.util.concurrent.Callable;

@FunctionalInterface
interface Printing
{
    void print();
}

interface Square
{
    int square(int val);
}
public class FunctionInterfaceExample {

    public static void main(String[] args) {

        Square square = (int num)->num*num;
        Printing printing = ()-> System.out.println("Welcome to function interface");
        printing.print();
        System.out.println(square.square(10));

    }
}
