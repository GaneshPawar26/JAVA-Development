package org.ganesh;


import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.sql.DriverManager;

@WebServlet("/Register")
public class RegistrationApp extends HttpServlet {

    public void service(HttpServletRequest request, HttpServletResponse response)
    {
        String uname=request.getParameter("name");
        String email=request.getParameter("email");
        String upass=request.getParameter("password");
        String ucity=request.getParameter("city");

        String url="jdbc:mysql://localhost:3306/jdbclearning";
        String user="root";
        String password="Gnp2003@278";


        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");


            Connection con= DriverManager.getConnection(url,user,password);
//            System.out.println("Connection successfully");

            PreparedStatement pstmt=con.prepareStatement("insert into personalInfo values (?,?,?,?)");
            pstmt.setString(1,uname);
            pstmt.setString(2,email);
            pstmt.setString(3,upass);
            pstmt.setString(4,ucity);

            int rowsAffected=pstmt.executeUpdate();
            PrintWriter writer=response.getWriter();
            if(rowsAffected==0)
            {
                writer.println("Sorry your data not inserted");
            }
            else
            {
                writer.println("<h1>Registration successful</h1>");
            }

            pstmt.close();
            con.close();

        } catch (Exception e)
        {
            e.printStackTrace();
        }

    }

}
