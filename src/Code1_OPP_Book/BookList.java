package Code1_OPP_Book;

import java.util.ArrayList;

public class BookList {

    public static ArrayList<Book> bookList = new ArrayList<>();
    //Scanner scanner = new Scanner(System.in);

    public BookList() {
    }

    public static void addBook(Book book ) {

        bookList.add(book);

        System.out.println("Added");

    }
    public static ArrayList<Book> getBooks() {
        return bookList;
    }


    public boolean updateBookById(String id) {
        for (Book book : bookList) {
            if (book.getId().equals(id)) {
                book.updateBookByld(id);
                return true;
            }
        }
        System.out.println("Not found ID: " + id);
        return false;
    }

    public boolean deleteBookById(String id) {
        for (Book object : bookList) {
            if (id.equals(object.getId())) {
                bookList.remove(object);
                System.out.println("Deleted ID: " + id);
                return true;
            } else {
                System.out.println("Not found ID: " + id);

            }
        }
        return false;
    }

    public Book findBookById(String id) {
        for (Book book : bookList) {
            if (book.getId().equals(id)) {
                return book;
            }
        }
        System.out.println("Not found ID: " + id);
        return null;
    }

    public static void displayAllBooks() {
        if (bookList.isEmpty()) {
            System.out.println("Empty");
        } else {
            for (Book book : bookList) {
                book.displayDetails();
            }
        }
    }

    public Book findMostExpensiveBook() {
        if (bookList.isEmpty()) {
            System.out.println("Empty");
            return null;
        }

        Book mostExpensive = bookList.get(0);
        for (Book book : bookList) {
            if (book.calculatePrice() > mostExpensive.calculatePrice()) {
                mostExpensive = book;
            }
        }

        System.out.println("Most expensive book:");
        mostExpensive.displayDetails();
        return mostExpensive;
    }

    public void countBooks() {
        int textCount = 0;
        int refCount = 0;

        for (Book book : bookList) {
            if (book instanceof TextBook) {
                textCount++;
            } else if (book instanceof ReferenceBook) {
                refCount++;
            }
        }

        System.out.println("Total TextBooks: " + textCount);
        System.out.println("Total ReferenceBooks: " + refCount);
    }

}
