package OopsExample;

import java.util.Scanner;

public class UseWorker {
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("how many hour work :");
        int hw = kb.nextInt();
        System.out.println("pay rate for per hours :");
        double payRate = kb.nextInt();
        Worker obj = new Worker();
        obj.setData(hw,payRate);
        double sal;
        sal=obj.getSalary();
        System.out.println("total salary = "+sal);
    }
}
