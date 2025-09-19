package Code1_OPP_Book;

import java.util.Scanner;

public class ReferenceBook extends Book {

    private String publisher;

    public ReferenceBook() {
    }

    public ReferenceBook(String id, String tille, double basePrice, String publisher) {
        super(id, tille, basePrice);
        this.publisher = publisher;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public void addBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ID: ");
        setId(scanner.nextLine());
        System.out.print("Enter Title: ");
        setTitle(scanner.nextLine());
        System.out.print("Enter Base Price: ");
        setBasePrice(scanner.nextDouble());
        scanner.nextLine();
        System.out.print("Enter Publisher: ");
        publisher = scanner.nextLine();

        BookList.addBook(this); 
        System.out.println("✅ ReferenceBook added.");
    }



    public boolean updateBookById(String id) {
        return false;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Publisher: " + publisher);
        System.out.println("Final Price: " + calculatePrice());

    }

    @Override
    public double calculatePrice() {
        return getBasePrice() * 1.20;
    }
}
