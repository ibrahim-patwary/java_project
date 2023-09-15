import java.sql.*;
import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class connection_project {
    
    
    
    private static String servername ="localhost";
    private static String username ="root";
    private static String dbname ="library_management_system";
    private static Integer portNumber = 3306;
     private static String password ="";
     
     
     public static Connection getConnection()
     {
         
         Connection connection = null;
         
        MysqlDataSource   datasource  = new     MysqlDataSource ();
         
         datasource.setServerName(servername);
         datasource.setUser(username);
         datasource.setDatabaseName(dbname);
         datasource.setPortNumber(portNumber);
         datasource.setPassword(password);
         
        try {
            connection = datasource.getConnection();
             connection= DriverManager.getConnection("jdbc:mysql://localhost/library_management_system","root","");
            
            
        } catch (SQLException ex) {
            Logger.getLogger(connection_project.class.getName()).log(Level.SEVERE, null, ex);
        }
         return connection ;
         
     }
}
