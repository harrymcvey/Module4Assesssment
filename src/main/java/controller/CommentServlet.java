package controller;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.ComicBook;
import model.ComicBookProcessor;

@WebServlet("/CommentServlet")
public class CommentServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public CommentServlet() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Retrieve data from the form
        String title = request.getParameter("title");
        String issueNumber = request.getParameter("issueNumber");
        String publicationDate = request.getParameter("publicationDate");
        String condition = request.getParameter("condition");
        String commentText = request.getParameter("comment"); // Retrieve the comment
        
        // Process the comic book data using ComicBookProcessor
        ComicBook comicBook = ComicBookProcessor.processComicBookData(title, issueNumber, publicationDate, condition);

        // Add the comment to the comic book
        comicBook.addComment(commentText);

        // Forward to a JSP page to display the result
        request.setAttribute("comicBook", comicBook);
        getServletContext().getRequestDispatcher("/result2.jsp").forward(request, response);
    }
}
