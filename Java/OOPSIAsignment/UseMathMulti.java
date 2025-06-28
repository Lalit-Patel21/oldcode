//15) Create a class MathOperation containing method ‘multiply’ to calculate multiplication of following arguments.
//two integers
//three float
//all elements of array
//one double and one integer

package OOPSIAsignment;
class MathMulti{

    public MathMulti()
    {

    }
    public void multiply(int X,int Y){
        System.out.println("Result : "+(X*Y));
    }
    public void multiply(float X,float Y,float Z){

        System.out.println("Result : "+(X*Y*Z));
    }
    public void multiply(double X,int Y){
        System.out.println("Result : "+(X*Y));
    }
    public void multiply(int [] X){
        int multi = 1;
        for (int x : X){
            multi*=x;
        }
        System.out.println("Result : "+(multi));
    }
}
public class UseMathMulti{

    public static void main(String []args){

        MathMulti m = new MathMulti();
        m.multiply(5,6);
        m.multiply(5.0f,6.0f,7.0f);
        m.multiply(5.0,6);
        int [] arr = new int[]{5,6,7,10};
        m.multiply(arr);
    }
}


