<%@ page import="com.thuchanh.th.Entity.Book" %>
    <%@ page import="java.util.List" %>
        <%--
  Created by IntelliJ IDEA.
  User: Thong
  Date: 04/04/2024
  Time: 11:50 SA
  To change this template use File | Settings | File Templates.
--%>
            <%@ page contentType="text/html;charset=UTF-8" language="java" %>
                <!DOCTYPE html>
                <html lang="vi">

                <head>
                    <meta charset="UTF-8">
                    <meta name="viewport" content="width=device-width, initial-scale=1.0">
                    <title>List Book</title>
                </head>

                <body>
                    <div class="container">
                        <div class="login-box">
                            <h1>List Book:</h1>
                            <table>
                                <thead>
                                    <tr>
                                        <th>Title</th>
                                        <th>Author</th>
                                        <th>Year</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <%
                List<Book> bookList = (List<Book>) request.getAttribute("bookList");
                if(bookList != null && !bookList.isEmpty() ){
                    for (Book book : bookList) {
            %>
                                        <tr>
                                            <td>
                                                <%= book.getTitle() %>
                                            </td>
                                            <td>
                                                <%= book.getAuthor() %>
                                            </td>
                                            <td>
                                                <%= book.getYear() %>
                                            </td>
                                        </tr>
                                        <% }
            }%>
                                </tbody>
                            </table>
                            <br>
                            <button type="submit" onclick="submit()">Add book</button>
                        </div>
                    </div>
                </body>
                <script>
                    function submit() {
                        window.location.href = "addBook.jsp"
                    }
                </script>

                </html>