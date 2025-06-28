/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection.examples;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author dell
 */
public class HashMapEx4 {
    public static void main(String[] args) {
        Map<Integer,MyStudent> stMap=new HashMap<>();
        
        MyStudent studObj1=new MyStudent(101,"Amit",67.2);
        stMap.put(studObj1.getRoll(), studObj1);
        
        MyStudent studObj2=new MyStudent(309,"Deepak",95.6);
        stMap.put(studObj2.getRoll(), studObj2);
        
        MyStudent studObj3=new MyStudent(205,"Ravi",67.2);
        stMap.put(studObj3.getRoll(), studObj3);
        
        System.out.println("Total students:"+stMap.size());
        System.out.println(stMap);
        
        MyStudent studObj4=new MyStudent(309,"Kiran",97.2);
        
        MyStudent m=stMap.put(studObj4.getRoll(), studObj4);
        
        System.out.println("After updating old value was:"+m);
        System.out.println(stMap);
        
   
        
        
        
        
    }
    
}
