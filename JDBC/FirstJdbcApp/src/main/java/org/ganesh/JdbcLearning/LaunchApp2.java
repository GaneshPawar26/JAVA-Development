package org.ganesh.JdbcLearning;
import java.sql.*;

public class LaunchApp2 {

    public static void main(String[] args)
    {
        String url="jdbc:mysql://localhost:3306/jdbclearning";
        String user="root";
        String pass="Gnp2003@278";

        try
        {
            //connection

            Connection con=DriverManager.getConnection(url,user,pass);
            System.out.println("Connection Established");

            //statement creation
            Statement statement= con.createStatement();

            //retrieval data from database table
            String query="select * from studentInfo";
            ResultSet rs=statement.executeQuery(query);

            while(rs.next())
            {
                System.out.println(rs.getInt(1)+":"+rs.getString(2)+
                        ":"+rs.getInt(3)+":"+rs.getString(4));
            }

            //close resources
            rs.close();
            statement.close();
            con.close();
        }
        catch(Exception e)
        {
            System.out.println("Error is connection establishment"+e);
        }

    }
}
