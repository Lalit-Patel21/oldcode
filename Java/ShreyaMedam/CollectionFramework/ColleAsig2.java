package ShreyaMedam.CollectionFramework;



// import java.util.LinkedList;

// public class ColleAsig2 {
//     public static void main(String[] args) {
        
//         LinkedList ll = new LinkedList();
//         ll.add("Ram");
//         ll.add("shyam");
//         ll.add("krishna");
//         ll.add(3, "rahgunath");
//         ll.add(4,"hari");
//         System.out.println(ll);
//     }
    
// }

// import java.util.LinkedList;
// import java.util.ListIterator;
// import java.util.Iterator;
// public class ColleAsig2 {
//     public static void main(String[] args) {
        
//         LinkedList ll = new LinkedList();
//         ll.add("Ram");
//         ll.add("shyam");
//         ll.add("krishna");
//         ll.add(3, "rahgunath");
//         ll.add(4,"hari");
//         System.out.println(ll);

//         Iterator itr = ll.iterator();
//         while (itr.hasNext()) 
//         {
//          System.out.print(itr.next() +" ");   
//         }
       
//        System.out.println();  
        

//         ListIterator li = ll.listIterator();
//         while (li.hasNext()) {
//              System.out.print(li.next() +" ");  
//         }
        
//         System.out.println();   

//         while (li.hasPrevious()) {
//              System.out.print(li.previous() +" ");  
//         }
//         System.out.println();
//     }

// }


// import java.util.LinkedList;
// import java.util.ListIterator;
// import java.util.Iterator;
// public class ColleAsig2 {
//     public static void main(String[] args) {
        
//         LinkedList ll = new LinkedList();
//         ll.add("Ram");
//         ll.add("shyam");
//         ll.add("krishna");
//         ll.add(3, "rahgunath");
//         ll.add(4,"hari");


//         System.out.println(ll);

//         Iterator itr = ll.iterator();
//         while (itr.hasNext()) 
//         {
//          System.out.print(itr.next() +" ");   
//         }
//         System.out.println();  
        
//         ListIterator li = ll.listIterator(1);

//         while (li.hasNext()) {
//              System.out.print(li.next() +" ");  
//         }
         
//         System.out.println();   

//         while (li.hasPrevious()) {
//              System.out.print(li.previous() +" ");  
//         }
//         System.out.println();
//     }

// }


// import java.util.LinkedList;
// import java.util.Iterator;
// public class ColleAsig2 {
//     public static void main(String[] args) {
        
//         LinkedList ll = new LinkedList();
//         ll.add("Ram");
//         ll.add("shyam");
//         ll.add("krishna");
//         ll.add(3, "rahgunath");
//         ll.add(4,"hari");
//         ll.addFirst("ViratSwarup");
//         ll.addLast("Shivrupam");

       
//         System.out.println( ll.getFirst());
//         System.out.println(ll.getLast());
//         System.out.println(ll);

//         System.out.println();

//         Iterator itr = ll.descendingIterator();
//         while (itr.hasNext()) 
//         {
//          System.out.print(itr.next() +" ");   
//         }
//         System.out.println();  
     
//         itr = ll.iterator();
//          while (itr.hasNext()) 
//         {
//          System.out.print(itr.next() +" ");   
//         }
//         System.out.println();  

//        for(int i=0; i<ll.size(); i++){
//         System.out.println(i+" "+ll.get(i));
//        }
//         ll.remove(3);
//         ll.removeFirst();
//         ll.removeLast();
//         System.out.println(ll);

//         ll.removeAll(ll);
//         System.out.println(ll);
//     }
// }

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
public class ColleAsig2 {
    public static void main(String[] args) {
        
        HashSet hs = new HashSet<>();
        hs.add(10);
        hs.add("Collection Framework");
        hs.add('l');
        hs.add("hasmap");
      
        System.out.println(hs);

        Iterator itr1 = hs.iterator();
        while (itr1.hasNext()) 
        {
         System.out.print(itr1.next() +" ");   
        }

        System.out.println();

        Set s = new HashSet();
        s.add("anil");
        s.add("rahul");
        s.add("java");

        Iterator itr = s.iterator();
        while (itr.hasNext()) 
        {
         System.out.print(itr.next() +" ");   
        }

        System.out.println();
        TreeSet ts=new TreeSet<>();
        ts.add("yellow");
        ts.add("green");
        ts.add("black");
        ts.add("red");
        ts.add("pink");
        ts.add("brown");
        ts.add("white");
        System.out.println(ts);
        ts.descendingIterator()
    }
}




