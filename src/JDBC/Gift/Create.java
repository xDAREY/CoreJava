package JDBC.Gift;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Create {

    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = null;
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/niit","root","" );
            String query = "CREATE TABLE Student (ID int, Firstname Varchar(200), Lastname Varchar(200))";
            PreparedStatement preparedStmt = conn.prepareStatement(query);
            System.out.println("Table created successfully");

            preparedStmt.execute();
            conn.close();
        }
        catch(Exception e) {
            System.out.println("Couldn't create table");
            e.printStackTrace();
        }
    }
}
