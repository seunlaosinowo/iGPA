
package igpa;
import java.sql.*;
import javax.swing.*;

public class querydb {
    
     Connection con=null;
    public static Connection connectdb(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
         Connection con = DriverManager.getConnection("jdbc:mysql://Localhost/i_gpa","root","");
    return con;
    
        }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
        return null;
        }
    
}
    public static void main (String[] args ){
   
}
 
}

