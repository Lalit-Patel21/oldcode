package assignment2;

import java.util.Scanner;

public class As13pattern {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int num;
        System.out.print("Enter the num : ");
        num=kb.nextInt();
        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=i;j++){
                System.out.print("* ");
           }
        System.out.println();
    }
 }
}
