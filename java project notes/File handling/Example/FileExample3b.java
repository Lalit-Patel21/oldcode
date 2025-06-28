/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfilecodes;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Sachin
 */
public class FileExample3b {
    public static void main(String args[]) 
{
    FileReader fr=null;
    try
    {
    	fr=new FileReader("c:/about java.txt");
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
