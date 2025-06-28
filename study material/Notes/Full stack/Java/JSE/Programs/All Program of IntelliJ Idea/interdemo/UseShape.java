package interdemo;

public class UseShape {
    public static void main(String[] args) {
        Shape S;
        S=new Circle(10);
        System.out.println("Shape is "+S.getName());
        System.out.println("Its area is "+S.area());
        S=new Rectangle(5,7);
        System.out.println("Shape is "+S.getName());
        System.out.println("Its area is "+S.area());
    }
}
