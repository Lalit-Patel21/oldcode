package FileHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileHandEx3b {
    public static void main(String []args)
    {
        FileReader fr=null;
        try
        {
            fr=new FileReader("D:\\Gurjar\\File\\Sca\\File Ex1.txt");
            BufferedReader br=new BufferedReader(fr);
            String str;
            int count=0;
            while((str=br.readLine())!=null)
            {
                System.out.println(str);
                count=count+str.length();
            }
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
