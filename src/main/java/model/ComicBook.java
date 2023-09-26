package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ComicBook implements Serializable {
    private static final long serialVersionUID = 1L;

    private String title;
    private String issueNumber;
    private String publicationDate;
    private String condition;
    private List<String> comments; // List to store comments

    public ComicBook() {
        super();
        comments = new ArrayList<>(); // Initialize the comments list
    }

    public ComicBook(String title, String issueNumber, String publicationDate, String condition) {
        super();
        this.title = title;
        this.issueNumber = issueNumber;
        this.publicationDate = publicationDate;
        this.condition = condition;
        comments = new ArrayList<>(); // Initialize the comments list
    }

    // Getters and Setters for the comic book properties

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(String issueNumber) {
        this.issueNumber = issueNumber;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    // Methods to handle comments

    public void addComment(String comment) {
        comments.add(comment);
    }

    public List<String> getComments() {
        return comments;
    }

    @Override
    public String toString() {
        return "ComicBook [title=" + title + ", issueNumber=" + issueNumber + ", publicationDate=" + publicationDate
                + ", condition=" + condition + ", comments=" + comments + "]";
}
}