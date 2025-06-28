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
public class HashMapEx3 {
    public static void main(String[] args) {
        Map<Integer,String> stMap=new HashMap<>();
        String result;
        
        result=stMap.put(101,"Rahul");
        System.out.println("After adding 1st student:"+result);
        
        result=stMap.put(304,"Deepak");
        System.out.println("After adding 2nd student:"+result);
        
        result=stMap.put(206,"Ravi");
        System.out.println("After adding 3rd student:"+result);
        
        System.out.println("Total students:"+stMap.size());
        
        result=stMap.put(304,"Deepesh");
        System.out.println("After adding 4th student:"+result);
        
        System.out.println(stMap);
        
        
        
    }
    
}
