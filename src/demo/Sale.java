package demo;

public class Sale implements DiscountRate {
    Customer customer;
    private String date;
    private double serviceExpense;
    private double productExpense;
    Sale(){};

    public Sale(Customer customer, String date, double serviceExpense, double productExpense) {
        this.customer = customer;
        this.date = date;
        this.serviceExpense = serviceExpense;
        this.productExpense = productExpense;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
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
