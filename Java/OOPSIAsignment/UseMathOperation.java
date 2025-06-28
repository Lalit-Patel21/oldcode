//14) Create a class MathOperation with two data member X and Y to store the operand and third data member R to store result of operation.Create method members
//init - to input X and Y from user
//add - to add X and Y and store in R
//multiply - to multiply X and Y and store in R
//power - to calculate X Y and store in R
//display- to display Result R

package OOPSIAsignment;

class MathOperation{

    private int X;
    private int Y;
    private int R;
    public MathOperation()
    {

    }

    public void init(int X,int Y)
    {
        this.X=X;
        this.Y=Y;
    }

    public void add(){
        R=X+Y;
    }
    public void sub(){
        R=X-Y;
    }
    public void mul(){
        R=X*Y;
    }
    public void power(){
        R=(int)Math.pow(X,Y);
    }

    public void display(){

        System.out.println("Result : "+R);

    }
}
public class UseMathOperation{

    public static void main(String []args){

        MathOperation m = new MathOperation();

        m.init(6,7);
        m.add();
        m.display();

        m.init(6,7);
        m.sub();
        m.display();

        m.init(6,7);
        m.mul();
        m.display();

        m.init(6,7);
        m.power();
        m.display();
    }
}


