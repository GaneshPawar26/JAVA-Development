package org.ganesh;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet ("/Register")
public class Controller extends HttpServlet {

    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String name=request.getParameter("name");
        String email=request.getParameter("email");
        String pass=request.getParameter("password");
        String city=request.getParameter("city");

        Model model=new Model();

        model.setName(name);
        model.setEmail(email);
        model.setPass(pass);
        model.setCity(city);


        int row = model.register();

        if(row==0)
        {
            response.sendRedirect("/MVN_Registration/failure.jsp");
        }
        else
        {
            HttpSession session=request.getSession();
            session.setAttribute("name",name);

            response.sendRedirect("/MVN_Registration/success.jsp");
        }


    }

}
