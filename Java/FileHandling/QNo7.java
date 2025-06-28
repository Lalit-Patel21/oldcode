//Que. 7 Write a program to store your shopping details in a binary file(shopping.dat)
// with information itemName, price, quantity. (Use ObjectOutputStream to store Item class object).


import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Customer implements Serializable{
   private String itemName;
   private int price;
   private int quantity;

   public Customer(){}

   public Customer(String itemName, int price, int quantity){
    this.itemName = itemName;
    this.price = price;
    this.quantity = quantity;
   }
   public String toString(){
    return itemName+" "+price+" "+quantity;
   }
}

public class QNo7 {
    public static void main(String[] args) {
        try{
          File f = new File("shopping.dat");
          FileOutputStream fout = new FileOutputStream(f);
          ObjectOutputStream oos = new ObjectOutputStream(fout);
          Customer c = new Customer("Oppo",10500,25);
          oos.writeObject(c);
          System.out.println("Operation success...");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}

