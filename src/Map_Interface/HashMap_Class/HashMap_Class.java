package Map_Interface.HashMap_Class;

import java.util.HashMap;
import java.util.HashMap;
import java.util.Map;

public class HashMap_Class {
    public static void main(String[] args) {
        /**
         * Declaration of a HashMap
         */
        HashMap<String,Integer> hashMap = new HashMap<>();

        /**
         * ---------------------Available Methods in HashMap----------------------
         *
         * 1. put()                     --> To add elements in the HashMap.
         * 2. putIfAbsent()             --> To check if a key is already present in the HashMap or not, if not present then add.
         * 3. containsKey()             --> To check if a key is in the HashMap or not.
         * 4. containsValue()           --> To check if a value is in the HashMap or not.
         * 5. remove(value)             --> To remove all the elements which is equal to value.
         * 6. entrySet()                --> To get all the Key,value entry from the HashMap
         * 7. keySet()                  --> To get all the Keys from the HashMap
         * 8. clear()                   --> To delete all the elements from the HashMap.
         *
         * 9. Different ways of Iterations through HashMap
         *
         * N.B. HashMap doesn't maintain any order of storing data elements.
         * */

        /**
         * 1. put()
         */
        System.out.println("\n1. put()");
        hashMap.put("One", 1);
        hashMap.put("Two",2);
        hashMap.put("Four",4);
        hashMap.put("Eight",8);
        System.out.println("hashMap: "+hashMap);

        /**
         * 2. putIfAbsent()
         */
        System.out.println("\n2. putIfAbsent()");
        System.out.println("hashMap: "+hashMap);
        hashMap.putIfAbsent("Four",10); // It will not put 10 because key "Four" is already in the HashMap
        System.out.println("hashMap: "+hashMap);

        /**
         * 3. containsKey()
         */
        System.out.println("\n3. containsKey()");
        System.out.println("hashMap: "+hashMap);
        System.out.println("Check if key Four is in the HashMap:"+hashMap.containsKey("Four"));

        /**
         * 4. containsValue()
         */
        System.out.println("\n4. containsValue()");
        System.out.println("hashMap: "+hashMap);
        System.out.println("Check if value 8 is in the HashMap:"+hashMap.containsValue(8));

        /**
         * 5. remove(value)
         */
        System.out.println("\n5. remove(value)");
        System.out.println("hashMap: "+hashMap);

        hashMap.remove("Four");
        System.out.println("After removing Four from the HashMap: "+hashMap);

        /**
         * 9. Different ways of Iterations through HashMap
         */
        System.out.println("\n8. Different ways of Iterations through HashMap");
        System.out.println("hashMap: "+hashMap);

        for (Map.Entry<String,Integer> element: hashMap.entrySet()){
            System.out.println("[key,value] : "+element.getKey()+","+element.getValue());
        }

        System.out.println();
        for (String key:hashMap.keySet()){
            System.out.println("[key] : "+key);
        }


        /**
         * 8. clear()
         */
        System.out.println("\n8. clear()");
        System.out.println("hashMap: "+hashMap);
        hashMap.clear();
        System.out.println("After clearing the hashMap: "+hashMap);

    }
}
