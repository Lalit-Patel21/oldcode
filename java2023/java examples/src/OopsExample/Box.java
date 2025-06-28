package OopsExample;

public class Box {

    private int l,b,h;

    public Box() {
//        l=b=h=0;
        this(0,0,0);
    }
    public Box(int s){
//        l=b=h=s;
        this(s,s,s);
    }
    public Box(int i,int j,int k){
        l=i;
        b=j;
        h=k;

    }
    public void show()
    {
        System.out.println("l="+l+",b="+b+",h="+h);
    }

}
