//1. Write a Java program to create an array list, add some colors (strings) and print out the collection.

// import java.util.ArrayList;

// public class ColleAsig1 {

//     public static void main(String[] args) {
        
//         ArrayList<String> al = new ArrayList<>();
//         al.add("Red");
//         al.add("Green");
//         al.add("blue");
//         al.add("Yellow");
//         System.out.println(al);
//     }

// }


// 2. Write a Java program to iterate through all elements in an array list.

//   import java.util.ArrayList;
//   import java.util.Iterator;
//   import java.util.ListIterator;

// public class ColleAsig1 {

//     public static void main(String[] args) {
        
//         ArrayList<String> al = new ArrayList<>();
//         al.add("Red");
//         al.add("Green");
//         al.add("blue");
//         al.add("Yellow");

//         Iterator itr = al.iterator();
//         while (itr.hasNext()) 
//         {
//          System.out.print(itr.next() +" ");   
//         }
       
//        System.out.println();  
        

//         ListIterator li = al.listIterator();
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
// 3. Write a Java program to insert an element into the array list at the first position.
//   import java.util.ArrayList;
//   public class ColleAsig1 {

//     public static void main(String[] args) {
        
//         ArrayList<String> al = new ArrayList<>();
//         al.add("Red");
//         al.add("Green");
//         al.add("blue");
//         al.add("Yellow");

//         System.out.println(al);
//         al.add(0, "black");
//         System.out.println(al);
//     }
// }
// 4. Write a Java program to retrieve an element (at a specified index) from a given array list.

//      import java.util.ArrayList;
//      public class ColleAsig1 {

//     public static void main(String[] args) {
        
//         ArrayList<String> al = new ArrayList<>();
//         al.add("Red");
//         al.add("Green");
//         al.add("blue");
//         al.add("Yellow");

//         System.out.println(al);
//         System.out.println(al.get(2));
//     }
// }
// 5. Write a Java program to update an array element by the given element.
//      import java.util.ArrayList;
//      public class ColleAsig1 {

//     public static void main(String[] args) {
        
//         ArrayList<String> al = new ArrayList<>();
//         al.add("Red");
//         al.add("Green");
//         al.add("blue");
//         al.add("Yellow");
//         System.out.println(al);
//         System.out.println(al.set(0, "black"));
//         System.out.println(al);
//     }
// }
// 6. Write a Java program to remove the third element from an array list.
//  import java.util.ArrayList;
//      public class ColleAsig1 {

//     public static void main(String[] args) {
        
//         ArrayList<String> al = new ArrayList<>();
//         al.add("Red");
//         al.add("Green");
//         al.add("blue");
//         al.add("Yellow");

//         System.out.println(al);
//         System.out.println(al.remove(3));
//         System.out.println(al);
//     }

// }


// 7. Write a Java program to search for an element in an array list.

//     import java.util.ArrayList;
//      public class ColleAsig1 {

//     public static void main(String[] args) {
        
//         ArrayList<String> al = new ArrayList<>();
//         al.add("Red");
//         al.add("Green");
//         al.add("blue");
//         al.add("Yellow");

//         System.out.println(al);
//         System.out.println(al.contains("blue"));
//         System.out.println(al.contains("black"));
//          System.out.println(al.indexOf("blue"));
//     }

// }
// 8. Write a Java program to sort a given array list.
//    import java.util.ArrayList;
//      public class ColleAsig1 {

//     public static void main(String[] args) {
        
//         ArrayList<String> al = new ArrayList<>();
//         al.add("Red");
//         al.add("Green");
//         al.add("blue");
//         al.add("Yellow");

//         System.out.println(al);
//         al.sort(null);
//         System.out.println(al);
//     }

// }

// 9. Write a Java program to copy one array list into another.
//    import java.util.ArrayList;
//      public class ColleAsig1 {

//     public static void main(String[] args) {
        
//         ArrayList<String> al = new ArrayList<>();
//         al.add("Red");
//         al.add("Green");
//         al.add("blue");
//         al.add("Yellow");

//         System.out.println(al);
       
//         ArrayList<String> al1 = new ArrayList<>(al);
//         System.out.println(al1);

        
//     }

// }
   
// 11. Write a Java program to reverse elements in an array list.
//    import java.util.ArrayList;
//      public class ColleAsig1 {

//     public static void main(String[] args) {
        
//         ArrayList<String> al = new ArrayList<>();
//         al.add("Red");
//         al.add("Green");
//         al.add("blue");
//         al.add("Yellow");

//         System.out.println(al); 
//         for(int i = al.size()-1;i>=0;i--)
//         {
//             System.out.print(al.get(i)+" ");
//         }  
//     }
// }

