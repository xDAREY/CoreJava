package JDBC.Gift;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class CallProc {
    public static void main(String[] args) {
        String id, name, address, city;
        try{
            String Str = "{Call user (?,?,?,?)}";
            //Initialize and load type 4 jdbc driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //Establish a connection with the database
            Connection conn = null;
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/niit","root","" );

            //call a stored procedure
            CallableStatement cstmt = conn.prepareCall(Str);

            //Pass IN paramenter
            cstmt.setString(1, "A001");
            //Register OUT parameters
            cstmt.registerOutParameter(2, Types.VARCHAR);
            cstmt.registerOutParameter(3, Types.VARCHAR);
            cstmt.registerOutParameter(4, Types.INTEGER);
            //Process the stored procedure
            cstmt.execute();
            //Retrieve Authors information
            name = cstmt.getString(2);
            address = cstmt.getString(3);
            city = cstmt.getString(4);

            //Display author information
            System.out.println("");
            System.out.println("Display Author Information");
            System.out.println("-----------------------");
            System.out.println("First name : " + name);
            System.out.println("Address: " + address);
            System.out.println("City: " + city);

        }
        catch (Exception e)
        {
            System.out.println("Error " + e);
        }
    }
}
