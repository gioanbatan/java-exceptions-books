package exercise.exceptions.books;

public class Book {
    // Fields
    private String title;
    private int pages;
    private String author;
    private String publisher;

    // Constructors
    public Book(String title, int pages, String author, String publisher) {
        this.title = titleValidator(title);
        this.pages = pagesValidator(pages);
        this.author = authorValidator(author);
        this.publisher = publisherValidator(publisher);
    }

    public Book() {

    }
    // Setter and getter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = titleValidator(title);
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pagesValidator(pages);
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = authorValidator(author);
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisherValidator(publisher);
    }

    // Methods
    private String titleValidator(String title) {
        if (title.equals("")) {
            throw new RuntimeException("Il titolo non può essere vuoto");
        }
        return title;
    }
    private int pagesValidator(int pages) {
        try {
        } catch (NumberFormatException e) {
            System.out.println("Le pagine devon esssere un numero");
        }
        if (pages <= 0) {
            throw new RuntimeException("Le pagine devono essere maggiori di 0");
        }

        return pages;
    }
    private String authorValidator(String author) {
        if (author.equals("")) {
            throw new RuntimeException("L'autore non può essere vuoto");
        }
        return author;
    }

    private String publisherValidator(String publisher) {
        if (publisher.equals("")) {
            throw new RuntimeException("L'editore non può essere vuoto");
        }
        return publisher;
    }

    @Override
    public String toString() {
        return "Libro \n" +
                "Titolo " + title + '\n' +
                "Pagine " + pages + '\n' +
                "Autore " + author + '\n' +
                "Editore " + publisher;
    }
}
