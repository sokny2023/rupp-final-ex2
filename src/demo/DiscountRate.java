package demo;

public interface DiscountRate {
    double getServiceMemberDiscount(String customerType);
    double getProductMemberDiscount(String customerType);
}
