package arraypassing;

public class MyMath {

    Math m;
    public double[] calculate(int [] brr){

        int total=0;
        double [] result=new double[2];
        for(int x:brr)
            total+=x;
        result[0]=total;
        result[1]=(float)total/brr.length;
        return result;
    }

}
