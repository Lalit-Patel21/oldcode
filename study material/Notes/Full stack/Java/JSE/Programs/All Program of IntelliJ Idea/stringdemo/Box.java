package stringdemo;

public class Box {
    private int l,b,h;
    public void setBox(int i,int j,int k){
        l=i;
        b=j;
        h=k;
    }
    public void show(){
        System.out.println("len="+l+",br="+b+",he="+h);
    }
    public boolean equals(Object o){
        Box P= (Box) o;
        if(l==P.l && b==P.b && h==P.h)
            return true;
        return false;

    }

}
class UseBox{
    public static void main(String[] args) {
        Box B1=new Box();
        Box B2=new Box();
        B1.setBox(10,20,30);
        B2.setBox(10,20,30);
        B1.show();
        B2.show();
        System.out.println(B1.equals(B2));
    }
}

