/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection.examples;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author dell
 */
public class TreeSetEx2 {
    public static void main(String[] args) {
        Set <Integer> ts=new TreeSet<>();
        ts.add(15);
        ts.add(12);
        ts.add(25);
        System.out.println("TreeSet after adding 3 ele:"+ts);
        ts.add(8);
        ts.add(11);
        ts.add(16);
        System.out.println(ts);
        
    }
    
}
