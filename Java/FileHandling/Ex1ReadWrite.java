//Que. 1 Write a java program to read/write data into the file.
// (Use File Output Stream, File Input Stream).

package FileHandling;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex1ReadWrite {
    public static void main(String[] args){

        String fileName = "fileHand.txt";
        String fileContent = "Hello, this is a test file.\nWelcome to file handling in Java!";
        byte []brr = fileContent.getBytes();

        File file = new File(fileName);

        // Check if the file exists

        if (file.exists()) {
            System.out.println("File exists.");
        }
        try {
            if (file.createNewFile()){
                System.out.println("file created..");
            }else {
                System.out.println("An error occur..");
            }
        }catch (IOException e){
            e.printStackTrace();
        }

    
        // write data into file
        try(FileOutputStream f = new FileOutputStream(file,true)){

            f.write(brr);
            System.out.println("File modified");

        }catch (IOException e){
            System.out.println(e);
        }


        //Read data from file 
        try(FileInputStream f = new FileInputStream(file)){

            int ch;
            while ((ch = f.read()) != -1) {
                System.out.print((char) ch);
            }
    
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
