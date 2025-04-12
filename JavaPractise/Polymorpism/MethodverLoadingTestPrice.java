package JavaPractise.Polymorpism;

class PriceCalculator {
    double calculateTotal(double price, int quantity) {
        return price * quantity;
    }

    double calculateTotal(double price, int quantity, double discountPercent) {
        double total = price * quantity;
        double discount = total * (discountPercent / 100);
        return total - discount;
    }

    double calculateTotal(double price, int quantity, double discountPercent, double shippingFee) {
        double discountedTotal = calculateTotal(price, quantity, discountPercent);
        return discountedTotal + shippingFee;
    }
}

public class MethodverLoadingTestPrice {

    public static void main(String[] args) {
        PriceCalculator pc = new PriceCalculator();
        System.out.println("Basic total: $" + pc.calculateTotal(100.0, 2));
        System.out.println("With discount: $" + pc.calculateTotal(100.0, 2, 10));
        System.out.println("With discount & shipping: $" + pc.calculateTotal(100.0, 2, 10, 15));

    }
}
