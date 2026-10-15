import java.util.Scanner;
import java.util.ArrayList;
import java.nio.file.Files;
import java.nio.file.Path;

public class FarmerMarket1 {

    // CO4: Class and object
    static class Product {
        String name;
        double price;
        int quantity;

        Product(String name, double price, int quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }
    }

    // CO3: User-defined method
    static double calculateTotal(double price, int quantity) {
        return price * quantity;
    }

    // CO3: Recursion
    static int sum(int[] a, int i) {
        if (i == a.length)
            return 0;
        return a[i] + sum(a, i + 1);
    }

    public static void main(String[] args) {

        // CO1: Scanner class
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter farmer name: ");
        String farmer = sc.nextLine().toUpperCase();

        System.out.print("Enter product name: ");
        String name = sc.nextLine().toUpperCase();

        System.out.print("Enter price per kg: ");
        double price = sc.nextDouble();

        System.out.print("Enter quantity sold: ");
        int quantity = sc.nextInt();

        // CO3: Array
        int[] a = {quantity};

        // CO4: Object creation
        Product p = new Product(name, price, quantity);

        double total = calculateTotal(price, quantity);

        System.out.println("\n--- Farmers Market ---");
        System.out.println("Farmer: " + farmer);
        System.out.println("Product: " + p.name);
        System.out.println("Total Sales: Rs." + total);

        // CO2: Conditional statement
        if (total >= 1000)
            System.out.println("Status: Good Sales");
        else
            System.out.println("Status: Low Sales");

        // CO5: File handling
        try {
            Files.writeString(Path.of("sales.txt"),
                    "Farmer: " + farmer + "\nTotal Sales: " + total);
            System.out.println("Report saved successfully.");
        } catch (Exception e) {
            System.out.println("File error.");
        }

        // CO6: ArrayList and sorting
        ArrayList<String> products = new ArrayList<>();
        products.add(name);
        products.sort((x, y) -> x.compareTo(y));

        // CO6: Lambda expression
        products.forEach(System.out::println);

        // CO3: Recursion
        System.out.println("Total Quantity: " + sum(a, 0));

        sc.close();
    }
}
