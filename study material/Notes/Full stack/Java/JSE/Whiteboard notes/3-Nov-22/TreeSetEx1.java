package collectionex;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx1 {
    public static void main(String[] args) {
        Set<String> months=new TreeSet<>();
        months.add("Jan");
        months.add("Feb");
        months.add("Mar");
        months.add("Apr");
        System.out.println("===================");
        for(String s:months){
            System.out.println(s);
        }
    }
}
