package ClassPractical;

import java.util.Scanner;

public class Greater {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);



        System.out.println("Enter a number : ");
        int n = s.nextInt();

        int m=n;
        int count=0;

        while(m!=0)
        {
            m = m/ 10;
            count++;
        }

        int [] arr=new int[count];

        for(int i=0;n!=0;i++)
        {
            arr[i] = n % 10;
            n=n/10;
        }

    }

}
