package com.DAO;
import java.sql.*;

public class LoginDao {
    public static Connection connection = null;

    public boolean check(String username, String password) throws ClassNotFoundException, SQLException {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet rs = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String jdbcUrl = "jdbc:mysql://localhost:3306/user";
            String jdbcUsername = "root";
            String jdbcPassword = "";
            connection = DriverManager.getConnection(jdbcUrl, jdbcUsername, jdbcPassword);
            String sql = "SELECT * FROM userinfo WHERE username=? AND password=?";
            statement = connection.prepareStatement(sql);
            statement.setString(1, username);
            statement.setString(2, password);
            rs = statement.executeQuery();
            return rs.next();
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
    }
}