package JDBC;

import java.sql.*;


public class BookInfo {
    public static void main(String[] args) {
        try{
            //Initialize and load type 4 JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //connect to a data source using library DSN
            Connection conn = null;
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/niit","root","" );
            //create a statement object
            Statement stmt = conn.createStatement();

            conn.setAutoCommit(false);

            //add the INSERT statements to a batch
            stmt.addBatch("INSERT INTO Student (Firstname,Lastname) VALUES ('John', 'Abel')");
            stmt.addBatch("INSERT INTO Student (Firstname,Lastname) VALUES ( 'Mara', 'Clara')");
            stmt.addBatch("INSERT INTO Student (Firstname,Lastname) VALUES ( 'JOHN', 'WICK')");

            //Execute a batch using executeBatch() method
            int[] results = stmt.executeBatch();
            System.out.println("");
            System.out.printf("Using Statement object");
            System.out.println("---------------------------------------------");
            for(int i = 0; i < results.length; i++)
            {
                System.out.println("Rows affected by " + (i+1) + "INSERT statement: " + results[i]);
            }

            //Use the PreparedStatement object to perform batch updates
            PreparedStatement ps = conn.prepareStatement("INSERT INTO Student  (Firstname,Lastname) VALUES (?,?)");

            System.out.println("");
            System.out.println("-------------------------------");
            System.out.println("Using PreparedStatement");
            System.out.println("------------------------");

            //specify the value for the placeholders
            ps.setString(1,"007");
            ps.setInt(2,575);
            ps.addBatch();
            ps.setString(1,"008");
            ps.setInt(2,350);

            //Add the SQL statement to the batch
            ps.addBatch();

            //Execute the batch of SQL statements
            int[] numUpdates = ps.executeBatch();
            for (int i = 0; i < numUpdates.length; i++)
            {
                System.out.println("Rows affected by " + (i+1) + "INSERT statement: " + numUpdates[i]);
            }
            //commit the INSERT statements in the batch
            conn.commit();
        }
        catch(Exception e){
            System.out.println("Error :  " + e);
        }
    }
}
