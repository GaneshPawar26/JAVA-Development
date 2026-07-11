package org.ganesh.JDBC_Learning.CRUD2;

import java.sql.*;
import java.util.Scanner;

//create and update using prepareStatement AND also read  using two different preparedStatements

public class LaunchApp1 {
    public static void main(String[] args)
    {
        Connection con=null;
        PreparedStatement pstmt=null;
        PreparedStatement pstmt2=null;

        String url="jdbc:mysql://localhost:3306/jdbclearning";
        String user="root";
        String pass="Gnp2003@278";

        try
        {
            con=DriverManager.getConnection(url,user,pass);
            System.out.println("Connection done successfully");

            //insert through prepareStatement
            String query="insert into studentInfo values(?,?,?,?)";
            pstmt=con.prepareStatement(query);

            Scanner sc=new Scanner(System.in);

            for(int i=0;i<2;i++)
            {
                System.out.println("id,name,age,city");
                int id=sc.nextInt();
                String name=sc.next();
                int age=sc.nextInt();
                String city=sc.next();

                pstmt.setInt(1,id);
                pstmt.setString(2,name);
                pstmt.setInt(3,age);
                pstmt.setString(4,city);

                pstmt.addBatch();
            }

            int[] rowsAffected =pstmt.executeBatch();
            System.out.println(rowsAffected.length + "this much record inserted");


            String query2="select * from studentInfo where id=6";
            pstmt2=con.prepareStatement(query2);

            ResultSet rs=pstmt2.executeQuery();
            System.out.println("******** * ********");

            while(rs.next())
            {
                System.out.println(rs.getInt(1) + ":"
                        + rs.getString(2) + ":" + rs.getInt(3)
                        + ":" + rs.getString(4));

            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
