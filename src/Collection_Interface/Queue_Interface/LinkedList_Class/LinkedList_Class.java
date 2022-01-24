package Collection_Interface.Queue_Interface.LinkedList_Class;

import java.util.*;

public class LinkedList_Class {
    public static void main(String[] args) {
        /**
         * Declaration of a Queue with LinkedList
         */
        Queue<Integer> queue = new LinkedList<>();

        /**
         * ---------------------Available Methods in Queue----------------------
         *
         * 1. offer()                --> To add elements in the Queue.
         * 2. poll()                 --> To remove elements from the Queue. Returns null if the queue is empty.
         * 3. peek()                 --> To get the next element in the Queue which is about to remove. N.B. It will not remove that element from the Queue.
         * 4. isEmpty()              --> To check if the Queue is empty or not.
         * 5. contains(value)        --> To check if a value is present in the Queue or not.
         * 6. containsAll(queue_2)   --> To check if all the items in queue_2 is present in queue_1 or not.
         * 7. remove()               --> To remove first element from the Queue. N.B. remove()  is alternative of poll(). Throws an exception if the queue is empty.
         * 8. remove(value)          --> To remove all the elements which is equal to value.
         * 9. removeAll(list)        --> To remove all the elements which is in the list from a Queue.
         * 10. clear()               --> To delete all the elements from the queue.
         *
         * 11. Different ways of Iterations through Queue
         *
         *
         * N.B. In linkedList Queue there is no get(index_no), set(index_no) methods in it.
         * */

        /**
         * 1. offer()
         */
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        queue.offer(50);

        System.out.println("1. offer()");
        System.out.println("Queue: "+queue);

        /**
         * 2. poll()
         */
        System.out.println("\n2. poll() ");
        System.out.println("queue: "+queue);

        queue.poll();
        System.out.println("After one poll, queue: "+queue);

        /**
         * 3. peek()
         */
        System.out.println("\n3. peek()");
        System.out.println("queue: "+queue);

        System.out.println("Peak of the queue is: "+queue.peek());


        /**
         * 4. empty()
         */
        System.out.println("\n4. empty() ");
        System.out.println("queue: "+queue);

        System.out.println("The queue is empty or not..?\nAns: "+queue.isEmpty());

        /**
         * 5. contains(value)
         */
        System.out.println("\n5. contains(value)");
        System.out.println("queue: "+queue);

        System.out.println("Element 40 is in the queue or not..?\nAns: "+queue.contains(40));

        /**
         * 6. containsAll(queue_2)
         */
        Integer[] array = {30,40};
        List<Integer> list_1 = Arrays.asList(array);
        queue.containsAll(list_1);

        System.out.println("\n6.containsAll(queue_2)");
        System.out.println("list_1: "+list_1);
        System.out.println("queue: "+queue);
        System.out.println("Is list_1 items are present in the queue .. ? \nAns: "+queue.containsAll(list_1));

        /**
         * 7. remove()
         */
        System.out.println("\n7. remove() ");
        System.out.println("queue: "+queue);

        queue.remove();
        queue.remove();
        System.out.println("After call remove() two times, queue: "+queue);

        /**
         * 8. remove(value)
         */
        System.out.println("\n8. remove(value)");
        System.out.println("queue: "+queue);

        queue.remove(Integer.valueOf(40));

        System.out.println("After removing  value 40 from queue: "+queue);

        /**
         * 9. removeAll(list)
         */
        System.out.println("\n9. removeAll(list)");
        queue.offer(60);
        queue.offer(50);
        queue.offer(50);
        queue.offer(60);
        queue.offer(70);
        queue.offer(80);
        System.out.println("queue: "+queue);

        Integer[] array_2 = {50,60};
        List<Integer> list_2 = Arrays.asList(array_2);
        queue.removeAll(list_2);

        System.out.println("After removing 50,60 items from queue: "+queue);

        /**
         * 10. clear()
         */
        System.out.println("\n10. clear()");
        queue.clear();
        System.out.println("After clearing the queue: "+queue);

        /**
         * 11. Different ways of Iterations through queue
         */
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        queue.offer(50);
        queue.offer(60);

        //Using for loop
        System.out.println("\n\n11. Different ways of Iterations through queue");

        //Using foreach loop
        System.out.println("\nUsing foreach loop:\nqueue: "+queue+"\n");
        for (Integer element: queue){
            System.out.println("queue element: "+element);
        }

        //Using Iterator
        System.out.println("\nUsing Iterator:\nqueue: "+queue+"\n");
        Iterator<Integer> it =  queue.iterator();

        while (it.hasNext()){
            System.out.println("queue element: "+it.next());
        }

    }
}
