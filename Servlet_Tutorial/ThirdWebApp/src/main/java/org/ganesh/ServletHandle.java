package org.ganesh;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet ("/Servlet")
public class ServletHandle extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response ) throws IOException
    {
        String name=request.getParameter("username");
        String city=request.getParameter("city");

        PrintWriter writer=response.getWriter();
         writer.println("<h1>Hii ganesh <h1>");
         writer.println(name+" "+city);

        response.sendRedirect("/ThirdWebApp/RegistrationSuccess.html");


    }
}





