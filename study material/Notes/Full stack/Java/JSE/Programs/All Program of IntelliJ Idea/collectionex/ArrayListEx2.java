package collectionex;

import java.util.ArrayList;

public class ArrayListEx2 {
    public static void main(String[] args) {
        ArrayList<String> months=new ArrayList<>();
        months.add("Jan");
        months.add("Feb");
        months.add("Mar");
        months.add("Apr");
        for(int i=0;i<months.size();i++){
            String s=months.get(i);
            System.out.println(s);
        }
        System.out.println("===================");
        for(String s:months){
            System.out.println(s);
        }
    }
}
