package org.ganesh.JDBC_Learning.CRUD1;
import java.sql.*;

//read from database = r of crud
public class LaunchApp2 {
    public static void main(String[] args) throws SQLException
    {
        Connection con=null;
        Statement statement=null;

        String url="jdbc:mysql://localhost:3306/jdbclearning";
        String user="root";
        String pass="Gnp2003@278";

        try
        {
            con=DriverManager.getConnection(url,user,pass);
            System.out.println("Connection sucessful");

            statement=con.createStatement();


            //read all table
            String query="select * from studentInfo ;";
            ResultSet rs=statement.executeQuery(query);

            while(rs.next())
            {
                System.out.println(rs.getInt(1)+":"+rs.getString(2)+rs.getInt(3)+":"+rs.getString(4));
            }
        }
        catch(Exception e)
        {
            System.out.println("Something is wrong" + e);
        }
        finally
        {
            statement.close();
            con.close();

        }
    }
}
