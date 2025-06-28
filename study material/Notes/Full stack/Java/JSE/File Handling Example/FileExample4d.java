/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfilecodes;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Sachin
 */
public class FileExample4d {
   public static void main(String[] args) {
        
    DataOutputStream dout=null;
    DataInputStream din=null;
    try
    {
    	
        dout=new DataOutputStream(new FileOutputStream("d:/maths2.txt"));
        dout.writeDouble(Math.PI);
       
        dout.close();
        
        din=new DataInputStream(new FileInputStream("d:/maths2.txt"));
        double x=din.readDouble();
        
       
        System.out.println("Value saved in file is "+x);
        
    	din.close();
      
    }
    
catch(IOException ex)
    {
    	System.out.println("Error while writing file");
    }
    
} 
}
