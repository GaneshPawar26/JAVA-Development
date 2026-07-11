package org.ganesh.JdbcLearning;


import java.sql.*;

public class LaunchApp1
{
    public static void main(String[] args)
    {

        //driver loading
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }

//        connection establishment

        String url = "jdbc:mysql://localhost:3306/jdbclearning";
        String username = "root";
        String password = "Gnp2003@278";


        try {
            Connection con =
                    DriverManager.getConnection(url, username, password);

            System.out.println("Connection Successful");

            //statement creation
            Statement statement=con.createStatement();

            //execute query
            String query="insert into studentInfo values (1,'Ganesh',23, 'Pune'),(2,'Rohan',28,'Pune'),(3,'Mohit',18,'Mumbai');";

            //process the result
            int rowsAffected= statement.executeUpdate(query);
            if(rowsAffected==0)
                System.out.println("Not inserted the query");
            else
                System.out.println("query inserted successfully");

            statement.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
