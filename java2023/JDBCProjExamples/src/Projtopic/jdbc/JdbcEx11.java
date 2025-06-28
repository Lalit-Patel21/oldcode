
package Projtopic.jdbc;

import java.sql.BatchUpdateException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class JdbcEx11 {

    public static void main(String[] args) {
        Connection conn=null;
        boolean status=true;
        try{
            conn=DriverManager.getConnection("jdbc:oracle:thin:@//LALIT-PATEL:1521/xe", "system", "Lalit123");
            System.out.println("Connected successfully to the DB");
            PreparedStatement ps=conn.prepareStatement("insert into allmovies values (?,?,?)");
            conn.setAutoCommit(false);
            Scanner kb=new Scanner(System.in);
            String choice="";
            do
            {    
                System.out.println("Enter movie id:");
                int id=kb.nextInt();
            
                System.out.println("Enter movie name");
                kb.nextLine();// for clearing the buffer
                String mname=kb.nextLine();
            
                System.out.println("Enter movie rating:");
                int mrating=kb.nextInt();
                ps.setInt(1, id);
                ps.setString(2, mname);
                ps.setInt(3,mrating);
                ps.addBatch();
                System.out.println("Any more ?(Yes/No)");
               choice=kb.next();
            }while(choice.equalsIgnoreCase("yes"));   
            
            int []ans=ps.executeBatch();
            System.out.println("Total queries executed are:"+ans.length);
            for(int i=0;i<ans.length;i++){
            System.out.println("Query "+(i+1)+" affected "+ans[i]+" rows");
        }
                     
        }
        catch(BatchUpdateException ex){
                int []result=ex.getUpdateCounts();
                System.out.println("Query no "+(result.length+1)+" generated exception");
                status=false;
                }         
            
            
        catch(SQLException ex){
            System.out.println("DB Error:"+ex.getMessage());
            status=false;
        }
        
        finally{
            try{
                if(conn!=null){
                    if(status==true){
                        conn.commit();
                        System.out.println("All queries executed and committed");
                    }else{
                        conn.rollback();
                        System.out.println("Queries rolled back");
                    }
                    conn.close();
                }
            }catch(SQLException ex){
            System.out.println("Error in closing the connection:"+ex.getMessage());
        }
            }
        }
    }
