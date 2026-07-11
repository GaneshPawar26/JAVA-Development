package org.ganesh.JdbcLearning;

import java.sql.*;
import java.util.Scanner;
//prepared statement difference from statement


public class Preparedstatement
{
    public static void main(String[] args) throws SQLException {
//        Statement statement=null;
        Connection con=null;
        PreparedStatement pstmt=null;


        String url="jdbc:mysql://localhost:3306/jdbclearning";
        String user="root";
        String pass="Gnp2003@278";

        try {
            //connection

            con = DriverManager.getConnection(url, user, pass);
            System.out.println("Connection Established");

            //statement creation
            String query="insert into studentInfo values (?,?,?,?)";
            pstmt= con.prepareStatement(query);

            System.out.println("enter id , name, age,city ");
            Scanner sc=new Scanner(System.in);

            int id=sc.nextInt();
            String name=sc.next();
            int age=sc.nextInt();
            String city=sc.next();

            pstmt.setInt(1,id);
            pstmt.setString(2,name);
            pstmt.setInt(3,age);
            pstmt.setString(4,city);


            int rowsAffected=pstmt.executeUpdate();
            if(rowsAffected==0)
            {
                System.out.println("Data Doesnt Entered");
            }
            else
            {
                System.out.println("Values inserted succefully");
            }




        }
        catch(Exception e) {
            System.out.println("Error is connection establishment" + e);
        }
        finally
        {
            //close resources
//            rs.close();
//            statement.close();
            pstmt.close();
            con.close();
        }
    }

}
