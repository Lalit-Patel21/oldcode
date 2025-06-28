package ClassPractical;

import java.util.Scanner;

public class EvenOdd {


    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("enter a number");
        int n=kb.nextInt();

        if(n%2==0)
            System.out.println( n+" is a even number");
        else
            System.out.println(n+" is a odd number ");
    }
}
