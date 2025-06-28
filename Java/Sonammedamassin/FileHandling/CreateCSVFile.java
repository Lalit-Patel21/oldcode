package Sonammedamassin.FileHandling;
import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;

public class CreateCSVFile {
    public static void main(String[] args) {

        String fileName ="example2.csv";
        File file = new File(fileName);

        // Check if the file exists
        if (file.exists()) {
            System.out.println("File exists.");
        } else {
            System.out.println("File does not exist.");
        }

        // Create a new file
        try {
            if (file.createNewFile()) {
                System.out.println("File created.");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try(PrintWriter writer = new PrintWriter(fileName))
             {
               writer.println("Name,age");
               writer.println("Amit,45");
               writer.println("Anil,46");
               writer.println("Atul,47");
               writer.println("Ajay,48");
               System.out.println("Data entered in file");

             }
        catch (IOException e){
            System.out.println("e");
            e.printStackTrace();
        }

    }
}
