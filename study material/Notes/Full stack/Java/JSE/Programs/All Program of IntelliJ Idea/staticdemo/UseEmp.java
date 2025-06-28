package staticdemo;
public class UseEmp {
    public static void main(String[] args) {
        Emp.showNextId();
        {
            Emp e = new Emp(21, "Amit");
            e.show();
            Emp f = new Emp(26, "Ravi");
            f.show();
            Emp g = new Emp(25, "Varsha");
            g.show();
            Emp.showNextId();
            {
                Emp x = new Emp(22, "Deepak");
                Emp y = new Emp(21, "Jyoti");
                x.show();
                y.show();
                Emp.showNextId();
                x = y = null;
                System.gc();
                System.runFinalization();
            }
            Emp.showNextId();
            e=f=g = null;
            System.gc();
            System.runFinalization();
        }
        Emp.showNextId();
    }
}