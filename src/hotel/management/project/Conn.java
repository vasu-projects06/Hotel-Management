package hotel.management.project;


import java.sql.*;

public class Conn {
    Connection c;
    Statement s;
    
    public Conn(){
        try{
            
           Class.forName("com.mysql.cj.jdbc.Driver");
           c = DriverManager.getConnection("jdbc:mysql:///hotelmanagementsystem","root","0000");
           s = c.createStatement();
           
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
