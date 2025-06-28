package OopsExample;

public class UseEmp1 {
    public static void main(String[] args) {
        Emp1 e= new Emp1(23,"sagar");
        Emp1 f= new Emp1(24,"aman");
        Emp1 g= new Emp1(25,"himanshu");
        e.show();
        f.show();
        g.show();
        e.showNextId();
        f.showNextId();
        g.showNextId();

    }
}
