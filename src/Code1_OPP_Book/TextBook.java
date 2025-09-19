package Code1_OPP_Book;

import java.util.Scanner;

public class TextBook extends Book {

    private String subject;

    public TextBook() {
    }

    public TextBook(String subject) {
        this.subject = subject;
    }

    public TextBook(String id, String tille, double basePrice, String subject) {
        super(id, tille, basePrice);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public void addBook() {
        Scanner scanner = new Scanner(System.in);
        super.addBook();
        System.out.print("Enter Subject: ");
        subject = scanner.nextLine();

        BookList.addBook(this);
        System.out.println("TextBook added.");
    }




    @Override
    public boolean updateBookByld(String id) {
        return false;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Subject: " + subject);
        System.out.println("Final Price: " + calculatePrice());

    }

    @Override
    public double calculatePrice() {
        return getBasePrice() * 0.1;

    }

    

}
