package HMS;

import java.sql.*;
import javax.swing.*;

public class DConnection {
    Connection conn;
    public static Connection ConnectDB()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/sravya","root","Chowdary98?");
            return conn;
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"here");
            return null;
        }
        
    }

    PreparedStatement prepareStatement(String Sql) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
