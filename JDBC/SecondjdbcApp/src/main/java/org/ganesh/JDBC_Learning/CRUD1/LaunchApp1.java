package org.ganesh.JDBC_Learning.CRUD1;
import java.sql.*;
//insert into the table-Non selective -statement=Create of crud


public class LaunchApp1 {

    public static void main(String[] args) throws SQLException {
        Connection con=null;
        Statement statement=null;

        String url="jdbc:mysql://localhost:3306/jdbclearning";
        String user="root";
        String pass="Gnp2003@278";
        try
        {
            con=DriverManager.getConnection(url,user,pass);
            System.out.println("Connection successful");

            statement= con.createStatement();

            //insert row

            String query="insert into studentInfo values(6,'Tushar',60,'Delhi')";

                   int rowsAffected=  statement.executeUpdate(query);

            if(rowsAffected==0)
                System.out.println("No update info");
            else System.out.println("Inserted into the table");


        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally {
            con.close();
            statement.close();
        }

//        System.out.println(con);

    }
}
