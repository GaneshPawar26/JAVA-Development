package com.ganesh;//package com.ganesh;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/firstServlet")
public class FirstServletApp extends HttpServlet
{
    public void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException
    {
        String name=request.getParameter("username");
        String ucity=request.getParameter("city");

        PrintWriter writer=response.getWriter();
        writer.println("hello"+name);
        writer.println("i know your city is: "+ucity);


        writer.close();
    }
}