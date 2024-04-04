package com.thuchanh.th.Controller;


import com.thuchanh.th.Entity.Book;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "AddBookController", urlPatterns = {"/AddBookController"})
public class AddBookController extends HttpServlet {
    protected void DOPOST(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String title = request.getParameter("title");
        String author = request.getParameter("author");
        int year = Integer.parseInt(request.getParameter("year"));

        Book book = new Book(title, author, year);

        List<Book> bookList = (List<Book>) getServletContext().getAttribute("bookList");

        if (bookList == null) {
            bookList = new ArrayList<>();
        }

        bookList.add(book);

        getServletContext().setAttribute("bookList", bookList);
        request.setAttribute("bookList", bookList);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/listBook.jsp");
        dispatcher.forward(request, response);
    }
}
