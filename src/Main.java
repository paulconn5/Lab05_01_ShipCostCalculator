public class Main {
    public static void main(String[] args) {

        double itemPrice = 110;
        double totalCost = itemPrice;
        double shippingCost = 0;
        System.out.println("Item price set at $" + itemPrice);

        if (itemPrice <= 100) {
            shippingCost = 0.02 * itemPrice;
        }
        totalCost = itemPrice + shippingCost;
        System.out.println("Item price: $" + itemPrice + " Shipping Cost: $" + shippingCost +
                " Total Cost: " + totalCost);
    }
}