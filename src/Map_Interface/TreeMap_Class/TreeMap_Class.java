package Map_Interface.TreeMap_Class;

import java.util.TreeMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMap_Class {
    public static void main(String[] args) {
        /**
         * Declaration of a TreeMap
         */
        TreeMap<String,Integer> treeMap = new TreeMap<>();

        /**
         * ---------------------Available Methods in TreeMap----------------------
         *
         * 1. put()                     --> To add elements in the TreeMap.
         * 2. putIfAbsent()             --> To check if a key is already present in the TreeMap or not, if not present then add.
         * 3. containsKey()             --> To check if a key is in the TreeMap or not.
         * 4. containsValue()           --> To check if a value is in the TreeMap or not.
         * 5. remove(value)             --> To remove all the elements which is equal to value.
         * 6. entrySet()                --> To get all the Key,value entry from the TreeMap
         * 7. keySet()                  --> To get all the Keys from the TreeMap
         * 8. clear()                   --> To delete all the elements from the TreeMap.
         *
         * 9. Different ways of Iterations through TreeMap
         *
         * N.B. TreeMap stores data in a sorted order. If key is String then it will sort alphabetical order.
         * TreeMap internally uses BST(Binary Search Tree). Time Complexity - O(logN)
         * */

        /**
         * 1. put()
         */
        System.out.println("\n1. put()");
        treeMap.put("One", 1);
        treeMap.put("Two",2);
        treeMap.put("Four",4);
        treeMap.put("Eight",8);
        System.out.println("treeMap: "+treeMap);

        /**
         * 2. putIfAbsent()
         */
        System.out.println("\n2. putIfAbsent()");
        System.out.println("treeMap: "+treeMap);
        treeMap.putIfAbsent("Four",10); // It will not put 10 because key "Four" is already in the TreeMap
        System.out.println("treeMap: "+treeMap);

        /**
         * 3. containsKey()
         */
        System.out.println("\n3. containsKey()");
        System.out.println("treeMap: "+treeMap);
        System.out.println("Check if key Four is in the TreeMap:"+treeMap.containsKey("Four"));

        /**
         * 4. containsValue()
         */
        System.out.println("\n4. containsValue()");
        System.out.println("treeMap: "+treeMap);
        System.out.println("Check if value 8 is in the TreeMap:"+treeMap.containsValue(8));

        /**
         * 5. remove(value)
         */
        System.out.println("\n5. remove(value)");
        System.out.println("treeMap: "+treeMap);

        treeMap.remove("Four");
        System.out.println("After removing Four from the TreeMap: "+treeMap);

        /**
         * 9. Different ways of Iterations through TreeMap
         */
        System.out.println("\n9. Different ways of Iterations through TreeMap");
        System.out.println("treeMap: "+treeMap);

        for (Map.Entry<String,Integer> e: treeMap.entrySet()){
            System.out.println("[key,value] : "+e.getKey()+","+e.getValue());
        }

        System.out.println();
        for (String key:treeMap.keySet()){
            System.out.println("[key] : "+key);
        }


        /**
         * 8. clear()
         */
        System.out.println("\n8. clear()");
        System.out.println("treeMap: "+treeMap);
        treeMap.clear();
        System.out.println("After clearing the treeMap: "+treeMap);

    }
}
