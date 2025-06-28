/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection.examples;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author dell
 */
public class HashMapEx7 {
    public static void main(String[] args) {
        Map<Integer,MyStudent> stMap=new HashMap<>();
        
        MyStudent studObj1=new MyStudent(101,"Amit",67.2);
        stMap.put(studObj1.getRoll(), studObj1);
        
        MyStudent studObj2=new MyStudent(309,"Deepak",95.6);
        stMap.put(studObj2.getRoll(), studObj2);
        
        MyStudent studObj3=new MyStudent(205,"Ravi",67.2);
        stMap.put(studObj3.getRoll(), studObj3);
        
        System.out.println("Total students:"+stMap.size());
        
        Scanner kb=new Scanner(System.in);
        int roll;
        System.out.println("Enter roll no:");
        roll=kb.nextInt();
        
        MyStudent result=stMap.remove(roll);
        if(result==null){
            System.out.println("No student with roll no:"+roll+" found in the DB");
        }else{
            System.out.println("Student found and deleted!");
            System.out.println("After deletion total students are:"+stMap.size());
        }
        
        
        
   
        
        
        
        
    }
    
}
