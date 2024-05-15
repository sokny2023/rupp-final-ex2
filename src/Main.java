import demo.Customer;
import demo.Sale;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("John Doe", "Premium");
        Sale sale1 = new Sale(customer1, "2024-02-21", 600.0, 300.0);
        sale1.displayInfo();

        Customer customer2 = new Customer("Lovi Hola", "Gold");
        Sale sale2 = new Sale(customer2, "2024-02-21", 230.0, 180.0);
        sale2.displayInfo();

        Customer customer3 = new Customer("Hong Lina", "Silver");
        Sale sale3 = new Sale(customer3, "2024-02-22", 240.0, 190.0);
        sale3.displayInfo();

        Customer customer4 = new Customer("Lovi Hola", "Nomral");
        Sale sale4 = new Sale(customer4, "2024-02-23", 750.0, 400.0);
        sale4.displayInfo();
    }
}
