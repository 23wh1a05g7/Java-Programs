import java.util.Scanner;

class Product {
    String name;
    int quantity;
    double cost;

    Product(String name, int quantity, double cost) {
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
    }

    double getValue() {
        return quantity * cost;
    }
}

public class ProductDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of products: ");
        int numProducts = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        String highestValueProductName = "";
        double highestValue = 0;

        for (int i = 0; i < numProducts; i++) {
            System.out.print("Enter product name: ");
            String name = scanner.nextLine();

            System.out.print("Enter quantity: ");
            int quantity = scanner.nextInt();

            System.out.print("Enter cost: ");
            double cost = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            Product product = new Product(name, quantity, cost);
            double value = product.getValue();

            if (value > highestValue) {
                highestValue = value;
                highestValueProductName = name;
            }
        }

        System.out.println("Product with highest value:");
        System.out.println("Name: " + highestValueProductName);
        System.out.println("Value: " + highestValue);

        scanner.close();
    }
}
