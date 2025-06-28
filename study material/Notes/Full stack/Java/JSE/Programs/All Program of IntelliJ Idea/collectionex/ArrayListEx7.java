package collectionex;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx7 {
    public static void main(String[] args) {
        ArrayList<Integer> numList=new ArrayList<>();
        numList.add(25);
        numList.add(7);
        numList.add(15);
        numList.add(19);
        numList.add(8);
        System.out.println("Before sorting");
        System.out.println(numList);
        Collections.sort(numList);
        System.out.println("After sorting");
        System.out.println(numList);

    }
}
