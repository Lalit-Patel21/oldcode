//10.Write a program to check if a year is leap year or not.
//If a year is divisible by 4 then it is leap year but
// if the year is century year like 2000, 1900, 2100 then it must be divisible by 400.


package csassignment2;
import java.util.Scanner;

public class P10 {
        public static void main(String []args) {
            Scanner kb = new Scanner(System.in);

            System.out.println("Enter a Year :");
            int year = kb.nextInt();
            if(((year%100==0)&&(year%400==0))||((year%100!=0)&&(year%4==0)))
                System.out.println(year+" is a Leaf Year");
            else
                System.out.println(year+" is not a Leaf Year");
        }
}
