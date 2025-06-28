//11. Ask user to enter age, sex ( M or F ), marital status ( Y or N )
// and then using following rules print their place of service.
//if employee is female, then she will work only in urban areas.
//if employee is a male and age is in between 20 to 40 then he may work in anywhere
//if employee is male and age is in between 40 t0 60 then he will work in urban areas only.
//And any other input of age should print "ERROR".
package csassignment2;

import java.util.Scanner;

public class P11 {
    public static void main(String []args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter the age : ");
        int age = kb.nextInt();

        System.out.print("Enter the sex ( M or F ): ");
        String sex = kb.next();

        System.out.print("Enter the marital status ( Y or N ): ");
        String mrSt = kb.next();

        if(sex.equalsIgnoreCase("F"))
            System.out.print("she will work only in urban areas.");
        else if(age>=20 && age<=40)
            System.out.print("he may work in anywhere.");
        else if(age>=40 && age<=60)
            System.out.print("he will work only in urban areas.");
        else
            System.out.print("ERROR");
    }
}
