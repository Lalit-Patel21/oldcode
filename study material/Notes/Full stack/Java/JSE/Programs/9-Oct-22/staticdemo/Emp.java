package staticdemo;

public class Emp extends Object{
    private int age;
    private String name;
    private int id;
    private static int nextId=1;
    public Emp(int a,String n)
    {
        age=a;
        name=n;
        id=nextId++;
    }
    public void show()
    {
        System.out.println("id:"+id+",age:"+age+",name:"+name);
    }
    public void showNextId()
    {
        System.out.println("Id of next emp will be:"+nextId);
    }
    protected void finalize()
    {
        --nextId;
    }
}
