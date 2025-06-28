package collectionex;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

// How To loop Over Values Of a Map ?
public class HashMapEx5 {
    public static void main(String[] args) {
        Map<Integer,String>st=new HashMap<>();
        st.put(100,"Anmol");
        st.put(108,"Ravi");
        st.put(105,"Ajay");
        st.put(109,"Chetan");
        st.put(107,"Gagan");
        st.put(103,"Ankit");
        Collection<String> names=st.values();
        for(String str:names)
            System.out.println(str);

    }
}
