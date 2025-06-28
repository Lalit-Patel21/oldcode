package collectionex;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx8 {
    public static void main(String[] args) {
        ArrayList<String> strList=new ArrayList<>();
        strList.add("RAVI");
        strList.add("SUMIT");
        strList.add("ANIL");
        strList.add("SONAL");
        strList.add("SONALI");
        System.out.println("Before sorting");
        System.out.println(strList);
        Collections.sort(strList);
        System.out.println("After sorting");
        System.out.println(strList);

    }
}
