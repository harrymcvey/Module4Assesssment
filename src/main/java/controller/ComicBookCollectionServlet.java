package controller;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.ComicBook;
import model.ComicBookProcessor;

@WebServlet("/ComicBookCollectionServlet")
public class ComicBookCollectionServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public ComicBookCollectionServlet() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Retrieve data from the form
        String title = request.getParameter("title");
        String issueNumber = request.getParameter("issueNumber");
        String publicationDate = request.getParameter("publicationDate");
        String condition = request.getParameter("condition");

        // Process the form data using ComicBookProcessor
        ComicBook comicBook = ComicBookProcessor.processComicBookData(title, issueNumber, publicationDate, condition);

        // Forward to result page 1 with comicBook data
        request.setAttribute("comicBook", comicBook);
        getServletContext().getRequestDispatcher("/result1.jsp").forward(request, response);
    }
}
