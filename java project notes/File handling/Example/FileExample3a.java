/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfilecodes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Sachin
 */
public class FileExample3a {
    public static void main(String[] args) {
    FileReader fr=null;
    try
    {
    	fr=new FileReader("c:/about java.txt");
    	int count;
        File f=new File("c:/about java.txt");
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

