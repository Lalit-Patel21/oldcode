//26. Write a Java program to input marks of five subjects Physics, Chemistry, Biology, Mathematics
// and Computer.Calculate percentage and grade according to following:
//	Percentage >= 90% : Grade A
//	Percentage >= 80% : Grade B
//	Percentage >= 70% : Grade C
//	Percentage >= 60% : Grade D
//	Percentage >= 40% : Grade E
//	Percentage < 40% : Grade F
package csassignment2;

import java.util.Scanner;

public class P41 {
    public static void main(String []args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter the Marks of Phy : ");
        int phy = kb.nextInt();

        System.out.print("Enter the Marks of Chem : ");
        int chem = kb.nextInt();

        System.out.print("Enter the Marks of Biology : ");
        int bio = kb.nextInt();

        System.out.print("Enter the Marks of Maths : ");
        int maths = kb.nextInt();

        System.out.print("Enter the Marks of Computer : ");
        int comp = kb.nextInt();

        double per=(phy+chem+bio+maths+comp)*100/500.0;

        if(per>=90)
            System.out.print("Grad A");
        else if(per>=80)
            System.out.print("Grad B");
        else if(per>=70)
            System.out.print("Grad C");
        else if(per>=60)
            System.out.print("Grad D");
        else if(per>=40)
            System.out.print("Grad E");
        else
            System.out.print("Grad F");

    }
}
