package Collection_Interface.Set_Interface.TreeSet_Class;

import java.util.Arrays;
import java.util.TreeSet;
import java.util.List;
import java.util.TreeSet;

public class TreeSet_Class {
    public static void main(String[] args) {
        /**
         * Declaration of a TreeSet
         */
        TreeSet<Integer> treeSet = new TreeSet<>();

        /**
         * ---------------------Available Methods in TreeSet----------------------
         *
         * 1. add()                     --> To add elements in the TreeSet.
         * 2. addAll()                  --> To add all the elements of list_1 into list_2.
         * 3. remove(value)             --> To remove all the elements which is equal to value.
         * 4. removeAll(list_1)         --> To remove all the elements which is in list_1 from a TreeSet.
         * 5. contains(value)           --> To check if a value is present in the TreeSet or not.
         * 6. containsAll(list)         --> To check if all the items in list is present in TreeSet or not.
         * 7. clear()                   --> To delete all the elements from the TreeSet.
         *
         * N.B. TreeSet keeps elements in sorted order.
         * */


        /**
         * 1. add()
         */
        System.out.println("\n1. add()");
        treeSet.add(12);
        treeSet.add(14);
        treeSet.add(7);
        treeSet.add(9);
        treeSet.add(20);
        System.out.println("treeSet: "+treeSet);


        /**
         * 2. addAll()
         */
        System.out.println("\n2. addAll()");
        Integer[] array = {6,5,4,3,2,1}; //or
        //Integer[] array = new Integer[]{6,5,4,3,2,1};
        List<Integer> list = Arrays.asList(array);
        System.out.println("treeSet:"+treeSet);
        System.out.println("list:"+list);

        treeSet.addAll(list);


        System.out.println("After adding all list items into treeSet: "+treeSet);

        /**
         * 3. remove(value)
         */
        System.out.println("\n3. remove(value)");
        System.out.println("treeSet:"+treeSet);
        treeSet.remove(6);

        System.out.println("After removing  value 6 from the treeSet: "+treeSet);


        /**
         * 4. removeAll(list_1)
         */
        System.out.println("\n4. removeAll(list_1) ");
        System.out.println("treeSet:"+treeSet);

        Integer[] array_2 = {5,4};
        List<Integer> list_2 = Arrays.asList(array_2);
        System.out.println("list_2: "+list_2);
        treeSet.removeAll(list_2);

        System.out.println("After removing 5,6 items from treeSet: "+treeSet);

        /**
         * 5. contains(value)
         */
        System.out.println("\n5. contains(value)");
        System.out.println("treeSet: "+treeSet);
        System.out.println("Is value 10 in the list_2..?\nAns:  "+treeSet.contains(10));

        /**
         * 6. containsAll(list)
         */
        System.out.println("\n6. containsAll(list) ");
        System.out.println("treeSet: "+treeSet);

        Integer[] array_3= {2,3};
        List<Integer> list_3 = Arrays.asList(array_3);

        System.out.println("list_3: "+list_3);
        System.out.println("Is list_3 items are present in treeSet .. ? \nAns: "+treeSet.containsAll(list_3));

        /**
         * 7. clear()
         */
        System.out.println("\n7. clear() ");
        treeSet.clear();


        System.out.println("After clearing treeSet : "+treeSet);
}
}
