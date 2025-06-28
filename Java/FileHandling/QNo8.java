// Que. 8 Write a program to read data from shopping.dat file creted in above problem 
// and find total money
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
public class QNo8 {
    public static void main(String args[]){
        try{
          File f = new File("shopping.dat");
          FileInputStream fin = new FileInputStream(f);
          ObjectInputStream ois = new ObjectInputStream(fin);
          Customer c = (Customer)ois.readObject();
          System.out.println(c);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
