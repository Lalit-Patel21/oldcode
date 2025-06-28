package OopsExample;
import java.util.Scanner;

public class UseCircle
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        System.out.print("enter radius :");
        int r=s.nextInt();

        Circle obj = new Circle();
        obj.setRadius(r);
        double res = obj.calculateArea();
        System.out.println("Area is "+res);
        res= obj.calculateCircumference();
        System.out.println("circumference is "+res);
    }
}
