package Collection_Interface.Set_Interface.LinkedHashSet_Class;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class LinkedHashSet_Class {
    public static void main(String[] args) {
        /**
         * Declaration of a LinkedHashSet
         */
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();

        /**
         * ---------------------Available Methods in LinkedHashSet----------------------
         *
         * 1. add()                     --> To add elements in the LinkedHashSet.
         * 2. addAll()                  --> To add all the elements of list_1 into list_2.
         * 3. remove(value)             --> To remove all the elements which is equal to value.
         * 4. removeAll(list_1)         --> To remove all the elements which is in list_1 from a LinkedHashSet.
         * 5. contains(value)           --> To check if a value is present in the LinkedHashSet or not.
         * 6. containsAll(list)         --> To check if all the items in list is present in LinkedHashSet or not.
         * 7. clear()                   --> To delete all the elements from the LinkedHashSet.
         *
         * N.B. LinkedHashSet maintains order of storing data elements.
         * */


        /**
         * 1. add()
         */
        System.out.println("\n1. add()");
        linkedHashSet.add(12);
        linkedHashSet.add(14);
        linkedHashSet.add(7);
        linkedHashSet.add(9);
        linkedHashSet.add(20);
        System.out.println("linkedHashSet: "+linkedHashSet);


        /**
         * 2. addAll()
         */
        System.out.println("\n2. addAll()");
        Integer[] array = {6,5,4,3,2,1}; //or
        //Integer[] array = new Integer[]{6,5,4,3,2,1};
        List<Integer> list = Arrays.asList(array);
        System.out.println("linkedHashSet:"+linkedHashSet);
        System.out.println("list:"+list);

        linkedHashSet.addAll(list);


        System.out.println("After adding all list items into linkedHashSet: "+linkedHashSet);

        /**
         * 3. remove(value)
         */
        System.out.println("\n3. remove(value)");
        System.out.println("linkedHashSet:"+linkedHashSet);
        linkedHashSet.remove(6);

        System.out.println("After removing  value 6 from the linkedHashSet: "+linkedHashSet);


        /**
         * 4. removeAll(list_1)
         */
        System.out.println("\n4. removeAll(list_1) ");
        System.out.println("linkedHashSet:"+linkedHashSet);

        Integer[] array_2 = {5,4};
        List<Integer> list_2 = Arrays.asList(array_2);
        System.out.println("list_2: "+list_2);
        linkedHashSet.removeAll(list_2);

        System.out.println("After removing 5,6 items from linkedHashSet: "+linkedHashSet);

        /**
         * 5. contains(value)
         */
        System.out.println("\n5. contains(value)");
        System.out.println("linkedHashSet: "+linkedHashSet);
        System.out.println("Is value 10 in the list_2..?\nAns:  "+linkedHashSet.contains(10));

        /**
         * 6. containsAll(list)
         */
        System.out.println("\n6. containsAll(list) ");
        System.out.println("linkedHashSet: "+linkedHashSet);

        Integer[] array_3= {2,3};
        List<Integer> list_3 = Arrays.asList(array_3);

        System.out.println("list_3: "+list_3);
        System.out.println("Is list_3 items are present in linkedHashSet .. ? \nAns: "+linkedHashSet.containsAll(list_3));

        /**
         * 7. clear()
         */
        System.out.println("\n7. clear() ");
        linkedHashSet.clear();


        System.out.println("After clearing linkedHashSet : "+linkedHashSet);
    }
}
