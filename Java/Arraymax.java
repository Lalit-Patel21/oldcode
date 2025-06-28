import java.util.Scanner;
public class Arraymax{
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
    int max,min;
    max=min=arr[0];
    for(int x:arr)
    {
      if(max<x)
      {
        max=x;
      }
      if(min>x)
      {
       min=x;
      }
    }
    System.out.println("maximum:"+max);
    System.out.println("minimum:"+min);
}
}