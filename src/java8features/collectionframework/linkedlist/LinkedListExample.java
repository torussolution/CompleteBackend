package java8features.collectionframework.linkedlist;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/*
* Singly
* Double linked
* Circular
* */
public class LinkedListExample {
    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("A");
        linkedList.add("C");
        System.out.println(linkedList);
        linkedList.add(1,"B");
        System.out.println(linkedList);

        LinkedList<Integer> numberList = new LinkedList<>();
        numberList.add(10);
        numberList.add(20);
        numberList.add(30);
        numberList.add(40);
        numberList.add(50);

        //trying to add integer list to string list
        //linkedList.addAll(numberList); error

        LinkedList<String> stringList = new LinkedList<>();
        stringList.add("10");
        stringList.add("20");
        stringList.add("30");
        stringList.add("40");
        stringList.add("50");

        linkedList.addAll(stringList);
        System.out.println(linkedList);

        System.out.println("Print list size : "+linkedList.size());

        System.out.println("print first element : " + linkedList.get(0));



        for (String s:
             linkedList) {
            System.out.print(s+" ");
        }

        linkedList.forEach(ele-> System.out.print(ele+" "));

        LinkedList<String> stringList2 = new LinkedList<>();
        stringList2.add("*");
        stringList2.add("(");
        stringList2.add(")");
        stringList2.add("+");
        stringList2.add("-");


        linkedList.addAll(2,stringList2);
        System.out.println(linkedList);


        linkedList.addFirst("Head");
        linkedList.addLast("Tail");
        System.out.println(linkedList);


        linkedList.push("push data");
        System.out.println(linkedList);
        linkedList.add("add data");
        System.out.println(linkedList);

        System.out.println("Retrieve first element : "+ linkedList.peek());
        System.out.println("Retrieve first element : "+ linkedList.peekFirst());
        System.out.println("Retrieve last element : "+ linkedList.peekLast());

        LinkedList<String> listEmpty = new LinkedList<>();
        System.out.println("Retrieve first element : "+ listEmpty.peek());
        System.out.println("Retrieve first element : "+ listEmpty.peekFirst());
        System.out.println("Retrieve last element : "+ listEmpty.peekLast());

        System.out.println("Remove the first element : " + linkedList.remove());
        System.out.println("Remove the element based on index : " + linkedList.remove(3));
        System.out.println("Remove the element based on object ref : " + linkedList.remove("Z"));
        System.out.println("Remove the element based on object ref : " + linkedList.remove("C"));
        System.out.println("Remove the first element/top most element : " + linkedList.removeFirst());
        System.out.println("Remove the last element/tail element : " + linkedList.removeLast());


        LinkedList<String> list2 = new LinkedList<>();
        list2.add("Red");
        list2.add("+");
        list2.add("Hai");
        list2.add("+");
        list2.add("Red");
        list2.add("Blue");
        list2.add("Green");
        list2.add("White");
        list2.add("Red");
        list2.add("+");

        System.out.println(list2);
        System.out.println("Remove the first occurrence of the specific element : "+list2.removeFirstOccurrence("+"));
        System.out.println(list2);
        System.out.println("Remove the last occurrence of the specific element : "+list2.removeLastOccurrence("+"));
        System.out.println(list2);
        System.out.println(list2.removeIf(ele->ele.length()<=3));
        System.out.println("Removed element where the length is <= 3 : "+list2);
        System.out.println("RemoveAll : collection object : "+ list2.removeAll(list2));
        System.out.println(list2);

        LinkedList<Integer> list3 = new LinkedList<>();
        list3.add(10);
        list3.add(20);
        list3.add(30);
        list3.add(40);
        list3.add(50);
        System.out.println("Retrieve top most element from the list : "+list3.peek());
        System.out.println(list3);
        System.out.println("Delete top most element from the list : "+list3.pop());
        System.out.println(list3);
        System.out.println("Delete top most element from the list : "+list3.poll());
        System.out.println(list3);
        System.out.println("Delete top most element from the list : "+list3.pollFirst());
        System.out.println(list3);
        System.out.println("Delete bottom most element from the list : "+list3.pollLast());
        System.out.println(list3);

        list3.set(0,10);
        System.out.println("updating/replacing element based on index:"+list3);

        System.out.println("Check list is empty or not : "+ list3.isEmpty());
        System.out.println("Check list is empty or not : "+ list2.isEmpty());
    }
}
