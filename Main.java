import java.util.ArrayList;
import java.util.List;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class ShoppingCart {
    private List<Product> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void addItem(Product product) {
        items.add(product);
    }

    public void removeItem(Product product) {
        items.remove(product);
    }
    public List<Product> getItems() {
        return items;
    }

    public double calculateTotal() 
    {
        double total = 0;
        for (Product item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public void placeOrder() {
        // Implement order placement logic, e.g., updating inventory, generating order ID, etc.
        System.out.println("Order placed! Total amount: $" + calculateTotal());
        items.clear(); // Clear the cart after placing the order
    }
}

class User {
    private String username;
    private ShoppingCart cart;

    public User(String username) {
        this.username = username;
        this.cart = new ShoppingCart();
    }

    public void addToCart(Product product) {
        cart.addItem(product);
    }

    public void removeFromCart(Product product) {
        cart.removeItem(product);
    }
   

    public void viewCart() {
        System.out.println(username);
        System.out.println("Cart items:");
        for (Product item: cart.getItems()) {
            System.out.println(item.getName() + " - $" + item.getPrice());
        }
        System.out.println("Total: $" + cart.calculateTotal());
    }

    public void checkout() {
        cart.placeOrder();
    }
}

public class Main {
    public static void main(String[] args) {
        // Create some sample products
        Product laptop = new Product("Laptop", 999.99);
        Product smartphone = new Product("Smartphone", 499.99);
        Product headphones = new Product("Headphones", 79.99);

        // Create a user
        User user = new User("JohnDoe");

        // User adds items to the cart
        user.addToCart(laptop);
        user.addToCart(smartphone);
        user.addToCart(headphones);

        // User views the cart
        user.viewCart();

        // User removes an item from the cart
        user.removeFromCart(smartphone);

        // User views the updated cart
        user.viewCart();

        // User places an order
        user.checkout();
    }
}
