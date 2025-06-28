package stringdemo;

public class SBExample {
    public static void main(String[] args) {

        StringBuffer sb=new StringBuffer("HELLO WORLD!");
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        sb.replace(6,11,"ENGINEERS");
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.capacity());


    }
}
