
package org.ganesh;


import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/ServletTwo")
public class SecondServlet extends HttpServlet {

    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
        HttpSession session=request.getSession(false);

        String name= (String) session.getAttribute("name");

        PrintWriter writer=response.getWriter();

        writer.println("response from second servlet for name:"+name);



    }

}
