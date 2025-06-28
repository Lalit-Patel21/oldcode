package argpassing3;

public class Num {
    private int a,b;
    public void setNum(int i,int j){
        a=i;
        b=j;
    }
    public void showNum(){
        System.out.println("a="+a+",b="+b);
    }
    public void swap(Num P,Num Q)
    {
       Num X;
       X=P;
       P=Q;
       Q=X;
    }
}
