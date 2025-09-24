public class Toy extends Goods implements Taxable {
    public Toy(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.10;
    }
}
