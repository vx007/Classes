public class Main {
    public static void main(String[] args) {
        // Задание 1
        {
            Author jRowling = new Author("Джоан", "Роулинг");
            Author sKing = new Author("Стивен", "Кинг");
            Book hPotter = new Book("Гарри Поттер и узник Азкабана", jRowling, 2018);
            Book gMile = new Book("Зелёная миля", sKing, 2014);
            hPotter.setPublishingYear(2019);
            System.out.printf("1 книга: %s, %s %s, %d\n", hPotter.getName(), hPotter.getAuthor().getFirstName(),
                    hPotter.getAuthor().getLastName(), hPotter.getPublishingYear());
            System.out.printf("2 книга: %s, %s %s, %d\n", gMile.getName(), gMile.getAuthor().getFirstName(),
                    gMile.getAuthor().getLastName(), gMile.getPublishingYear());
        }

        // Дополнительные задания
        // https://skyengpublic.notion.site/1-9-8c8958614f2144d1b45e24e426c83cf0

        // Задание 2
        {
            Book[] books = new Book[5];
            addBooks(books, new Book("451° по Фаренгейту", new Author("Рэй", "Брэдбери"), 2008));
            addBooks(books, new Book("1984", new Author("Джорж", "Оруэлл"), 1999));
            addBooks(books, new Book("Мастер и Маргарита", new Author("Михаил", "Булгаков"), 2006));
            printBooks(books);
        }

        // Задание 3
        {
            Library books = new Library(5);
            books.addBook(new Book("Портрет Дориана Грея", new Author("Оскар","Уайльд"),1990));
            books.addBook(new Book("Маленький принц", new Author("Антуан","де Сент-Экзюпери"),2005));
            books.addBook(new Book("Над пропастью во ржи", new Author("Джером","Сэлинджер"),2008));
            books.printBooks();
            books.setPublishingYearByName("Портрет Дориана Грея", 2001);
            books.printBookByName("Портрет Дориана Грея");
        }
    }

    public static void addBooks(Book[] books, Book book) {
        for (int i = 0 ; i< books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                break;
            }
        }
    }

    public static void printBooks(Book[] books) {
        for (Book element : books) {
            if (element != null) {
                System.out.printf("%s: '%s': %d\n", element.getAuthor().getFullName(), element.getName(),
                        element.getPublishingYear());

            }
        }
    }

}
