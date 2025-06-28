package accountex;

import java.util.Scanner;

public class UseAccount {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter id,name and bal for object 1");
        //.....
        //'''''
        //'''''
        Account obj1;
        obj1=new Account(101,"Amit",50000.0);
        obj1.showAccount();
        Account obj2;
        obj2=new Account(102,"Deepak",60000.0);
        obj2.showAccount();

    }
}
