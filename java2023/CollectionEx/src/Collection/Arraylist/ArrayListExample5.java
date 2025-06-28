
package Collection.Arraylist;

import java.util.ArrayList;
import java.util.List;


public class ArrayListExample5 {
     public static void main(String[] args) {
         
        List<String>monthsList=new ArrayList<>();
        
        monthsList.add("Jan");
        monthsList.add("Feb");
        monthsList.add("Mar");
        monthsList.add("Mar");
        
        System.out.println("Size ?"+monthsList.size());
        
        System.out.println("Jan index  ?"+monthsList.indexOf("Jan"));
        System.out.println("May index ?"+monthsList.indexOf("May"));
        System.out.println("feb index ?"+monthsList.indexOf("feb")); 
        System.out.println("Mar index ?"+monthsList.indexOf("Mar")); 
    }
    
}
    
    

