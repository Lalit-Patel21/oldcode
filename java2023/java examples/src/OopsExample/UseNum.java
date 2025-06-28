package OopsExample;

public class UseNum {
    public static void main(String[] args) {
        Num N1=new Num();
        Num N2=new Num();
        Num Temp=new Num();
        N1.setNum(10,20);
        N2.setNum(30,40);
        System.out.println("before swapping...");
        N1.showNum();
        N2.showNum();
        Temp.swapNum(N1,N2);
        System.out.println("after swapping..");
        N1.showNum();
        N2.showNum();
    }
}
