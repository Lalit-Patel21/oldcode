package assignment2;

import java.util.Scanner;

public class As10Armstrong {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        int sum;

        System.out.println("Enter the  number : ");
        int num = kb.nextInt();
        int temp=num;

        for(sum=0;num!=0;num=num/10)
        {
            int rem = num%10;
            sum += rem*rem*rem;
        }
        if(temp==sum)
            System.out.println(temp+" is a armstrong number");
        else
            System.out.println(temp+" is not a armstrong number");
    }
}
