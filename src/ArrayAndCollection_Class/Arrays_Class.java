package ArrayAndCollection_Class;

import java.util.Arrays;

public class Arrays_Class {
    public static void main(String[] args) {
        /**
         * ---------------------Available Methods in Arrays----------------------
         *
         * 1. Arrays.sort()                               --> To sort the array elements.
         * 2. Arrays.binarySearch(array,value)            --> To search a specific value's index number
         * 3. Arrays.fill(value)                          --> To fill all the array indexes with one specific value
         * */
        Integer[] array = {2,4,6,5,8,9,7,3,10};
        Arrays.sort(array);
        for (int i = 0 ; i<array.length;i++){
            System.out.println(array[i]);
        }
        System.out.println("Index number of 10 is:"+Arrays.binarySearch(array,10));

        Arrays.fill(array,0);
        System.out.println("After filling the array with 0: ");
        for (int i  = 0 ; i< array.length; i++){
            System.out.print(array[i]+",");
        }


    }
}
