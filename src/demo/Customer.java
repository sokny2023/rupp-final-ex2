package demo;

public class Customer implements DiscountRate{
    private String customerName;
    private String CustomerType;
    Customer(){};

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
        switch (customerType.toLowerCase()) {
            case "premium":
                return 0.2;
            case "gold":
                return 0.15;
            case "silver":
                return 0.1;
            default:
                return 0;
        }

    }

    @Override
    public double getProductMemberDiscount(String customerType) {
        switch (customerType.toLowerCase()) {
            case "premium":
                return 0.1;
            case "gold":
            case "silver":
                return 0.1;
            default:
                return 0.0;
        }
    }

}
