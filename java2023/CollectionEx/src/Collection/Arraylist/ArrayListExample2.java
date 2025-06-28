
package Collection.Arraylist;

import java.util.ArrayList;


public class ArrayListExample2 {
    
    public static void main(String[] args) {
        ArrayList<String> months=new ArrayList<>();
        months.add("Jan");
        months.add("Feb");
        months.add("Mar");
        months.add("Apr");
//        for(int i=0;i<months.size();i++)
//            System.out.println(months.get(i));

       for(String s:months)
       {
           System.out.println(s);
       }
       
//        months.forEach((s) -> 
//        {
//          System.out.println(s);
//        });

//        String s1=months.get(0);
//        System.out.println(months.get(0));
//       String s2=months.get(1);
//        System.out.println(s2);
//       String s3=months.get(2);
//        System.out.println(s3);
    
    }
    
}
