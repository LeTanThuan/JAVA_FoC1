package Code1_OPP_Book;

public class ReferenceBook extends Book {

    private String publisher;

    public ReferenceBook() {
    }

    public ReferenceBook( String id, String tille, double basePrice, String publisher) {
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
    public double getBasePrice() {
        return basePrice;
    }

    @Override
    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    @Override
    public void addBook(Book book) {

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
