package java8features.lambdaexpression;

@FunctionalInterface
interface FunctionInterExample
{
    void test();
}


public class TestFunction implements FunctionInterExample {

    @Override
    public void test() {
        System.out.println("Testing...");
    }


    public static void main(String[] args) {
        FunctionInterExample obj = new FunctionInterExample() {
            @Override
            public void test() {
                System.out.println("Testing...");
            }
        };

        // lambda expression
        FunctionInterExample obj2 = () -> System.out.println("testing....");
    }


}
