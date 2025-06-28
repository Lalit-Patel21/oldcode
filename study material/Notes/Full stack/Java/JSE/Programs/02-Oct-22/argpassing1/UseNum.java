package argpassing1;

public class UseNum {
    public static void main(String[] args) {
        Num obj=new Num();
        int i=10,j=20;
        System.out.println("Before incrementing:");
        System.out.println("i="+i+",j="+j);
        obj.increment(i,j);
        System.out.println("After incrementing:");
        System.out.println("i="+i+",j="+j);
    }
}
