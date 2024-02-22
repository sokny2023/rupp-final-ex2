package demo;

public class Customer implements DiscountRate{
    private String customerName;
    private String CustomerType;

    public Customer(String customerName, String customerType) {
        this.customerName = customerName;
        CustomerType = customerType;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerType() {
        return CustomerType;
    }

    public void setCustomerType(String customerType) {
        CustomerType = customerType;
    }

    @Override
    public double getServiceMemberDiscount(String customerType) {
        return switch (customerType.toLowerCase()) {
            case "premium" -> 0.2;
            case "gold" -> 0.15;
            case "silver" -> 0.1;
            default -> 0;
        };
    }

    @Override
    public double getProductMemberDiscount(String customerType) {
        return switch (customerType.toLowerCase()) {
            case "premium","gold", "silver" -> 0.1;
            default -> 0.0;
        };
    }
}
