package assignment2;

import java.util.Scanner;

public class As11Fibonacii {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        System.out.println("Enter no of term of series : ");
        int term = kb.nextInt();

        int a = 0, b = 1,f = 0;

        for (int i = 1; i <= term; i++)
        {
            System.out.print(f +" ");
            f = a+b;
            b = a;
            a = f;
        }
    }
}
// a=-1,b=1,f;
//f=a+b;
//a=b;b=f;