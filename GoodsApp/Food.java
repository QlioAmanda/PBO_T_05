public class Food extends Goods implements Taxable {
    public Food(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.05;
    }
}
