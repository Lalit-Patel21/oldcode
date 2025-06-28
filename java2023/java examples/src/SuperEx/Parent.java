package SuperEx;

public class Parent{
    public Parent(int i){
        System.out.println("Parent constructor Called...");
    }
}
   class Child extends  Parent{
    public Child(){
        super(10);
        System.out.println("Child constructor Called...");
    }
}
class Demo{
    public static void main(String[] args) {

        Child obj = new Child();
    }
}