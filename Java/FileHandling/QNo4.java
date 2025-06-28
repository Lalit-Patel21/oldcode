// Que. 4 Write a program to count how many times character ‘t’ occurs in a file.

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
public class QNo4 {
    public static void main(String[] args) {

        String fileName = "fileHand.txt";
        int count = 0;
        File file = new File(fileName);
        try(FileInputStream f = new FileInputStream(file)){

            int ch;
            while ((ch = f.read()) != -1) {
                System.out.print((char) ch);
                if(ch==116)
                {
                    count++;
                }
            }
    
        }catch (IOException e){
            System.out.println(e);
        }
        System.out.println();
        System.out.println(count+" times character t occurs in "+fileName+" file");
        
    }
    
}



