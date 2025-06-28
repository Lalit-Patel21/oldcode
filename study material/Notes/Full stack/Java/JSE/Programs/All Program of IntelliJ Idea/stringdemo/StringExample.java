package stringdemo;

public class StringExample {
    public static void main(String[] args) {
        String msg="Rock";
        System.out.println(msg);
        System.out.println(msg.hashCode());
        msg=msg+"Star";
        System.out.println(msg);
        System.out.println(msg.hashCode());
    }
}
