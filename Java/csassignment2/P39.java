//24. Write a Java program to count total number of notes in given amount.
package csassignment2;

import java.util.Scanner;

public class P39 {
    public static void main(String []args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("Enter A amount :");
        int n = kb.nextInt();

        int fiveH=0,twoH=0,hun=0,fifty=0,twenty=0,ten=0,five=0,two=0,one=0;
        {
            fiveH=n/500;
            n=n-fiveH*500;
            System.out.println(fiveH+" :  500 ");

            twoH=n/200;
            n=n-twoH*200;
            System.out.println(twoH+" : 200   ");

            hun=n/100;
            n=n-hun*100;
            System.out.println(hun+" : 100  ");

            fifty=n/50;
            n=n-fifty*50;
            System.out.println(fifty+" : 50  ");

            twenty=n/20;
            n=n-twenty*20;
            System.out.println(twenty+" : 20  ");

            ten=n/10;
            n=n-ten*10;
            System.out.println(ten+" : 20 ");

            five=n/5;
            n=n-five*5;
            System.out.println(ten+" : 10  ");

            two=n/2;
            n=n-two*2;
            System.out.println(two+" : 2    ");

            System.out.println(n+" : 1   ");

        }
    }
}
