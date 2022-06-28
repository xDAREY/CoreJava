package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Retrieve {

    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = null;
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/niit","root","" );
            System.out.println("Database is Connected");

            String query = "select * from user";
            PreparedStatement statement = conn.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                int ID = resultSet.getInt("ID");
                String Name = resultSet.getString("Username");
                String Email = resultSet.getString("Email");
                boolean Gender = resultSet.getBoolean("Gender");

                System.out.printf("%-10s%-20s%-20s%-10s\n", ID, Name, Email, Gender);
            }
            conn.close();
        }
        catch(Exception e) {
            System.out.println("Database was unable to connect");
            e.printStackTrace();


        }
    }
}
