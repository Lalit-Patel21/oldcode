package FileHandling;

import java.io.File;

public class FileHandEx2b {

        public static void main(String []args)
        {
            File mydir=new File("D:\\Gurjar");
            String [] arr=mydir.list();
            System.out.println("Total members:"+arr.length);
            for(String s:arr)
                System.out.println(s);

        }
    }


