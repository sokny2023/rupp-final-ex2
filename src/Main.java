import demo.Customer;
import demo.Sale;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("John Doe", "Premium");
        Sale sale1 = new Sale(customer1, "2024-02-21", 200.0, 150.0);
        sale1.displayInfo();

        Customer customer2 = new Customer("Lovi Hola", "Gold");
        Sale sale2 = new Sale(customer2, "2024-02-21", 230.0, 180.0);
        sale2.displayInfo();
    }
}
