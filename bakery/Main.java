/**
 * Create an order and print it
 */
public class Main {
    public static void main(String[] args) {
        // Create the order
        Order order = new Order();
        order.addCake(new ChocolateCake());
        order.addCake(new Saying(new VanillaCake(), "PLAIN!"));
        order.addCake(new Saying(new Sprinkles(new VanillaCake()), "FANCY!"));
        order.addCake(new Saying(new Saying(new Sprinkles(new Sprinkles(new MultiLayered(new StrawberryCake()))), "One of"), "EVERYTHING"));

        // Print the order
        order.printOrder();
    }
}
