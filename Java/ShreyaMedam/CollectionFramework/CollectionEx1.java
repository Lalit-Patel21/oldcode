import java.util.Collection;
import java.util.ArrayList;

public class CollectionEx1 {
    public static void main(String[] args) {
        ArrayList l = new ArrayList();

        // Collection Interface method
        //public boolean add(Object obj)

        l.add("jayesh");
        l.add("vikas");
        l.add("goutam");
        l.add("Mohit");
        l.add("Rishi");
        System.out.println(l);

        ArrayList l1 = new ArrayList();
        l1.add("yash");
        l1.add("kas");
        l1.add("tam");
        l1.add("hit");
        l1.add("shi");
        System.out.println(l1);

        // boolean containsAll(); 
        System.out.println(l.contains(l1));
        
        //public boolean addAll(Collection c)
        l.addAll(l1);
        System.out.println(l);

        //public boolean remove(Object obj)
        l1.remove("shi");
        l1.remove("tam");
        System.out.println(l1);

        //public boolean removeAll(Collection c)
        l1.removeAll(l1);
        System.out.println(l1);

      // boolean contains(); 
       System.out.println(l.contains("jayesh"));

      // int size(); 
      System.out.println(l.size());

      // void clear(); 
      l.clear();

       // boolean empty();
      System.out.println(l.isEmpty());
       

    }
    
}
