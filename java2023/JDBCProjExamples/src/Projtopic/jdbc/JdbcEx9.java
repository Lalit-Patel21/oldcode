
package Projtopic.jdbc;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcEx9 {
    public static void main(String[] args) {
        
        Connection conn=null;
        try{
            conn=DriverManager.getConnection("jdbc:oracle:thin:@//LALIT-PATEL:1521/xe", "system", "Lalit123");
            System.out.println("Connected successfully to the DB");
            Statement st=conn.createStatement();
            File mydir=new File("d:/jdbcimages");
            mydir.mkdir();
            ResultSet rs=st.executeQuery("Select * from movies");
            while(rs.next()){
                String mname=rs.getString(1)+".jpeg";
                Blob obj=rs.getBlob(2);
                byte[]arr=obj.getBytes(1, (int)obj.length());
                FileOutputStream fout=new FileOutputStream(mydir.getAbsolutePath()+"/"+mname);
                fout.write(arr);
                System.out.println("Image saved:"+mname);
                fout.close();               
            }   
        }catch(SQLException ex){
            System.out.println("DB Error:"+ex.getMessage());
        }
        catch(FileNotFoundException ex){
            System.out.println("File Error:"+ex.getMessage());
        }
        catch(IOException ex){
            System.out.println("File saving Error:"+ex.getMessage());
        }
        finally{
            try{
                if(conn!=null){
                    conn.close();
                }
            }catch(SQLException ex){
            System.out.println("Error in closing the connection:"+ex.getMessage());
        }
            }
        }
    }
