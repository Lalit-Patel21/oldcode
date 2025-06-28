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
public class HashSetExample2 {
    public static void main(String[] args) {
        Set<Student> hs=new HashSet<>();
        Student s1=new Student("Amit");
        Student s2=new Student("Sumit");
        Student s3=new Student("Amit");
        System.out.println("s1 hashCode:"+s1.hashCode());
        System.out.println("s2 hashCode:"+s2.hashCode());
        System.out.println("s3 hashCode:"+s3.hashCode());
        hs.add(s1);
        hs.add(s2);
        hs.add(s3);
        System.out.println("Total ele present:"+hs.size());
        System.out.println(hs);
    }
    
}
