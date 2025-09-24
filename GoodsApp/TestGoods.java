public class TestGoods {
    public static void main(String[] args) {
        Food apple = new Food("Apple", 10000);
        Toy car = new Toy("Toy Car", 50000);
        Book novel = new Book("Novel", 80000);

        System.out.println(apple.getName() + " tax: " + apple.calculateTax());
        System.out.println(car.getName() + " tax: " + car.calculateTax());
        System.out.println(novel.getName() + " tax: " + novel.calculateTax());
    }
}
