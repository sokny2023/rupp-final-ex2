package demo;

public class Sale {
    Customer customer;
    private String date;
    private double serviceExpense;
    private double productExpense;

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

    public double getTotalExpense() {
        return (serviceExpense - serviceExpense * customer.getServiceMemberDiscount(customer.getCustomerType())) +
                (productExpense - productExpense * customer.getProductMemberDiscount(customer.getCustomerType()));
    }

    public void displayInfo() {
        System.out.println("=".repeat(40));
        System.out.println(" ".repeat(5)+"Customer Name: " + customer.getCustomerName());
        System.out.println(" ".repeat(5)+"Customer Type: " + customer.getCustomerType());
        System.out.println(" ".repeat(5)+"Date: " + getDate());
        System.out.println(" ".repeat(5)+"Service Expense: " + getServiceExpense());
        System.out.println(" ".repeat(5)+"Product Expense: " + getProductExpense());
        System.out.println(" ".repeat(5)+"Total Expense: " + getTotalExpense());
        System.out.println("=".repeat(40));
        System.out.println();
    }
}