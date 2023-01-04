package java8features.collectionframework;

public class DynamicArray {
    private int[] dynamicArray;
    private int arraySize;
    private int index;

    public DynamicArray()
    {
        dynamicArray = new int[5];
        index = 0;
        arraySize = 5;
    }

    public void addElement(int value)
    {
        if(index == arraySize)
        {
            //increase or extend array size
            increaseSize();
        }
        //add data to the array
        dynamicArray[index] = value;
        index++;
    }
    public  void increaseSize()
    {
        System.out.println("Increasing array size");
        int newArray[] = null;
        if(index == arraySize)
        {
            newArray = new int[arraySize * 2];
            for (int i = 0;i<arraySize;i++)
                newArray[i] = dynamicArray[i];
        }
        System.out.println("Address of dynamic array : "+dynamicArray);
        System.out.println("Address of newArray : "+newArray);
        dynamicArray = newArray; // copy the address of newArray to dynamic array
        System.out.println("dynamicArray = newArray ");
        System.out.println("Address of dynamic array : "+dynamicArray);
        arraySize *= 2;
    }
    public void print() {
        for (int a : dynamicArray) {
            if(a>0)
            System.out.print(a + " ");
        }
    }
    public static void main(String[] args) {
        DynamicArray array = new DynamicArray();
        array.addElement(1);
        array.addElement(2);
        array.addElement(3);
        array.addElement(4);
        array.addElement(5);
        System.out.println(array.arraySize);
        array.print();
        array.addElement(6);
        System.out.println(array.arraySize);
        array.print();
        array.addElement(7);
        array.addElement(8);
        array.addElement(9);
        array.addElement(10);
        array.addElement(11);
        array.addElement(12);
        array.addElement(13);
        System.out.println(array.arraySize);
        array.print();
    }
}
