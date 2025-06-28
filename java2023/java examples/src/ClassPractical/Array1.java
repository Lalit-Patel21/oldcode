package ClassPractical;
import java.util.Scanner;
public class Array1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter size of the array:");
        int size=s.nextInt();
        int []arr;
        arr=new int[size];
        System.out.println("Enter the "+arr.length+" element of the array");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=s.nextInt();
        }
        System.out.println("enter targeted value :");
        int tar=s.nextInt();
        boolean res=false;
        for (int x:arr)
        {
            if(x==tar)
            {
                res = true;
                break;
            }
        }
            System.out.println("result:"+res);
    }
}
