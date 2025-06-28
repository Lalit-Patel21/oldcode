// Programs | Class Room Assignment-5
//1) WAP to print a statement 1000 number of times.
// package controlstatement;

import java.util.Scanner;

public class P1 {
        public static void main(String []args)
        {
            Scanner kb = new Scanner(System.in);

            System.out.print("Enter a Statement : ");
            String str =kb.nextLine();

            System.out.print("How Much Time you want to print : ");
            int n = kb.nextInt();
            int i = 1;
            while(n!=0 ){
                System.out.println(i+" "+str);
                i++;
                n--;
            }

        }
    }


