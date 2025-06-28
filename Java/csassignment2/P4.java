//4.A school has following rules for grading system:
//a. Below 25 - F
//b. 25 to 45 - E
//c. 45 to 50 - D
//d. 50 to 60 - C
//e. 60 to 80 - B
//f. Above 80 - A
//Ask user to enter marks and print the corresponding grade.
package csassignment2;
import java.util.Scanner;
public class P4 {
    public static void main(String []args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter the Marks of Phy : ");
        int phy = kb.nextInt();

        System.out.print("Enter the Marks of Chem : ");
        int chem = kb.nextInt();

        System.out.print("Enter the Marks of Maths : ");
        int maths = kb.nextInt();

        double per=(phy+chem+maths)*100/300.0;

        if(per>80)
            System.out.print("Grad A");
        else if(per<=80&&per>60)
            System.out.print("Grad B");
        else if(per<=60&&per>50)
            System.out.print("Grad C");
        else if(per<=50&&per>45)
            System.out.print("Grad D");
        else if(per<=45&&per>25)
            System.out.print("Grad E");
        else
            System.out.print("Grad F");

    }
}
