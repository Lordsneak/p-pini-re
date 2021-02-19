package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnect {

    static Connection dbLink = null;

    // Connexion
    public static Connection getConnect() throws ClassNotFoundException, SQLException {
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	
        String url = "jdbc:mysql://localhost:3306/MyFirstWebJee?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        String dbUser = "root";
        String dbPass = "admin";

        try {
            dbLink = DriverManager.getConnection(url, dbUser, dbPass);
        }catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
        return dbLink;
    }




}