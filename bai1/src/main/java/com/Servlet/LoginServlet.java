package com.Servlet;
import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import com.DAO.LoginDao;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username = request.getParameter("user");
        String password = request.getParameter("pass");
        LoginDao login = new LoginDao();
        try {
            if (login.check(username, password)) {
                response.sendRedirect("welcome.jsp");
            } else {
                response.sendRedirect("login.jsp");
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}