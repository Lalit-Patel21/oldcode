package assignment2;

import java.util.Scanner;

public class As15small {
    public void greaterNum(int num1,int num2,int num3)
    {
        if(num1<num2&&num1<num3)
            System.out.println(num1+" is smallest number");
        else if(num2<num1&&num2<num3)
            System.out.println(num2+" is a smallest number");
        else
            System.out.println(num3+" is a smallest number ");

    }
    public static void main(String[] args) {

        Scanner kb = new Scanner (System.in);

        System.out.println("Input the first number : ");
        int  num1=kb.nextInt();
        System.out.println("Input the Second number : ");
        int num2=kb.nextInt();
        System.out.println("Input the third number : ");
        int num3=kb.nextInt();

        As15small obj=new As15small();
        obj.greaterNum(num1,num2,num3);
    }
}

