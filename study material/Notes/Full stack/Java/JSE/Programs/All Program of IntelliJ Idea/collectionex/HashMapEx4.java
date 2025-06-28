package collectionex;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

// How To loop Over Keys Of a Map ?
public class HashMapEx4 {
    public static void main(String[] args) {
        Map<Integer,String>st=new HashMap<>();
        st.put(100,"Anmol");
        st.put(108,"Ravi");
        st.put(105,"Ajay");
        st.put(109,"Chetan");
        st.put(107,"Gagan");
        st.put(103,"Ankit");
        Set<Integer>rollNos=st.keySet();
        for(Integer r:rollNos)
            System.out.println(r);

    }
}
