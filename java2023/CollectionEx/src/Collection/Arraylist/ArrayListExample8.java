
package Collection.Arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExample8 {
    
    public static void main(String[] args) {
         List<Integer>marksList=new ArrayList<>();
        marksList.add(45);
        marksList.add(35);
        marksList.add(80);
        marksList.add(26);
        Collections.sort(marksList);
        
        for(Integer m:marksList){
            System.out.println(m);
        }
    }
    
//    public static void main(String[] args) {
//         List<String>monthsList=new ArrayList<>();
//        monthsList.add("Jan");
//        monthsList.add("Feb");
//        monthsList.add("Mar");
//        monthsList.add("Apr");
//        Collections.sort(monthsList);
//        
//        for(String month:monthsList){
//            System.out.println(month);
//        }
    
}


