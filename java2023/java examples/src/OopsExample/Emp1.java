package OopsExample;

public class Emp1 {
    private int age;
    private String name;
    private int id;
    public static int nextId=1;
    public Emp1(int age, String name) {
        this.age = age;
        this.name = name;
        id=nextId++;
    }
    public void show(){
        System.out.println("age="+age+",name="+name+",id="+id);
    }
    public void showNextId(){

        System.out.println("Next emp will get the id : "+nextId);
    }
}
