package collectionex;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx3 {
    public static void main(String[] args) {
        Map<Integer,String>st=new HashMap<>();
        st.put(101,"Ajay");
        st.put(102,"Chetan");
        st.put(103,"Ankit");
        System.out.println("Total st:"+st.size());
        System.out.println("Is 102 present ?"+st.containsKey(102));
        System.out.println("Is 104 present ?"+st.containsKey(104));

    }
}
