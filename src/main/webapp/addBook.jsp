<%--
  Created by IntelliJ IDEA.
  User: Thong
  Date: 04/04/2024
  Time: 12:30 SA
  To change this template use File | Settings | File Templates.
--%>
    <%@ page contentType="text/html;charset=UTF-8" language="java" %>
        <!DOCTYPE html>
        <html lang="vi">

        <head>
            <meta charset="UTF-8">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>Add Book</title>
        </head>

        <body>
            <div class="container">
                <div class="login-box">
                    <h1>Nhập thông tin để thêm sách</h1>

                    <br>
                    <form action="AddBookController" method="post">
                        <div class="input-group">
                            <label for="username">Tên sách:</label>
                            <input type="text" id="username" name="title" required>
                        </div>
                        <br>
                        <div class="input-group">
                            <label for="password">Tác giả:</label>
                            <input type="text" id="password" name="author" required>
                        </div>
                        <br>
                        <div class="input-group">
                            <label for="password">Năm xuất bản:</label>
                            <input type="number" id="password" name="year" required>
                        </div>
                        <br>
                        <button type="submit">Add Book</button>
                    </form>

                </div>
            </div>
        </body>

        </html>