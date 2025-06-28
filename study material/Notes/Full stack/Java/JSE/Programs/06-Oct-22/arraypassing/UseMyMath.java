package arraypassing;
import java.util.Scanner;
public class UseMyMath {
    public static void main(String[] args) {
        int []arr=new int[5];
        Scanner kb=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter no:");
            arr[i]=kb.nextInt();
        }
        MyMath obj=new MyMath();
        double[]ans;
        ans=obj.calculate(arr);
        System.out.println("Sum is "+ans[0]);
        System.out.println("Average is "+ans[1]);

    }
}
