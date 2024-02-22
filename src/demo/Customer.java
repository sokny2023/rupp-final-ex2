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
    public double getServiceMemberDiscount() {

        return 0;
    }

    @Override
    public double getProductMemberDiscount() {
        return 0;
    }

}
