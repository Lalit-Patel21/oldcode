//27. Write a Java program to input basic salary of an employee and calculate its Gross salary
// according to following: Basic Salary <= 10000 : HRA = 20%, DA = 80%
//Basic Salary <= 20000 : HRA = 25%, DA = 90%
//Basic Salary > 20000 : HRA = 30%, DA = 95%
package csassignment2;

import java.util.Scanner;

public class P42 {
    public static void main(String []args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("input basic salary of an employee :");
        int sal = kb.nextInt();

        if(sal<=10000)
        {
            System.out.print(" Gross salary of an employee is:"+(sal+sal*20/100.0+sal*80/100));
        }
        else if(sal<=20000)
        {
            System.out.print(" Gross salary of an employee is:"+(sal+sal*25/100.0+sal*90/100));
        }else
        {
            System.out.print(" Gross salary of an employee is:"+(sal+sal*30/100.0+sal*95/100));
        }
    }
}
