
package travelmanagrmentsystem;

import java.sql.*;  
public class Conn {
    Connection c;
    Statement s;
    Conn(){
       
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");  
           c =DriverManager.getConnection("jdbc:mysql:///travelmanagrmentsystemm","root","sim#@123"); 
            
            s =c.createStatement();  
              }catch(Exception e){ 
                  e.printStackTrace();
         //   System.out.println(e);
              }
    }
}
