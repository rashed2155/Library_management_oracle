package Library_Management;


import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author 1BestCsharp
 */
public class My_CNX {
    
    Connection conn = null;
    
    public static Connection getConnection()
    {
               
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:XE", "library", "2155");
            return conn;
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    
}
    

