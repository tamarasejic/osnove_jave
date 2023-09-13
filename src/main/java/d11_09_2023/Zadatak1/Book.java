package d11_09_2023.Zadatak1;

public class Book {

    private String  isbn;
    private String name;
    private int publishYear;
    private Author author;

    public Book (String isbn) {
        this.isbn = isbn;
    }

    public Book (String isbn, String name, int publishYear, Author author) {
        this.isbn = isbn;
        this.name = name;
        this.publishYear = publishYear;
        this.author  = author;
    }

    public void printInfo() {
        System.out.println(this.isbn);
        if (this.name != null && this.publishYear != 0) {
            System.out.println(this.name + " - " + this.publishYear);
        }
        if (this.author != null) {
            System.out.print("Author: ");
            this.author.printInfo();
        }
    }


//    getters & setters
    public String getIsbn() {
        return this.isbn;
    }

    public String getName() {
        return this.name;
    }
    public void setName (String name) {
        this.name = name;
    }

    public int getPublishYear() {
        return this.publishYear;
    }
    public void setPublishYear (int publishYear) {
        this.publishYear = publishYear;
    }

    public Author getAuthor() {
        return this.author;
    }
    public void setAuthor(Author author1) {
        this.author = author;
    }
}
