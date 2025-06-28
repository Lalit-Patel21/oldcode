//19. W.A.P to check whether the traingle is equilateral, scalene, or isosceles.
// Hint: - Isosceles triangle: In geometry, an isosceles triangle is a triangle that has two sides of equal length.
// Equilateral triangle: In geometry, an equilateral triangle is a triangle in which all three sides are equal.
// Scalene triangle: A scalene triangle is a triangle that has three unequal sides.
package csassignment2;

import java.util.Scanner;

public class P34 {
    public static void main(String []args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("Enter length of three sides of Triangle : ");
        int a = kb.nextInt();
        int b = kb.nextInt();
        int c = kb.nextInt();
        if((a==b)&&(a==c))
        {
            System.out.println("the triangle is equilateral triangle ");
        }
        else if((a==b)||(a==c)||(b==c))
        {
            System.out.println("the triangle is isosceles triangle ");
        }
        else
        {
            System.out.println("the triangle is scalene triangle ");
        }
    }
}
