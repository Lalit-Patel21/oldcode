package FileHandling;

import java.io.File;

public class FileHandEx2c {
    public static void main(String args[])
    {
        File newdir=new File("D:\\Gurjar\\sca\\Test Papers\\mp\\bhopal\\Lalit");
        System.out.println(newdir.getName()+" exists ?"+newdir.exists());
        System.out.println(newdir.getName()+" got created ?"+newdir.mkdirs());
        System.out.println(newdir.getName()+" exists ?"+newdir.exists());
    }
}
