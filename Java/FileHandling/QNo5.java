// Que. 5 Write a program to count no of words in a text file and average word size.

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class QNo5 {
    public static void main(String[] args) {

        String fileName = "fileHand.txt";
        int count = 0;
        int length=0,avgWordSize=0;
        File file = new File(fileName);
        try{
            FileInputStream f = new FileInputStream(file);
            int ch;
            while ((ch = f.read()) != -1) {
                System.out.print((char) ch);
                if(ch==' ')
                {
                  count++;
                }
                else if(((ch>=65)&&(ch <=90))||((ch>=97)&&(ch <=122)))
                {
                  length++;
                }
            }
        }catch (IOException e){
            System.out.println(e);
        }
        System.out.println();
        System.out.println((count+1)+" no of words in a text file in "+fileName+" file");
    
        System.out.println(length);
        avgWordSize=length/(count+1);
        System.out.println(avgWordSize);
    }
}
