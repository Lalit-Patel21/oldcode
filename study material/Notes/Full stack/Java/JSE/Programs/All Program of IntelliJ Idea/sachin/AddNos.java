package sachin;

import java.util.Scanner;

public class AddNos {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int a,b;
        System.out.println("Enter 2 int");
        a=kb.nextInt();
        b=kb.nextInt();
        int c=a+b;
        System.out.println("Sum is "+c);
    }
}
