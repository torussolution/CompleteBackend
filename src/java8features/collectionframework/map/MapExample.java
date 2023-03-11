package java8features.collectionframework.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {

    public static void main(String[] args) {
        //we need to pass Wrapperclass data type for key value pair
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("RED", 1);
        map1.put("RED", 2);
        map1.put("RED", 3);
        map1.put("RED", 4);
        map1.put("RED", 5); // Map will not allow us to create duplicate key pairs so it is overriding the final value with key
        System.out.println(map1);

        Map<String, Integer> colorMap = new HashMap<>();
        colorMap.put("Red", 2);
        colorMap.put("RED", 1);
        colorMap.put("Red", 3);  //Key are not case sensitive "string"
        System.out.println(colorMap);

        Map<String, String> dic = new HashMap<>();
        dic.put("A", "Auto");
        dic.put("B", "Ball");
        dic.put("C", "Computer");
        dic.put("D", "Dog");
        dic.put("E", "Dog");
        System.out.println(dic);

        System.out.println("Printing keys :" + dic.keySet());
        Set<String> keySet = dic.keySet();
        System.out.println(keySet.size());
        System.out.println(keySet.toArray()[0]);
        System.out.println(keySet.toArray()[1]);

        Set<Map.Entry<String, String>> entrySet = dic.entrySet();
        System.out.println(entrySet.toArray()[0]);

        for (Map.Entry<String, String> entrySet2 : dic.entrySet()) {  // 1st iter --> "A" :"Auto" , 2nd iter --> "B" : "Ball"
            System.out.println(entrySet2.getValue());
            System.out.println(entrySet2.getKey());
        }

        Map.Entry<String, String> entrySet3[] = dic.entrySet().toArray(new Map.Entry[0]);
        System.out.println(entrySet3[1].getValue());
        System.out.println(entrySet3[1].getKey());
    }
}
