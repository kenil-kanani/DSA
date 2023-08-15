package HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapFunctions {
    public static void main(String[] args) {
    HashMap<Integer , String> hashMap = new HashMap<>();

    // functionality of put function
    hashMap.put(2,"Kenil");
    hashMap.put(4,"Jatan");
    hashMap.put(1,"Vatsal");
    hashMap.put(5 , "Krish");

    System.out.println("HashMap of the given data is : " + hashMap);

    // functionality of get function
        System.out.println();
        String result = hashMap.get(2);
        System.out.println("Value of the given key is : " + result);

    // functionality of containsKey function
        System.out.println();
        System.out.println("HashMap contains key 2 ? :- " + hashMap.containsKey(2));
        System.out.println("HashMap contains key 3 ? :- " + hashMap.containsKey(3));

        // functionality of remove function
        System.out.println();
        System.out.println("HashMap before removing the key 4 : " + hashMap);
        hashMap.remove(4);
        System.out.println("Updated HashMap : " + hashMap);

        // iterating using the for loop
        System.out.println();
        System.out.println("Iterating using the for loop");
        System.out.println("Key" + " " + "Value");
        for(Map.Entry<Integer , String> e : hashMap.entrySet()){
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}
