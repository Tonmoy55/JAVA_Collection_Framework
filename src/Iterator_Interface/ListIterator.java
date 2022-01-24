package Iterator_Interface;

import java.util.ArrayList;
import java.util.Iterator;

public class ListIterator {
    public static void main(String[] args) {
        //Using Iterator
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(10);
        arrayList.add(12);
        arrayList.add(2);
        arrayList.add(6);
        Iterator<Integer> it =  arrayList.iterator();

        while (it.hasNext()){
            System.out.println("arrayList element: "+it.next());
        }
    }
}
