package Collection_Interface.Queue_Interface.PriorityQueue_Class;

import java.util.*;

public class PriorityQueue_Class {
    public static void main(String[] args) {
        /**
         * Declaration of a PriorityQueue
         */
        Queue<Integer> priorityQueue = new PriorityQueue<>(); //For Min Heap implemented PriorityQueue. Minimum values priority is high here.
        //OR
        //Queue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder()); //For Max Heap implemented PriorityQueue. Maximum values priority is high here.

        /**
         * ---------------------Available Methods in PriorityQueue----------------------
         *
         * 1. offer()                --> To add elements in the PriorityQueue.
         * 2. poll()                 --> To remove elements from the PriorityQueue. Returns null if the PriorityQueue is empty.
         * 3. peek()                 --> To get the next element in the PriorityQueue which is about to remove. N.B. It will not remove that element from the PriorityQueue.
         * 4. isEmpty()              --> To check if the PriorityQueue is empty or not.
         * 5. contains(value)        --> To check if a value is present in the PriorityQueue or not.
         * 6. containsAll(queue_2)   --> To check if all the items in queue_2 is present in queue_1 or not.
         * 7. remove()               --> To remove first element from the PriorityQueue. N.B. remove()  is alternative of poll(). Throws an exception if the priorityQueue is empty.
         * 8. remove(value)          --> To remove all the elements which is equal to value.
         * 9. removeAll(list)        --> To remove all the elements which is in the list from a PriorityQueue.
         * 10. clear()               --> To delete all the elements from the priorityQueue.
         *
         * 11. Different ways of Iterations through PriorityQueue
         *
         *
         * N.B. In PriorityQueue by default it implements Min Heap. Minimum values priority is high here.
         *
         * */

        /**
         * 1. offer()
         */
        priorityQueue.offer(50);
        priorityQueue.offer(10);
        priorityQueue.offer(30);
        priorityQueue.offer(20);
        priorityQueue.offer(40);


        System.out.println("1. offer()");
        System.out.println("PriorityQueue: "+priorityQueue);

        /**
         * 2. poll()
         */
        System.out.println("\n2. poll() ");
        System.out.println("priorityQueue: "+priorityQueue);

        priorityQueue.poll();
        System.out.println("After one poll, priorityQueue: "+priorityQueue);

        /**
         * 3. peek()
         */
        System.out.println("\n3. peek()");
        System.out.println("priorityQueue: "+priorityQueue);

        System.out.println("Peak of the priorityQueue is: "+priorityQueue.peek());


        /**
         * 4. empty()
         */
        System.out.println("\n4. empty() ");
        System.out.println("priorityQueue: "+priorityQueue);

        System.out.println("The priorityQueue is empty or not..?\nAns: "+priorityQueue.isEmpty());

        /**
         * 5. contains(value)
         */
        System.out.println("\n5. contains(value)");
        System.out.println("priorityQueue: "+priorityQueue);

        System.out.println("Element 40 is in the priorityQueue or not..?\nAns: "+priorityQueue.contains(40));

        /**
         * 6. containsAll(queue_2)
         */
        Integer[] array = {30,40};
        List<Integer> list_1 = Arrays.asList(array);
        priorityQueue.containsAll(list_1);

        System.out.println("\n6.containsAll(queue_2)");
        System.out.println("list_1: "+list_1);
        System.out.println("priorityQueue: "+priorityQueue);
        System.out.println("Is list_1 items are present in the priorityQueue .. ? \nAns: "+priorityQueue.containsAll(list_1));

        /**
         * 7. remove()
         */
        System.out.println("\n7. remove() ");
        System.out.println("priorityQueue: "+priorityQueue);

        priorityQueue.remove();
        priorityQueue.remove();
        System.out.println("After call remove() two times, priorityQueue: "+priorityQueue);

        /**
         * 8. remove(value)
         */
        System.out.println("\n8. remove(value)");
        System.out.println("priorityQueue: "+priorityQueue);

        priorityQueue.remove(Integer.valueOf(40));

        System.out.println("After removing  value 40 from priorityQueue: "+priorityQueue);

        /**
         * 9. removeAll(list)
         */
        System.out.println("\n9. removeAll(list)");
        priorityQueue.offer(60);
        priorityQueue.offer(50);
        priorityQueue.offer(50);
        priorityQueue.offer(60);
        priorityQueue.offer(70);
        priorityQueue.offer(80);
        System.out.println("priorityQueue: "+priorityQueue);

        Integer[] array_2 = {50,60};
        List<Integer> list_2 = Arrays.asList(array_2);
        priorityQueue.removeAll(list_2);

        System.out.println("After removing 50,60 items from priorityQueue: "+priorityQueue);

        /**
         * 10. clear()
         */
        System.out.println("\n10. clear()");
        priorityQueue.clear();
        System.out.println("After clearing the priorityQueue: "+priorityQueue);

        /**
         * 11. Different ways of Iterations through priorityQueue
         */
        priorityQueue.offer(50);
        priorityQueue.offer(10);
        priorityQueue.offer(30);
        priorityQueue.offer(20);
        priorityQueue.offer(60);
        priorityQueue.offer(40);


        //Using for loop
        System.out.println("\n\n11. Different ways of Iterations through priorityQueue");

        //Using foreach loop
        System.out.println("\nUsing foreach loop:\npriorityQueue: "+priorityQueue+"\n");
        for (Integer element: priorityQueue){
            System.out.println("priorityQueue element: "+element);
        }

        //Using Iterator
        System.out.println("\nUsing Iterator:\npriorityQueue: "+priorityQueue+"\n");
        Iterator<Integer> it =  priorityQueue.iterator();

        while (it.hasNext()){
            System.out.println("priorityQueue element: "+it.next());
        }

    }
}
