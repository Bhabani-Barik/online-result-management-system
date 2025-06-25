// Manages Oracle DB connection
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
    private static final String URL = "jdbc:oracle:thin:@localhost:1521:orcl"; 
    private static final String USER = "c##bhabani";
    private static final String PASSWORD = "kanha";

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        System.out.println("DB Connection");
        Class.forName("oracle.jdbc.driver.OracleDriver");
        System.out.println("DB Connection");
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}

