package java8features.collectionframework.linkedlist;

import java.util.*;

public class LinkedListExample2 {
    public static void main(String[] args) {
        LinkedList<Integer> numberList = new LinkedList<>();
        numberList.add(10);
        numberList.add(20);
        numberList.add(30);
        numberList.add(40);
        numberList.add(50);
        numberList.add(60);
        numberList.add(70);

        System.out.println("check the element is there or not using contains function "+ numberList.contains(50));
        System.out.println("check the element is there or not using contains function "+ numberList.contains(100));

        Iterator<Integer>  integerIterator = numberList.iterator();

        while (integerIterator.hasNext())
        {
            System.out.println(integerIterator.next());
        }

        Object numbers[] = numberList.toArray();
        System.out.println(numbers[0]);

        List<Integer> sublist1 = numberList.subList(0,3);
        List<Integer> sublist2 = numberList.subList(3,numberList.size()-1);
        System.out.println(sublist1);
        System.out.println(sublist2);

        ListIterator<Integer> integerListIterator = numberList.listIterator(4);
        while (integerListIterator.hasNext())
        {
            System.out.println("print next value : "+integerListIterator.next());
        }

        while (integerListIterator.hasPrevious())
        {
            System.out.println("previous: "+integerListIterator.previous());
        }

        Iterator<Integer> descendingIte = numberList.descendingIterator();
        while (descendingIte.hasNext())
        {
            System.out.println(descendingIte.next());
        }


        System.out.println("print before offer method call : "+numberList);
        numberList.offer(1);
        System.out.println("print after offer method call : "+numberList);


        System.out.println("print before offerFirst method call : "+numberList);
        numberList.offerFirst(0);
        System.out.println("print after offerFirst method call : "+numberList);

        System.out.println("print before offerLast method call : "+numberList);
        numberList.offerLast(100);
        System.out.println("print after offerLast method call : "+numberList);

        System.out.println("Before sorting :"+numberList);
        Collections.sort(numberList);
        System.out.println("After sorting :"+numberList);

    }
}
