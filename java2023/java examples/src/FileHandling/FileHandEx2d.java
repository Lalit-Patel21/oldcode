package FileHandling;

import java.io.File;

public class FileHandEx2d {
    public static void main(String[] args) {
        File f1=new File("D:\\Assignments\\mycolleagues.txt");
        File f2=new File("C:\\meredost.txt");
        System.out.println(f1.getName()+" exists ?"+f1.exists());
        System.out.println(f2.getName()+" exists ?"+f2.exists());
        f1.renameTo(f2);
        System.out.println(f1.getName()+" exists ?"+f1.exists());
        System.out.println(f2.getName()+" exists ?"+f2.exists());
    }
}
