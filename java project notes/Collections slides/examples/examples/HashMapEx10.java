/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection.examples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author dell
 */
public class HashMapEx10 {
    public static void main(String[] args) {
        Map<Integer,MyStudent> stMap=new HashMap<>();
        
        MyStudent studObj1=new MyStudent(101,"Amit",67.2);
        stMap.put(studObj1.getRoll(), studObj1);
        
        MyStudent studObj2=new MyStudent(309,"Deepak",95.6);
        stMap.put(studObj2.getRoll(), studObj2);
        
        MyStudent studObj3=new MyStudent(205,"Ravi",67.2);
        stMap.put(studObj3.getRoll(), studObj3);
        
        System.out.println("Total students:"+stMap.size());
        System.out.println("Their details are:");
        
        Set<Map.Entry<Integer,MyStudent>> entries=stMap.entrySet();
        Iterator<Map.Entry<Integer,MyStudent>>it=entries.iterator();
        while(it.hasNext()){
            Map.Entry<Integer,MyStudent> e=it.next();
            Integer roll=e.getKey();
            MyStudent ms=e.getValue();
            System.out.println("Roll="+roll+",Name="+ms.getName()+"Per="+ms.getPer());
            
        }
        
        
        
   
        
        
        
        
    }
    
}
