//25. Write a Java program to calculate profit or loss.
package csassignment2;

import java.util.Scanner;

public class P40 {
    public static void main(String []args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("Enter cost Price:");
        int cost = kb.nextInt();

        System.out.println("Enter sold Price:");
        int sold = kb.nextInt();

        if (cost<sold)
          System.out.println("Profit :"+(sold-cost)+"Rs");
        else
            System.out.println("Loss:"+(cost-sold)+"Rs");

    }
}
