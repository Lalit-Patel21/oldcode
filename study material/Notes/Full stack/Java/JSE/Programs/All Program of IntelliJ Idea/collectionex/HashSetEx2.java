package collectionex;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx2 {
    public static void main(String[] args) {
        Set<String> months=new HashSet<>();
        months.add("Jan");
        months.add("Feb");
        months.add("Mar");
        months.add("Apr");
        System.out.println("===================");
        Iterator <String>it=months.iterator();
        while(it.hasNext()){
            String str=it.next();
            System.out.println(str);
        }
    }
}
