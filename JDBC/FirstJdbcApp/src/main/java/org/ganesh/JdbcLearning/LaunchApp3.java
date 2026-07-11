package org.ganesh.JdbcLearning;
import java.sql.*;

//deleting in database
public class LaunchApp3 {

    public static void main(String[] agrs)
    {
        String url="jdbc:mysql://localhost:3306/jdbclearning";
        String user="root";
        String pass="Gnp2003@278";
        try
        {
            Connection con=DriverManager.getConnection(url,user,pass);
            System.out.println("Connection success ");

            //create statement
            Statement statement=con.createStatement();

            //delete query
            String query="delete from studentInfo where sname='Ganesh'";
            int affectedRow=statement.executeUpdate(query);

            if(affectedRow==0)
            {
                System.out.println("Nothing deleted");
            }
            else
            {
                System.out.println("record deleted successfully");
            }




            //close resources
            con.close();
        }
        catch(Exception e)
        {
            System.out.println("Something error happened"+e);
        }
    }

}
