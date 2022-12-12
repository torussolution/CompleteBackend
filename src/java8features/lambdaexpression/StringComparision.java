package java8features.lambdaexpression;

interface  Compare
{
    boolean compare(String str1,String str2);
}
public class StringComparision {


    public static void main(String[] args) {

        Compare compare = (String s1,String s2)->{
            if(s1.equals(s2))
                return true;
            if(s1.compareTo(s2)<0)
                return false;
            return false;
        };

        boolean var = compare.compare("Anusha","Raashi");
        System.out.println(var);
        System.out.println("------------------------");
        System.out.println(compare.compare("Hai","Hai"));
    }
}
