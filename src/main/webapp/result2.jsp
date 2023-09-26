<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Second Servlet Result</title>
</head>
<body>
    <h2>Result from Second Servlet</h2>
    <p>Title: ${comicBook.title}</p>
    <p>Issue Number: ${comicBook.issueNumber}</p>
    <p>Publication Date: ${comicBook.publicationDate}</p>
    <p>Condition: ${comicBook.condition}</p>
    <p>Comments:</p>
    <ul>
        <c:forEach var="comment" items="${comicBook.comments}">
            <li>${comment}</li>
        </c:forEach>
    </ul>
    <form action="CommentServlet" method="post">
        <input type="hidden" name="title" value="${comicBook.title}" />
        <input type="hidden" name="issueNumber" value="${comicBook.issueNumber}" />
        <input type="hidden" name="publicationDate" value="${comicBook.publicationDate}" />
        <input type="hidden" name="condition" value="${comicBook.condition}" />
        <label for="comment">Add Comment:</label>
        <textarea id="comment" name="comment" required></textarea><br><br>
        <input type="submit" value="Submit Comment">
    </form>
    <p><a href="index.jsp">Return to Home Page</a></p>
</body>
</html>
