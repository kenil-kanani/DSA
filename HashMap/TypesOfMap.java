package HashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class TypesOfMap {
    public static void main(String[] args) {
        // HashMap
        // LinkedHashMap
        // TreeMap
        // WeakHashMap
        // IdentityHashMap
        // EnumMap
        // ConcurrentHashMap

        // HashMap
        // - order of insertion is not retained
        HashMap<Integer , String> hashMap = new HashMap<>();
        hashMap.put(2,"Kenil");
        hashMap.put(4,"Jatan");
        hashMap.put(1,"Vatsal");
        hashMap.put(5 , "Krish");

        System.out.println("HashMap of the given data is : " + hashMap);

        // LinkedHashMap
        // - order of insertion is retained
        LinkedHashMap<Integer , String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(2,"Kenil");
        linkedHashMap.put(4,"Jatan");
        linkedHashMap.put(1,"Vatsal");
        linkedHashMap.put(5 , "Krish");

        System.out.println("LinkedHashMap of the given data is : " + linkedHashMap);

        // TreeMap
        TreeMap<Integer , String> treeMap = new TreeMap<>();
        treeMap.put(2,"Kenil");
        treeMap.put(4,"Jatan");
        treeMap.put(1,"Vatsal");
        treeMap.put(5 , "Krish");

        System.out.println("TreeMap of the given data is : " + treeMap);

    }
}



