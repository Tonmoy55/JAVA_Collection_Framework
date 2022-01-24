package Collection_Interface.Set_Interface.HashSet_Class;

import java.util.*;
import java.util.HashSet;

public class HashSet_Class {
    public static void main(String[] args) {
        /**
         * Declaration of a HashSet
         */
        HashSet<Integer> hashSet = new HashSet<>();

        /**
         * ---------------------Available Methods in HashSet----------------------
         *
         * 1. add()                     --> To add elements in the HashSet.
         * 2. addAll()                  --> To add all the elements of list_1 into list_2.
         * 3. remove(value)             --> To remove all the elements which is equal to value.
         * 4. removeAll(list_1)         --> To remove all the elements which is in list_1 from a HashSet.
         * 5. contains(value)           --> To check if a value is present in the HashSet or not.
         * 6. containsAll(list)         --> To check if all the items in list is present in HashSet or not.
         * 7. clear()                   --> To delete all the elements from the HashSet.
         *
         * N.B. HashSet maintains no order of storing data elements.
         * */


        /**
         * 1. add()
         */
        System.out.println("\n1. add()");
        hashSet.add(12);
        hashSet.add(14);
        hashSet.add(7);
        hashSet.add(9);
        hashSet.add(20);
        System.out.println("hashSet: "+hashSet);


        /**
         * 2. addAll()
         */
        System.out.println("\n2. addAll()");
        Integer[] array = {6,5,4,3,2,1}; //or
        //Integer[] array = new Integer[]{6,5,4,3,2,1};
        List<Integer> list = Arrays.asList(array);
        System.out.println("hashSet:"+hashSet);
        System.out.println("list:"+list);

        hashSet.addAll(list);


        System.out.println("After adding all list items into hashSet: "+hashSet);

        /**
         * 3. remove(value)
         */
        System.out.println("\n3. remove(value)");
        System.out.println("hashSet:"+hashSet);
        hashSet.remove(6);

        System.out.println("After removing  value 6 from the hashSet: "+hashSet);


        /**
         * 4. removeAll(list_1)
         */
        System.out.println("\n4. removeAll(list_1) ");
        System.out.println("hashSet:"+hashSet);

        Integer[] array_2 = {5,6};
        List<Integer> list_2 = Arrays.asList(array_2);
        System.out.println("list_2: "+list_2);
        hashSet.removeAll(list_2);

        System.out.println("After removing 5,6 items from hashSet: "+hashSet);

        /**
         * 5. contains(value)
         */
        System.out.println("\n5. contains(value)");
        System.out.println("hashSet: "+hashSet);
        System.out.println("Is value 10 in the list_2..?\nAns:  "+hashSet.contains(10));

        /**
         * 6. containsAll(list)
         */
        System.out.println("\n6. containsAll(list) ");
        System.out.println("hashSet: "+hashSet);

        Integer[] array_3= {2,3};
        List<Integer> list_3 = Arrays.asList(array_3);

        System.out.println("list_3: "+list_3);
        System.out.println("Is list_3 items are present in hashSet .. ? \nAns: "+hashSet.containsAll(list_3));

        /**
         * 7. clear()
         */
        System.out.println("\n7. clear() ");
        hashSet.clear();


        System.out.println("After clearing hashSet : "+hashSet);
    }
}
