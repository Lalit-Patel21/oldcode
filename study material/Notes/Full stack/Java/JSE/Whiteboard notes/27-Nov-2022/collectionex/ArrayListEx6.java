package collectionex;

import java.util.ArrayList;

public class ArrayListEx6 {
    public static void main(String[] args) {
        ArrayList<Integer> numList=new ArrayList<>();
        numList.add(10);
        numList.add(20);
        numList.add(30);
        System.out.println("Before removing:");
        System.out.println(numList);
        Integer obj=20;
        numList.remove(obj);
        System.out.println("After removing:");
        System.out.println(numList);

    }
}
