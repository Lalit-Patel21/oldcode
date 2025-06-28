package OopsExample;

import java.util.*;

public class UseMyString {
    public static void main(String[] args) {

        Scanner s= new Scanner(System.in);

        System.out.println("Enter a string :");
        String str=s.next();

        MyString obj=new MyString(str);
        obj.reverseString();
        obj.showString();
    }
}
