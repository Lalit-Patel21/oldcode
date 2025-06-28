package StaticEx;

public class Emp {
    private int age;
    private String name;
    private int id;
    private static int nextId=1;

    public Emp(int age, String name) {
        this.age = age;
        this.name = name;
        id = nextId++;
    }
    public void show(){

        System.out.println("age = "+age+ ",Name = "+name+",id = "+id);
    }
    public void showNextId(){
        System.out.println("next emp will get the id :"+nextId);
    }
    protected void finalize(){
        --nextId;
    }

}
   class UseEmp{

    public static void main(String[] args) {
        Emp e = new Emp(21,"ravi");
        Emp f = new Emp(25,"raj");
        Emp g = new Emp(28,"rahul");
        e.show();
        f.show();
        g.show();
        e.showNextId();
//        f.showNextId();
//        g.showNextId();
        {
            Emp h = new Emp(45,"jayoti");
            Emp k = new Emp(42,"nita");
            h.show();
            k.show();
            e.showNextId();
            h=k=null;
            System.gc();
            System.runFinalization();
        }
        e.showNextId();

    }
}