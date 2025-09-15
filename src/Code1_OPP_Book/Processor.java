package Code1_OPP_Book;

import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookList bookList = new BookList();
        int choice;

        do {
            System.out.println("\n===== BOOK MANAGEMENT MENU =====");
            System.out.println("1. Add new TextBook");
            System.out.println("2. Add new ReferenceBook");
            System.out.println("3. Update book by ID");
            System.out.println("4. Delete book by ID");
            System.out.println("5. Find book by ID");
            System.out.println("6. Display all books");
            System.out.println("7. Find the most expensive book");
            System.out.println("8. Count TextBooks and ReferenceBooks");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Base Price: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Enter Subject: ");
                    String subject = scanner.nextLine();

                    TextBook textBook = new TextBook(id, title, price, subject);
                    bookList.addBook(textBook);
                }
                case 2 -> {
                    System.out.print("Enter ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Base Price: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Enter Publisher: ");
                    String publisher = scanner.nextLine();

                    ReferenceBook refBook = new ReferenceBook(id, title, price, publisher);
                    bookList.addBook(refBook);
                }

                case 3 -> {
                    System.out.print("Enter ID to update: ");
                    String id = scanner.nextLine();
                    boolean updated = bookList.updateBookById(id);
                    if (updated) {
                        System.out.println("Book updated.");
                    }
                }

                case 4 -> {
                    System.out.print("Enter ID to delete: ");
                    String id = scanner.nextLine();
                    bookList.deleteBookById(id);
                }
                case 5 -> {
                    System.out.print("Enter ID to find: ");
                    String id = scanner.nextLine();
                    Book found = bookList.findBookById(id);
                    if (found != null) {
                        found.displayDetails();
                    }
                }

                case 6 ->
                    bookList.displayAllBooks();

                case 7 ->
                    bookList.findMostExpensiveBook();

                case 8 ->
                    bookList.countBooks();

                case 0 ->
                    System.out.println("Exiting program. Goodbye!");

                default ->
                    System.out.println("Invalid option. Please try again.");
            }
        } while (choice != 0);
    }

}
