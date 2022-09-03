public class Library {
    private Book[] books;

    public Library(int size) {
        books = new Book[size];
    }

    public void addBook(Book bookName) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = bookName;
                break;
            }
        }
    }

    public void printBooks() {
        for (Book element : books) {
            if (element != null) {
                System.out.printf("%s by %s was published in %d\n", element.getName(), element.getAuthor().getFullName(),
                        element.getPublishingYear());

            }
        }
    }

    public void printBookByName(String bookName){
        for (Book element : books){
            if (element.getName().equals(bookName)){
                System.out.printf("%s by %s was published in %d\n", element.getName(), element.getAuthor().getFullName(),
                        element.getPublishingYear());
                break;
            }
        }
    }

    public void setPublishingYearByName(String bookName, int publishingYear){
        for (Book element : books){
            if (element.getName().equals(bookName)){
                element.setPublishingYear(publishingYear);
                break;
            }
        }
    }
}
