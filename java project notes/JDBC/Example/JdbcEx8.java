
package projtopic.jdbc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class JdbcEx8 {
    public static void main(String[] args) {
        try{
            Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe", "system", "abc");
            System.out.println("Connected successfully to the DB");
            PreparedStatement ps=conn.prepareStatement("insert into movies values(?,?)");
            Scanner kb=new Scanner(System.in);
            
            System.out.println("Enter path to the image:");
            String imgPath=kb.nextLine();
            System.out.println(imgPath);
            int lastFwdPos=imgPath.lastIndexOf("/");
            int lastDotPos=imgPath.lastIndexOf(".");
            String movName=imgPath.substring(lastFwdPos+1,lastDotPos);
            
            ps.setString(1, movName);
            File f=new File(imgPath);
            InputStream fin=new FileInputStream(imgPath);
            ps.setBinaryStream(2,fin,(int)f.length());
            int result=ps.executeUpdate();
            System.out.println("Rec ins:"+result);      
            
            System.out.println("Disconnected with the DB");
            
            
        }catch(SQLException ex){
            System.out.println("DB Error:"+ex.getMessage());
        }
        catch(FileNotFoundException ex){
            System.out.println("File Error:"+ex.getMessage());
        }
    }
    
}
