
package Code1_OPP_Book;

import java.util.Scanner;


public abstract class Book {
    private String id;
    private String title;
    private double basePrice;
    //contructor

    public Book() {
    }

    public Book(String id, String title, double basePrice) {
        this.id = id;
        this.title = title;
        this.basePrice = basePrice;
    }
    //getter and setter

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }
    
    public void addBook(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ID: ");
        setId(scanner.nextLine());
        System.out.print("Enter Title: ");
        setTitle(scanner.nextLine());
        System.out.print("Enter Base Price: ");
        setBasePrice(scanner.nextDouble());
        scanner.nextLine();
    }
    public boolean updateBookByld(String id){
        return false;
    }
    
    

    public void displayDetails(){
        System.out.println("Book ID: " + id);
        System.out.println("Title: " + title);
        System.out.println("Base Price: " + basePrice);
    }

    public abstract double calculatePrice();
    
    
    
}
