package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileHandEx3a {
    public static void main(String[] args) {
        FileReader fr=null;
        try
        {
            fr=new FileReader("D:\\Gurjar\\File\\Sca\\File Ex1.txt");
            int count;
            File f=new File("D:\\Gurjar\\File\\Sca\\File Ex1.txt");
            char [] arr=new char[(int)f.length()];
            count=fr.read(arr);
            String s=new String(arr);
            System.out.println(s);
            System.out.println("\nTotal characters read :"+count);
        }
        catch(FileNotFoundException fnf)
        {
            System.out.println("Cannot open the file");
        }
        catch(IOException ex)
        {
            System.out.println("Error while reading file");
        }
        finally
        {
            if(fr!=null)
            {

                try
                {
                    fr.close();
                }
                catch(IOException ex)
                {
                    System.out.println("Error while closing file");
                }
            }
        }
    }
}
