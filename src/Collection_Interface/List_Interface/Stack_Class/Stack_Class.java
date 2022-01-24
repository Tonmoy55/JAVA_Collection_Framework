package Collection_Interface.List_Interface.Stack_Class;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class Stack_Class {
    public static void main(String[] args) {
        /**
         * Declaration of a Stack
         */
        Stack<Integer> stack = new Stack<>();

        /**
         * ---------------------Available Methods in Stack----------------------
         *
         * 1. push()                 --> To add elements in the Stack.
         * 2. pop()                  --> To remove elements from the Stack.
         * 3. peak()                 --> To get the topmost element from a Stack. N.B. It will not remove that element from the stack.
         * 4. empty()                --> To check if the stack is empty or not.
         * 5. contains(value)        --> To check if a value is present in the Stack or not.
         * 6. containsAll(stack_2)   --> To check if all the items in stack_2 is present in stack_1 or not.
         * 7. get(index_no)          --> To get an element by index number from the Stack.
         * 8. set(index,value)       --> To update a value from a stack.
         * 9. remove(index_no)       --> To remove an element from the Stack by index number.
         * 10. remove(value)         --> To remove all the elements which is equal to value.
         * 11. removeAll(list)       --> To remove all the elements which is in the list from a Stack.
         * 12. clear()               --> To delete all the elements from the list.
         *
         * 13. Different ways of Iterations through Stack
         *
         * */

        /**
         * 1. push()
         */
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);

        System.out.println("1. push()");
        System.out.println("Stack is: "+stack);

        /**
         * 2. pop()
         */
        stack.pop();
        System.out.println("\n2. pop()");
        System.out.println("After pop from the Stack: "+stack);

        /**
         * 3. peak()
         */
        System.out.println("\n3. peak()");
        System.out.println("Peak of the Stack is: "+stack.peek());


        /**
         * 4. empty()
         */
        System.out.println("\n4. empty()  ");
        System.out.println("If Stack is empty or not..?: \nAns: "+stack.empty());


        /**
         * 5. contains(value)
         */

        System.out.println("\n5. contains(value)");
        System.out.println("stack: "+stack);
        System.out.println("Is value 10 in the stack..?\nAns:  "+stack.contains(10));

        /**
         * 6. containsAll(list_1)
         */
        Integer[] array_1 = {10,70};
        List<Integer> list_1 = Arrays.asList(array_1);
        stack.containsAll(list_1);

        System.out.println("\n6.containsAll(list_1)");
        System.out.println("list_1: "+list_1);
        System.out.println("stack: "+stack);
        System.out.println("Is list_1 items are present in the stack .. ? \nAns: "+stack.containsAll(list_1));

        /**
         * 7. get(index_no)
         */
        stack.get(2);

        System.out.println("\n7. get(index_no) ");
        System.out.println("Stack:"+stack);
        System.out.println("stack : index 2 item is --> "+stack.get(2));

        /**
         * 8. set(index,value)
         */
        System.out.println("\n8. set(index,value)");
        System.out.println("stack: "+stack);
        stack.set(2,60);

        System.out.println("After updating index 2 with value 60. Stack: "+stack);

        /**
         * 9. remove(index_no)
         */
        System.out.println("\n9. remove(index_no)");
        System.out.println("stack: "+stack);
        stack.remove(1);

        System.out.println("After removing index 1 value from stack: "+stack);

        /**
         * 10. remove(value)
         */
        System.out.println("\n10. remove(value) ");
        System.out.println("stack: "+stack);

        stack.remove(Integer.valueOf(10));

        System.out.println("After removing  value 10 from stack: "+stack);

        /**
         * 11. removeAll()
         */
        System.out.println("\n11. removeAll()  ");
        stack.add(1,60);
        stack.add(3,50);
        System.out.println("stack: "+stack);

        Integer[] array_2 = {50,60};
        List<Integer> list_2 = Arrays.asList(array_2);
        stack.removeAll(list_2);

        System.out.println("After removing 50,60 items from stack: "+stack);


        /**
         * 12. clear()
         */
        System.out.println("\n12. clear()");
        stack.clear();
        System.out.println("After clearing the Stack: "+stack);

        /**
         * 13. Different ways of Iterations through Stack
         */
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);

        //Using for loop
        System.out.println("\n\n13. Different ways of Iterations through Stack");
        System.out.println("\nUsing for loop:\nstack: "+stack+"\n");
        for (int i = 0 ; i<stack.size();i++){
            System.out.println("stack["+i+"]: "+stack.get(i));
        }

        //Using foreach loop
        System.out.println("\nUsing foreach loop:\nstack: "+stack+"\n");
        for (Integer element: stack){
            System.out.println("stack element: "+element);
        }

        //Using Iterator
        System.out.println("\nUsing Iterator:\nstack: "+stack+"\n");
        Iterator<Integer> it =  stack.iterator();

        while (it.hasNext()){
            System.out.println("stack element: "+it.next());
        }

    }
}
