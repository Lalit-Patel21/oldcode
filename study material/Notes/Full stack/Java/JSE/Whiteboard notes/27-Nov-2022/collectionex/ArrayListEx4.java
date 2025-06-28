package collectionex;

import java.util.ArrayList;

public class ArrayListEx4 {
    public static void main(String[] args) {
        ArrayList<String> months=new ArrayList<>();
        months.add("Jan");
        months.add("Feb");
        months.add("Mar");
        months.add("Apr");
        System.out.println("Before removing:");
        System.out.println(months);
        months.remove("Mar");
        System.out.println("After removing:");
        System.out.println(months);

    }
}
