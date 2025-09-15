package Code1_OPP_Book;

public class TextBook extends Book {

    private String subject;

    public TextBook() {
    }

    public TextBook(String subject) {
        this.subject = subject;
    }

    public TextBook( String id, String tille, double basePrice,String subject) {
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
