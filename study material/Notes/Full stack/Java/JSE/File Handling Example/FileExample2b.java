/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfilecodes;

/**
 *
 * @author samsung1
 */
import java.io.*;
class FileExample2b
{
public static void main(String args[]) 
{
    File mydir=new File("D:\\Assignments");
    String [] arr=mydir.list();
    System.out.println("Total members:"+arr.length);
    for(String s:arr)
        System.out.println(s);
    
}
}
