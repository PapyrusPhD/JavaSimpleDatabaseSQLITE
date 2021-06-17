package doctorsdatabase;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author Fornillos
 */
public class SqlConn {
    Connection con = null;
    public static Connection ConnectDB(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("jdbc:sqlite::resource:patientDB.db");
            return con;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Wrong Database");
            return null;
        }
    } 
}
