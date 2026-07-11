package org.ganesh;


import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/ServletOne")
public class FirstServlet extends HttpServlet {

    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       String name= request.getParameter("username");
       String city= request.getParameter("city");

      HttpSession session= request.getSession();
       session.setAttribute("name",name);

       RequestDispatcher reqDispatcher= request.getRequestDispatcher("/ServletTwo");

       reqDispatcher.forward(request,response);
    }

}
