<%--
  Created by IntelliJ IDEA.
  User: Thong
  Date: 04/04/2024
  Time: 11:15 SA
  To change this template use File | Settings | File Templates.
--%>
    <%@ page contentType="text/html;charset=UTF-8" language="java" %>
        <!DOCTYPE html>
        <html lang="vi">

        <head>
            <meta charset="UTF-8">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>Đăng Nhập</title>
        </head>

        <body>
            <div class="container">
                <div class="login-box">
                    <h1>Đăng Nhập để xem danh sách các sách</h1>
                    <pre>
                Tài khoản mặc định
                Tài khoản: user
                Mật khẩu: 123

            </pre>

                    <br>
                    <form action="LoginController">
                        <div class="input-group">
                            <label for="username">Tên người dùng:</label>
                            <input type="text" id="username" name="username" required>
                        </div>
                        <br>
                        <div class="input-group">
                            <label for="password">Mật khẩu:</label>
                            <input type="password" id="password" name="password" required>
                        </div>
                        <br>
                        <button type="submit">Đăng Nhập</button>
                    </form>

                </div>
            </div>
        </body>

        </html>