package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conector {
    
    private static String pathDB = "jdbc:mysql://localhost/unnicehorse";
    private static String userDB = "root";
    private static String passDB = "Shinoque3@1";
    
    public static Connection conect() throws SQLException{
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            return DriverManager.getConnection(pathDB, userDB, passDB);
            
        } catch (ClassNotFoundException e) {
            throw new SQLException(e.getException());
        }
        
    }
    
}