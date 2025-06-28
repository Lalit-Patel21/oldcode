import java.util.*;
import java.util.HashSet;
public class ArrayList1{
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(10);
        al.add("Collection Framework");
        al.add('l');
        al.add('l');
        System.out.println(al);


        HashSet hs = new HashSet<>();
        hs.add(10);
        hs.add("Collection Framework");
        hs.add('l');
        hs.add('l');
        System.out.println(hs);

        HashMap hm = new HashMap();
        hm.put(1, " Lalit Patel");
        hm.put(2, " Yash ");
        hm.put(2+" ", " Anil ");
        System.out.println(hm);


        ArrayList al1 = new ArrayList();
        al1.add(0,"Rahul");
        al1.add(1,"Collection Framework");
        al1.add(2,"Ritik");
        al1.add(3,"Krishna");
        System.out.println(al1);

        ArrayList al2 = new ArrayList(al1);

         System.out.println(al2);

    }
} 