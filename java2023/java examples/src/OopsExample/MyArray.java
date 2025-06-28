package OopsExample;
import java.util.Scanner;

public class MyArray {
    public double[] calculate(int [] brr)
    {
        int sum=0;
        double [] result=new double[2];
        for (int x:brr)
        {
            sum=sum+x;

        }
        result[0]=sum;
        result[1]=(double)sum/brr.length;
        return result;
    }

}
