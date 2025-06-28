package collectionex;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx1 {
    public static void main(String[] args) {
        Map<Integer,String>st=new HashMap<>();
        System.out.println(st.put(101,"Ajay"));
        System.out.println(st.put(102,"Chetan"));
        System.out.println(st.put(101,"Ankit"));
        System.out.println("Total st:"+st.size());
        System.out.println(st);

    }
}
