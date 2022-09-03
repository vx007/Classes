public class Book {
    private String name;
    private Author author;
    private int publishingYear;

    public Book(String name, Author author, int year) {
        this.name = name;
        this.author = author;
        publishingYear = year;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int year) {
        publishingYear = year;
    }
}
