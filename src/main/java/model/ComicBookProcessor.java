package model;

public class ComicBookProcessor {
    public static ComicBook processComicBookData(String title, String issueNumber, String publicationDate, String condition) {
        // Create a ComicBook object
        ComicBook comicBook = new ComicBook(title, issueNumber, publicationDate, condition);
        
        return comicBook;
    }
}
