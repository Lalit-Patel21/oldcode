package collectionex;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {
    public static void main(String[] args) {
        List<String> months=new LinkedList<>();
        months.add("Jan");
        months.add("Feb");
        months.add("Mar");
        months.add("Apr");
        for(int i=0;i<months.size();i++){
            String s=months.get(i);
            System.out.println(s);
        }
        System.out.println("===================");
        for(String s:months){
            System.out.println(s);
        }
    }
}
