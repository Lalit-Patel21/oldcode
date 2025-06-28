package collectionex;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx12 {
    public static void main(String[] args) {
        Map<Integer,String>st=new HashMap<>();
        st.put(101,"Ajay");
        st.put(102,"Chetan");
        st.put(103,"Ankit");
        System.out.println("Total st:"+st.size());
        String name;
        name=st.get(102);
        System.out.println(name);
        name=st.get(104);
        System.out.println(name);

    }
}
