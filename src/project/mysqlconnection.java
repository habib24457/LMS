
package project;
import java.sql.*;
import javax.swing.*;

public class mysqlconnection {
 public static Connection connectDB()    
{
    Connection conn=null;
try
{
Class.forName("com.mysql.jdbc.Driver");

conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project_info","root", "");
//JOptionPane.showMessageDialog(null,"Database connection successful");
//Statement stt = conn.createStatement();
return conn;
}
catch(Exception e)
{
JOptionPane.showMessageDialog(null,"failed to connect");
return null;
}     
    }
    
    
    
}
