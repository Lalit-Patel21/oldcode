import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx1 {
    public static void main(String[] args) {
        
        HashMap hm = new HashMap();
        hm.put(1, "Rahul");
         hm.put(2, "Rahu");
         hm.put(3, "Rahl");
         hm.put(4, "Rhul");
         hm.put(5, "Rahul");
         System.out.println(hm);
         System.out.println(hm.containsKey(3));
         System.out.println(hm.containsKey(0));
         System.out.println(hm.containsValue("Rahul"));
         System.out.println(hm.containsValue("fahul"));
         System.out.println(hm.remove(3));
         System.out.println(hm.remove(2,"Rahu"));
         System.out.println(hm.isEmpty());
         System.out.println(hm.replace(1,"Anil"));

         Set s = hm.entrySet();
         System.out.println(s);
         Iterator itr=s.iterator();
         while (itr.hasNext()) {
            // System.out.print(itr.next());
            Map.Entry entry = (Map.Entry)itr.next();
            System.out.print(entry.getKey()+" "+entry.getValue()+" ");
            
         }
         hm.clear();
         System.out.println(hm);
    }
}
