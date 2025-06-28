// Que. 6 Write a program to count number of bytes in a image file(jpeg/png/gif).
//  Also find how much time it will take to upload the file on server 
// if internet speed is 256 bps(bitsper second).

import java.io.File;
public class QNo6 {
    public static void main(String[] args) {

        String fileName = "fgh.jpg";
        File file = new File(fileName);
        long bytes = file.length();
        System.out.println("file size : "+bytes);
        int speedOfIbps = 256;
        double time= (double)(bytes*8/speedOfIbps);
        System.out.println("upload time "+time+"second");
        System.out.println(bytes+" bytes the Size of a File"+fileName+" file");
        
    }
}