// 12. Write a Java program to extract a portion of an array list.
//     import java.util.ArrayList;
//      public class ColleAsig1 {

//     public static void main(String[] args) {
        
//         ArrayList<String> al = new ArrayList<>();
//         al.add("Red");
//         al.add("Green");
//         al.add("blue");
//         al.add("Yellow");

//         System.out.println(al); 
//        System.out.println(al.subList(1, 4));
//     }
// }
// 13. Write a Java program to compare two array lists.
//      import java.util.ArrayList;
//      public class ColleAsig1 {

//     public static void main(String[] args) {
        
//         ArrayList<String> al = new ArrayList<>();
//         al.add("Red");
//         al.add("Green");
//         al.add("blue");
//         al.add("Yellow");

//         System.out.println(al);
       
//         ArrayList<String> al1 = new ArrayList<>();
//         al1.add("Red");
//         al1.add("Green");
//         al1.add("blue");
//         al1.add("Yellow");
//         System.out.println(al1);

//         System.out.println(al.containsAll(al1));
//         System.out.println(al.equals(al1));
       
//          ArrayList<String> al2 = new ArrayList<>();
//         al2.add("Re");
//         al2.add("Gren");
//         al2.add("blu");
//         al2.add("Yel");
//         System.out.println(al2);
//         System.out.println(al.containsAll(al2));
//         System.out.println(al.equals(al2));
//     }

// }
// 14. Write a Java program that swaps two elements in an array list.
//      import java.util.ArrayList;
//      import java.util.Collections;
//      public class ColleAsig1 {

//     public static void main(String[] args) {
        
//         ArrayList<String> al = new ArrayList<>();
//         al.add("Red");
//         al.add("Green");
//         al.add("blue");
//         al.add("Yellow");

//         System.out.println(al); 
//     //    System.out.println(al.waps());
//         Collections.swap(al,0,2);
//         System.out.println(al);
//     }
// }
// 15. Write a Java program to join two array lists.
//   import java.util.ArrayList;
//      public class ColleAsig1 {

//     public static void main(String[] args) {
        
//         ArrayList<String> al = new ArrayList<>();
//         al.add("Red");
//         al.add("Green");
//         al.add("blue");
//         al.add("Yellow");

//         System.out.println(al);
       
//         ArrayList<String> al1 = new ArrayList<>();
//         al1.add("R");
//         al1.add("Gre");
//         al1.add("blu");
//         al1.add("Yel");
//         System.out.println(al1);
//         al.addAll(al1);
//         System.out.println(al);

//     }

// }
// 14. Write a Java program that swaps two elements in an array list.
    //   import java.util.ArrayList;
//      public class ColleAsig1 {

//     public static void main(String[] args) {
        
//         ArrayList<String> al = new ArrayList<>();
//         al.add("Red");
//         al.add("Green");
//         al.add("blue");
//         al.add("Yellow");

//         System.out.println(al); 
//        System.out.println(al.subList(1, 4));
//     }
// }

// 16. Write a Java program to clone an array list to another array list.
//   import java.util.ArrayList;
//      public class ColleAsig1 {

//     public static void main(String[] args) {
        
//         ArrayList<String> al = new ArrayList<>();
//         ArrayList<String> al1 = new ArrayList<>();
//         al.add("Red");
//         al.add("Green");
//         al.add("blue");
//         al.add("Yellow");

//         System.out.println(al); 

//         al1=(ArrayList)al.clone();
        
//         System.out.println(al1);
//         System.out.println(al.isEmpty());
//         System.out.println(al1.isEmpty());

//     }
// }
// 17. Write a Java program to empty an array list.
//    import java.util.ArrayList;
//      public class ColleAsig1 {

//     public static void main(String[] args) {
        
//         ArrayList<String> al = new ArrayList<>();
//         ArrayList<String> al1 = new ArrayList<>();
//         al.add("Red");
//         al.add("Green");
//         al.add("blue");
//         al.add("Yellow");

//         System.out.println(al); 
//         al.clear(); 
//         System.out.println(al.isEmpty());
//         System.out.println(al1.isEmpty());

//     }
// }
// 18. Write a Java program to test whether an array list is empty or not
//      import java.util.ArrayList;
//      public class ColleAsig1 {

//     public static void main(String[] args) {
        
//         ArrayList<String> al = new ArrayList<>();
//         ArrayList<String> al1 = new ArrayList<>();
//         al.add("Red");
//         al.add("Green");
//         al.add("blue");
//         al.add("Yellow");

//         System.out.println(al); 
//         System.out.println(al.isEmpty());
//         System.out.println(al1.isEmpty());

//     }
// }



                                          








