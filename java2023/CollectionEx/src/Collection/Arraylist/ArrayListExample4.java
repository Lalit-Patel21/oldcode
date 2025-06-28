
package Collection.Arraylist;

import java.util.ArrayList;
import java.util.List;


public class ArrayListExample4 {
    public static void main(String[] args) {
        List<String>monthsList=new ArrayList<>();
        monthsList.add("Jan");
        monthsList.add("Feb");
        monthsList.add("Mar");
        System.out.println("Is Jan present ?"+monthsList.contains("Jan"));
        System.out.println("Is May present ?"+monthsList.contains("May"));
        System.out.println("Is feb present ?"+monthsList.contains("feb")); 
    }
    
}
    
    

