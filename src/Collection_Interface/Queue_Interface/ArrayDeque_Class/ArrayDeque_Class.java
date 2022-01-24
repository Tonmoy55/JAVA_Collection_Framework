package Collection_Interface.Queue_Interface.ArrayDeque_Class;

import java.util.*;

public class ArrayDeque_Class {
    public static void main(String[] args) {
        /**
         * Declaration of a PriorityQueue
         */
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

        /**
         * ---------------------Available Methods in ArrayDeque----------------------
         *
         * 1. offer()                   --> To add elements in the ArrayDeque.
         * 2. offerFirst()              --> To add elements in the front side of an ArrayDeque.
         * 3. offerLast()               --> To add elements in the rear side of an ArrayDeque.
         * 4. poll()                    --> To remove elements from the ArrayDeque. Returns null if the ArrayDeque is empty.
         * 5. pollFirst()               --> To remove elements from the front side of an ArrayDeque. Returns null if the ArrayDeque is empty.
         * 6. pollLast()                --> To remove elements from the rear side of an ArrayDeque. Returns null if the ArrayDeque is empty.
         * 7. peek()                    --> To get the next element in the ArrayDeque which is about to remove. N.B. It will not remove that element from the ArrayDeque.
         * 8. peekFirst()               --> To get the next element in the ArrayDeque which is about to remove from the front side. N.B. It will not remove that element from the ArrayDeque.
         * 9. peekLast()                --> To get the next element in the ArrayDeque which is about to remove from the rear side. N.B. It will not remove that element from the ArrayDeque.
         * 10. isEmpty()                --> To check if the ArrayDeque is empty or not.
         * 11. contains(value)          --> To check if a value is present in the ArrayDeque or not.
         * 12. containsAll(queue_2)     --> To check if all the items in queue_2 is present in queue_1 or not.
         * 13. remove()                 --> To remove first element from the ArrayDeque. N.B. remove()  is alternative of poll(). Throws an exception if the priorityQueue is empty.
         * 14. remove(value)            --> To remove all the elements which is equal to value.
         * 15. removeAll(list)          --> To remove all the elements which is in the list from a ArrayDeque.
         * 16. clear()                  --> To delete all the elements from the ArrayDeque.
         *
         * 17. Different ways of Iterations through ArrayDeque
         *
         * */


        /**
         * 1. offer()
         */
        arrayDeque.offer(50);

        System.out.println("1. offer()");
        System.out.println("arrayDeque: "+arrayDeque);

        /**
         * 2. offerFirst()
         */
        System.out.println("\n2. offerFirst()  ");
        System.out.println("arrayDeque: "+arrayDeque);

        arrayDeque.offerFirst(60);

        System.out.println("After adding 60 from front side, arrayDeque: "+arrayDeque);

        /**
         * 3. offerLast()
         */
        System.out.println("\n3. offerLast()");
        System.out.println("arrayDeque: "+arrayDeque);

        arrayDeque.offerLast(70);

        System.out.println("After adding 70 from rear side, arrayDeque: "+arrayDeque);

        /**
         * 4. poll()
         */
        System.out.println("\n4. poll()");
        System.out.println("arrayDeque: "+arrayDeque);

        arrayDeque.poll();
        System.out.println("After one poll, arrayDeque: "+arrayDeque);

        /**
         * 5. pollFirst()
         */
        System.out.println("\n5. pollFirst()  ");
        System.out.println("arrayDeque: "+arrayDeque);

        arrayDeque.pollFirst();
        System.out.println("After one poll from the front side, arrayDeque: "+arrayDeque);

        /**
         * 6. pollLast()
         */
        System.out.println("\n6. pollLast()");
        arrayDeque.offer(90);
        System.out.println("arrayDeque: "+arrayDeque);

        arrayDeque.pollLast();
        System.out.println("After one poll from the rear side, arrayDeque: "+arrayDeque);


        /**
         * 7. peek()
         */
        System.out.println("\n7. peek()");
        arrayDeque.offer(10);
        arrayDeque.offer(30);
        arrayDeque.offer(20);
        System.out.println("arrayDeque: "+arrayDeque);

        System.out.println("Peak of the arrayDeque is: "+arrayDeque.peek());

        /**
         * 8. peekFirst()
         */
        System.out.println("\n8. peekFirst()");
        System.out.println("arrayDeque: "+arrayDeque);

        System.out.println("Peak of the arrayDeque from the front side: "+arrayDeque.peekFirst());

        /**
         * 9. peekLast()
         */
        System.out.println("\n9. peekLast()");
        System.out.println("arrayDeque: "+arrayDeque);

        System.out.println("Peak of the arrayDeque from the rear side: "+arrayDeque.peekLast());

        /**
         * 10. isEmpty()
         */
        System.out.println("\n10. isEmpty()");
        System.out.println("arrayDeque: "+arrayDeque);

        System.out.println("The arrayDeque is empty or not..?\nAns: "+arrayDeque.isEmpty());

        /**
         * 11. contains(value)
         */
        System.out.println("\n11. contains(value)");
        System.out.println("arrayDeque: "+arrayDeque);

        System.out.println("Element 40 is in the arrayDeque or not..?\nAns: "+arrayDeque.contains(40));

        /**
         * 12. containsAll(queue_2)
         */
        Integer[] array = {30,40};
        List<Integer> list_1 = Arrays.asList(array);
        arrayDeque.containsAll(list_1);

        System.out.println("\n12.containsAll(queue_2)");
        System.out.println("list_1: "+list_1);
        System.out.println("arrayDeque: "+arrayDeque);
        System.out.println("Is list_1 items are present in the arrayDeque .. ? \nAns: "+arrayDeque.containsAll(list_1));

        /**
         * 13. remove()
         */
        System.out.println("\n13. remove() ");
        System.out.println("arrayDeque: "+arrayDeque);

        arrayDeque.remove();
        arrayDeque.remove();
        System.out.println("After call remove() two times, arrayDeque: "+arrayDeque);

        /**
         * 14. remove(value)
         */
        System.out.println("\n14. remove(value)");
        System.out.println("arrayDeque: "+arrayDeque);

        arrayDeque.remove(Integer.valueOf(30));

        System.out.println("After removing  value 30 from arrayDeque: "+arrayDeque);

        /**
         * 15. removeAll(list)
         */
        System.out.println("\n15. removeAll(list)");
        arrayDeque.offer(60);
        arrayDeque.offer(50);
        arrayDeque.offer(50);
        arrayDeque.offer(60);
        arrayDeque.offer(70);
        arrayDeque.offer(80);
        System.out.println("arrayDeque: "+arrayDeque);

        Integer[] array_2 = {50,60};
        List<Integer> list_2 = Arrays.asList(array_2);
        arrayDeque.removeAll(list_2);

        System.out.println("After removing 50,60 items from arrayDeque: "+arrayDeque);

        /**
         * 16. clear()
         */
        System.out.println("\n16. clear()");
        arrayDeque.clear();
        System.out.println("After clearing the arrayDeque: "+arrayDeque);

        /**
         * 17. Different ways of Iterations through arrayDeque
         */
        arrayDeque.offer(50);
        arrayDeque.offer(10);
        arrayDeque.offer(30);
        arrayDeque.offer(20);
        arrayDeque.offer(60);
        arrayDeque.offer(40);


        //Using for loop
        System.out.println("\n\n17. Different ways of Iterations through arrayDeque");

        //Using foreach loop
        System.out.println("\nUsing foreach loop:\narrayDeque: "+arrayDeque+"\n");
        for (Integer element: arrayDeque){
            System.out.println("arrayDeque element: "+element);
        }

        //Using Iterator
        System.out.println("\nUsing Iterator:\narrayDeque: "+arrayDeque+"\n");
        Iterator<Integer> it =  arrayDeque.iterator();

        while (it.hasNext()){
            System.out.println("arrayDeque element: "+it.next());
        }

    }
}
