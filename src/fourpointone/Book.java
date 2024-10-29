package fourpointone;

import java.util.ArrayList;

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return title + " (" + author + ")";
    }
}

class Reader {
    private String fullName;
    private String ticketNumber;
    private String faculty;
    private String birthDate;
    private String phone;

    public Reader(String fullName, String ticketNumber, String faculty, String birthDate, String phone) {
        this.fullName = fullName;
        this.ticketNumber = ticketNumber;
        this.faculty = faculty;
        this.birthDate = birthDate;
        this.phone = phone;
    }

    public void takeBook(int count) {
        System.out.println(fullName + " взял " + count + " книги.");
    }

    public void takeBook(String... books) {
        System.out.print(fullName + " взял книги: ");
        for (String book : books) {
            System.out.print(book + ", ");
        }
        System.out.println();
    }

    public void takeBook(Book... books) {
        System.out.print(fullName + " взял книги: ");
        for (Book book : books) {
            System.out.print(book + ", ");
        }
        System.out.println();
    }

    public void returnBook(int count) {
        System.out.println(fullName + " вернул " + count + " книги.");
    }

    public void returnBook(String... books) {
        System.out.print(fullName + " вернул книги: ");
        for (String book : books) {
            System.out.print(book + ", ");
        }
        System.out.println();
    }

    public void returnBook(Book... books) {
        System.out.print(fullName + " вернул книги: ");
        for (Book book : books) {
            System.out.print(book + ", ");
        }
        System.out.println();
    }
}

class LibraryTest {
    public static void main(String[] args) {
        Reader[] readers = new Reader[2];
        readers[0] = new Reader("Петров В. В.", "12345", "Физика", "01.01.2000", "123-456");
        readers[1] = new Reader("Сидорова А. А.", "54321", "Математика", "02.02.1999", "654-321");

        for (Reader reader : readers) {
            reader.takeBook(3);
            reader.takeBook("Приключения", "Словарь", "Энциклопедия");

            Book book1 = new Book("Война и мир", "Лев Толстой");
            Book book2 = new Book("1984", "Джордж Оруэлл");
            reader.takeBook(book1, book2);

            reader.returnBook(2);
            reader.returnBook("Приключения", "Словарь");
            reader.returnBook(book1, book2);
        }
    }
}