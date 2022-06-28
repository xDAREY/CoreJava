package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connect {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = null;
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/niit","root","" );
            System.out.println("Database is Connected");
            conn.close();
        }
        catch(Exception e) {
            System.out.println("Database was unable to connect");
            e.printStackTrace();
        }
    }
}
