package constovld;

public class Box {
    public int l,b,h;


    public Box(int i,int j,int k)
    {
        l=i;
        b=j;
        h=k;
    }
    public Box(Box P)
    {
        l=P.l;
        b=P.b;
        h=P.h;
    }
    public void show()
    {
        System.out.println(l+","+b+","+h);
    }
}
