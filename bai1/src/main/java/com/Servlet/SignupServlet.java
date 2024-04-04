package com.Servlet;

import javax.servlet.http.HttpServlet;

import java.io.IOException;
import java.sql.*;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/SignupServlet")
public class SignupServlet extends HttpServlet {
	public static Connection connection=null;
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
		String name=request.getParameter("name");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String jdbcUrl="jdbc:mysql://localhost:3306/user";
		String jdbcUsername="root";
		String jdbcPassword="";
		String sql="Insert into userinfo(name,username,password) values (?,?,?)";
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection=DriverManager.getConnection(jdbcUrl,jdbcUsername,jdbcPassword);
			PreparedStatement stm=connection.prepareStatement(sql);
			stm.setString(1,name);
			stm.setString(2,username);
			stm.setString(3,password);
			int rows=stm.executeUpdate();
			if(rows>0) {
				
				response.sendRedirect("login.jsp");
			}
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
