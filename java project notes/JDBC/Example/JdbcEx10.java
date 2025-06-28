
package projtopic.jdbc;

import java.sql.BatchUpdateException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class JdbcEx10 {
    public static void main(String[] args) {
        
        Connection conn=null;
        boolean status=true;
        try{
            conn=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe", "system", "abc");
            System.out.println("Connected successfully to the DB");
            Statement st=conn.createStatement();
            conn.setAutoCommit(false);
            st.addBatch("Insert into employees values(108,'Vimal',55000,'Developer','14-Feb-2015')");
            st.addBatch("Update employe set salary=salary+2000 where job='Analyst'");
            st.addBatch("delete from allmovies where mov_id=106");
            int[]ans=st.executeBatch();
           
            for(int i=0;i<ans.length;i++){
            System.out.println("Query "+(i+1)+" affected "+ans[i]+" rows");
        }
        }catch(BatchUpdateException ex){
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
    

