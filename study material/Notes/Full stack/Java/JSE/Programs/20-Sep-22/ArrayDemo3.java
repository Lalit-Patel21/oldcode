package sachin;

public class ArrayDemo3 {
    public static void main(String[] args) {
        int [ ] arr={10,20,30,40,50};

        for(int x:arr)
        {
            System.out.println(x);
            x+=2;
        }
        System.out.println("after changing array data");
        for(int x:arr)
        {
            System.out.println(x);

        }
    }
}
