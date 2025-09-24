public class Book extends Goods implements Taxable {
    public Book(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateTax() {
        return 0;
    }
}
