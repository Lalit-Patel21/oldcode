//5.Take input of age of 3 people by user and determine oldest and youngest among them.
package csassignment2;
import java.util.Scanner;

public class P5 {
    public static void main(String []args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter the age three People : ");
        int age1 = kb.nextInt();
        int age2 = kb.nextInt();
        int age3 = kb.nextInt();

        if((age1>age2)&&(age1>age3)){
            System.out.println(age1 + " is Oldest person");
        }
        else if((age2>age1)&&(age2>age3)){
            System.out.println(age2 + " is Oldest person");
        }
        else if((age3>age1)&&(age3>age2)){
            System.out.println(age3 + " is Oldest person");
        }
        else{
            System.out.println("thrice Person have equal age");
        }

        if((age1<age2)&&(age1<age3)){
            System.out.println(age1 +" is Youngest person");
        }
        else if((age2<age1)&&(age2<age3)){
            System.out.println(age2 + " is Youngest person");
        }
        else{
            System.out.println(age3 + " is Youngest person");
        }
        }
    }
