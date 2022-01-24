package Collection_Interface.List_Interface.ArrayList_Class;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayList_Class {
    public static void main(String[] args) {

        /**
         * Declaration of an ArrayList
         */
        List<Integer> list_1 = new ArrayList<>();

        /**
        * ---------------------Available Methods in ArrayList----------------------
        *
        * 1. add()                  --> To add elements in the ArrayList.
        * 2. addAll()               --> To add all the elements of list_1 into list_2.
        * 3. add(index_no,value)    --> To add a value in a specific index number.
        * 4. get(index_no)          --> To get an element by index number from the ArrayList.
        * 5. remove(index_no)       --> To remove an element from the list by index number.
        * 6. remove(value)          --> To remove all the elements which is equal to value.
        * 7. removeAll(list_1)        --> To remove all the elements which is in list_1 from a list_2.
        * 8. clear()                --> To delete all the elements from the list.
        * 9. set(index,value)       --> To update a value from a list.
        * 10. contains(value)       --> To check if a value is present in the list or not.
        * 11. containsAll(list)     --> To check if all the items in list-1 is present in list_2 or not.
        *
        * 12. Different ways of Iterations through list
        * add(),remove()  --> Time Complexity is O(N)
        * List size increase ratio is: n+n/2+1. Initially a list size is N= 10.
        * */

        /**
         * 1. add()  (Method : 1)
         */
        list_1.add(1);
        list_1.add(2);
        list_1.add(3);
        list_1.add(4);
        list_1.add(5);
        list_1.add(6);

        System.out.println("1. add()  (Method : 1)");
        System.out.println("Method : 1 Output list_1 --> "+list_1);

        /**
         * 1. add()  (Method : 2)
         */
        Integer[] array = {6,5,4,3,2,1}; //or
        //Integer[] array = new Integer[]{6,5,4,3,2,1};
        List<Integer> list_2 = Arrays.asList(array);

        System.out.println("\n1. add()  (Method : 2)");
        System.out.println("Method : 2 Output list_2 --> "+list_2);

        /**
         * 2. addAll()
         */
        list_1.addAll(list_2);

        System.out.println("\n2. addAll()");
        System.out.println("After adding all list_2 items into list_1: "+list_1);

        /**
         * 3. add(index_no,value)
         */
        list_1.add(1,1);
        list_1.add(2,1);
        System.out.println("\n3. add(index_no,value)");
        System.out.println("After adding  value 1 in index 1 & 2 list_1: "+list_1);
        /**
         * 4. get(index_no)
         */
        list_1.get(2);

        System.out.println("\n4. get(index_no)");
        System.out.println("list_1 : index 2 item is --> "+list_1.get(2));

        /**
         * 5. remove(index_no)
         */
        System.out.println("\n5. remove(index_no)");
        System.out.println("list_1: "+list_1);

        list_1.remove(1);

        System.out.println("After removing index 1 value from list_1: "+list_1);

        /**
         * 6. remove(value)
         */
        System.out.println("\n6. remove(value)");
        System.out.println("list_1: "+list_1);

        list_1.remove(Integer.valueOf(1));

        System.out.println("After removing  value 1 from list_1: "+list_1);

        /**
         * 7. removeAll()
         */
        System.out.println("\n7. removeAll()");
        System.out.println("list_1: "+list_1);

        Integer[] array_2 = {5,6};
        List<Integer> list_3 = Arrays.asList(array_2);
        list_1.removeAll(list_3);

        System.out.println("After removing 5,6 items from list_1: "+list_1);

        /**
         * 8. clear()
         */
        list_1.clear();

        System.out.println("\n8. clear() ");
        System.out.println("After clearing list_1 items of list_1: "+list_1);

        /**
         * 9. set(index,value)
         */
        System.out.println("\n9. set(index,value)");
        System.out.println("list_2: "+list_2);

        list_2.set(2,10);
        System.out.println("After updating index 2 with value 10. list_2: "+list_2);

        /**
         * 10. contains(value)
         */

        System.out.println("\n10. contains(value)");
        System.out.println("list_2: "+list_2);
        System.out.println("Is value 10 in the list_2..?\nAns:  "+list_2.contains(10));

        /**
         * 11. containsAll(list)
         */
        Integer[] array_3 = {5,6};
        List<Integer> list_4 = Arrays.asList(array_2);
        list_1.containsAll(list_4);

        System.out.println("\n11. containsAll(list) ");
        System.out.println("list_2: "+list_2);
        System.out.println("list_4: "+list_4);
        System.out.println("Is list_4 items are present in list_2 .. ? \nAns: "+list_2.containsAll(list_4));


        /**
         * 12. Different ways of Iterations in list
         */

        //Using for loop
        System.out.println("\n\n12. Different ways of Iterations in list");
        System.out.println("\nUsing for loop:\nlist_2: "+list_2+"\n");
        for (int i = 0 ; i<list_2.size();i++){
            System.out.println("list_2["+i+"]: "+list_2.get(i));
        }

        //Using foreach loop
        System.out.println("\nUsing foreach loop:\nlist_2: "+list_2+"\n");
        for (Integer element: list_2){
            System.out.println("list_2 element: "+element);
        }

        //Using Iterator
        System.out.println("\nUsing Iterator:\nlist_2: "+list_2+"\n");
        Iterator<Integer> it =  list_2.iterator();

        while (it.hasNext()){
            System.out.println("list_2 element: "+it.next());
        }
    }
}
