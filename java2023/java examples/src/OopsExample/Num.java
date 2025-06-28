package OopsExample;

public class Num {
    private int a,b;
    public void setNum(int i,int j)
    {
        a=i;
        b=j;
    }
    public void swapNum(Num p,Num q) {
        int x;
        x= p.a;
        p.a = q.a;
        q.a =x;

        x=p.b;
        p.b=q.b;
        q.b=p.a;
    }
    public void showNum()
    {
        System.out.println("a="+a+",b="+b);
    }
}
