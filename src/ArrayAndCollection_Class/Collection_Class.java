package ArrayAndCollection_Class;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Collection_Class {
    public static void main(String[] args) {
        /**
         * ---------------------Available Methods in Collections----------------------
         *
         * 1. Collections.sort()                          --> To sort the array elements.
         * 2. Collections.min(list)                       --> To find the minimum element
         * 3. Collections.max(list)                       --> To find the maximum element
         * 4. Collections.frequency(list,value)           --> To fill all the array indexes with one specific value
         * */

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(50);
        arrayList.add(60);

        System.out.println("The list is: "+arrayList);
        System.out.println("\nMinimum value of the list is: "+ Collections.min(arrayList));
        System.out.println("\nMaximum value of the list is: "+ Collections.max(arrayList));

        Collections.sort(arrayList);
        System.out.println("\nAfter sorting the list: "+ arrayList);

        Collections.sort(arrayList, Comparator.reverseOrder());
        System.out.println("\nAfter sorting the list in reverse order: "+ arrayList);

    }
}
