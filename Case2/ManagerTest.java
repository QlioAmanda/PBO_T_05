public class ManagerTest {
    public static void main(String[] args) {
        Manager[] managers = new Manager[2];
        managers[0] = new Manager("Alice", 4000000, 1, 5, 1990);
        managers[1] = new Manager("Bob", 3500000, 1, 7, 1995);

        for (Manager m : managers) m.raiseSalary(5);

        System.out.println("=== Before Sorting Managers ===");
        for (Manager m : managers) m.print();

        Sortable.shell_sort(managers);

        System.out.println("=== After Sorting Managers ===");
        for (Manager m : managers) m.print();
    }
}
