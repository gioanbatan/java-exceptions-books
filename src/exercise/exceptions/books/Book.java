package exercise.exceptions.books;

public class Book {
    // Fields
    private String title;
    private int pages;
    private String author;
    private String publisher;

    // Constructors
    public Book(String title, int pages, String author, String publisher) {
        this.title = title;
        this.pages = pages;
        this.author = author;
        this.publisher = publisher;
    }

    public Book() {

    }
    // Setter and getter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    // Methods
    private boolean titleValidator(String title) {
        if (title.equals("")) {

            //DEBUG
            System.out.println("Nooo");
        }
        return true;
    }
}
