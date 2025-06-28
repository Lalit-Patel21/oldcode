
package Collection.Arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample3 {

    public static void main(String[] args) {
        List<String> monthsList = new ArrayList<>();
        monthsList.add("Jan");
        monthsList.add("Feb");
        monthsList.add("Mar");
        for(int i=0;i<=monthsList.size()-1;i++){
            String str=monthsList.get(i);
             System.out.print(i +" ");
            System.out.println(str);
    }
        for (String month : monthsList) {
            System.out.println(month);
        }
    }
}


