package constovld;

public class UseBox {
    public static void main(String[] args) {
        Box B3=new Box(5,7,9);
        Box B4=B3;
        B3.show();
        B4.show();
        B4.l=100;
        System.out.println("After changing B4.l");
        B3.show();
        B4.show();
    }
}
