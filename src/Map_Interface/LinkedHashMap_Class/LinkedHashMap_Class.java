package Map_Interface.LinkedHashMap_Class;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap_Class {
    public static void main(String[] args) {
        /**
         * Declaration of a LinkedHashMap
         */
        LinkedHashMap<String,Integer> linkedHashMap = new LinkedHashMap<>();

        /**
         * ---------------------Available Methods in LinkedHashMap----------------------
         *
         * 1. put()                     --> To add elements in the LinkedHashMap.
         * 2. putIfAbsent()             --> To check if a key is already present in the LinkedHashMap or not, if not present then add.
         * 3. containsKey()             --> To check if a key is in the LinkedHashMap or not.
         * 4. containsValue()           --> To check if a value is in the LinkedHashMap or not.
         * 5. remove(value)             --> To remove all the elements which is equal to value.
         * 6. entrySet()                --> To get all the Key,value entry from the LinkedHashMap
         * 7. keySet()                  --> To get all the Keys from the LinkedHashMap
         * 8. clear()                   --> To delete all the elements from the LinkedHashMap.
         *
         * 9. Different ways of Iterations through LinkedHashMap
         *
         * N.B. LinkedHashMap maintains the data insertion order.
         * */

        /**
         * 1. put()
         */
        System.out.println("\n1. put()");
        linkedHashMap.put("One", 1);
        linkedHashMap.put("Two",2);
        linkedHashMap.put("Four",4);
        linkedHashMap.put("Eight",8);
        System.out.println("linkedHashMap: "+linkedHashMap);

        /**
         * 2. putIfAbsent()
         */
        System.out.println("\n2. putIfAbsent()");
        System.out.println("linkedHashMap: "+linkedHashMap);
        linkedHashMap.putIfAbsent("Four",10); // It will not put 10 because key "Four" is already in the LinkedHashMap
        System.out.println("linkedHashMap: "+linkedHashMap);

        /**
         * 3. containsKey()
         */
        System.out.println("\n3. containsKey()");
        System.out.println("linkedHashMap: "+linkedHashMap);
        System.out.println("Check if key Four is in the LinkedHashMap:"+linkedHashMap.containsKey("Four"));

        /**
         * 4. containsValue()
         */
        System.out.println("\n4. containsValue()");
        System.out.println("linkedHashMap: "+linkedHashMap);
        System.out.println("Check if value 8 is in the LinkedHashMap:"+linkedHashMap.containsValue(8));

        /**
         * 5. remove(value)
         */
        System.out.println("\n5. remove(value)");
        System.out.println("linkedHashMap: "+linkedHashMap);

        linkedHashMap.remove("Four");
        System.out.println("After removing Four from the LinkedHashMap: "+linkedHashMap);

        /**
         * 9. Different ways of Iterations through LinkedHashMap
         */
        System.out.println("\n8. Different ways of Iterations through LinkedHashMap");
        System.out.println("linkedHashMap: "+linkedHashMap);

        for (Map.Entry<String,Integer> element: linkedHashMap.entrySet()){
            System.out.println("[key,value] : "+element.getKey()+","+element.getValue());
        }

        System.out.println();
        for (String key:linkedHashMap.keySet()){
            System.out.println("[key] : "+key);
        }


        /**
         * 8. clear()
         */
        System.out.println("\n8. clear()");
        System.out.println("linkedHashMap: "+linkedHashMap);
        linkedHashMap.clear();
        System.out.println("After clearing the linkedHashMap: "+linkedHashMap);

    }
}
