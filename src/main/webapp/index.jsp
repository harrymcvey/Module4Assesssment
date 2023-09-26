<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Comic Book Collection Tracker</title>
</head>
<body>
    <h1>Comic Book Collection Tracker</h1>
    
    <form action="CommentServlet" method="post">
        <label for="title">Title:</label>
        <input type="text" id="title" name="title" required><br><br>
        
        <label for="issueNumber">Issue Number:</label>
        <input type="text" id="issueNumber" name="issueNumber" required><br><br>
        
        <label for="publicationDate">Publication Date:</label>
        <input type="text" id="publicationDate" name="publicationDate" required><br><br>
        
        <label for="condition">Condition:</label>
        <select id="condition" name="condition" required>
            <option value="Mint">Mint</option>
            <option value="Near Mint">Near Mint</option>
        </select><br><br>
        
        <input type="submit" value="Add Comic Book">
    </form>
</body>
</html>
