package OopsExample;

public class UseEmp2 {

    public static void main(String[] args) {
        Emp2 e = new Emp2(23, "sagar");
        Emp2 f = new Emp2(24, "aman");
        Emp2 g = new Emp2(25, "himanshu");
        e.show();
        f.show();
        g.show();
        e.showNextId();
        {
            Emp2 h = new Emp2(28, "pravin");
            Emp2 k = new Emp2(30, "jaypal");
            h.show();
            k.show();
            e.showNextId();
            h = k = null;
            System.gc();
            System.runFinalization();
        }
        e.showNextId();
    }
}
