package collectionex;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx3 {
    public static void main(String[] args) {
        Set<String> names=new HashSet<>();
        names.add("Amit");
        names.add("Sumit");
        names.add("Amit");
        System.out.println("Total items:"+names.size());
        System.out.println("===================");
        for(String s:names){
            System.out.println(s);
        }
    }
}
