/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection.examples;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author dell
 */
public class HashSetDemo1 {
    public static void main(String[] args) {
       Set <String> hs=new HashSet<String>();
       String s1=new String("Aa");
       String s2=new String("BB");
       //String s3=new String("Amit");
       System.out.println("s1 hashCode:"+s1.hashCode());
       System.out.println("s2 hashCode:"+s2.hashCode());
       //System.out.println("s3 hashCode:"+s3.hashCode());
       // hs.add(s1);
       // hs.add(s2);
       // hs.add(s3);
        //System.out.println(hs);
        
    }

}
