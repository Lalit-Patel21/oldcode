package collectionex;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

// How To loop Over Key-Values Of a Map ?
public class TreeMapEx {
    public static void main(String[] args) {
        Map<Integer,String>st=new TreeMap<>();
        st.put(100,"Anmol");
        st.put(108,"Ravi");
        st.put(105,"Ajay");
        st.put(109,"Chetan");
        st.put(107,"Gagan");
        st.put(103,"Ankit");
        Set<Map.Entry<Integer, String>> data=st.entrySet();
        for(Map.Entry<Integer,String> e:data){
            Integer roll=e.getKey();
            String name=e.getValue();
            System.out.println("Roll="+roll+",name="+name);
        }

    }
}
