
package Collection.Arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample7 {
    public static void main(String[] args) {
        
         List<String>monthsList=new ArrayList<>();
        monthsList.add("Jan");
        monthsList.add("Feb");
        monthsList.add("Mar");
        
        System.out.println("Before removing feb");
        for(String month:monthsList){
            System.out.println(month);
        }
        
        System.out.println(monthsList.remove("Feb"));
        
         System.out.println("After removing feb");
        for(String month:monthsList){
            System.out.println(month);
        }
    }
    
}


