/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection.examples;

/**
 *
 * @author dell
 */
public class MyStudent {
    public String getName() {
        return name;
    }

    public Double getPer() {
        return per;
    }
    
    private Integer roll;
    private String name;
    private Double per;

    public MyStudent(Integer roll, String name, Double per) {
        this.roll = roll;
        this.name = name;
        this.per = per;
    }
    public int getRoll(){
        return roll;
    }

    @Override
    public String toString() {
        return "MyStudent{" + "roll=" + roll + ", name=" + name + ", per=" + per + '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPer(Double per) {
        this.per = per;
    }
    
}
