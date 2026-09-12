import java.util.Scanner;

public class FarmersMarket {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // co1
        String farmerName;
        String productName;
        double price;
        int quantity;
        double totalSales;

        System.out.print("Enter farmer name: ");
        farmerName = sc.next();

        System.out.print("Enter product name: ");
        productName = sc.next();

        System.out.print("Enter price per kg: ");
        price = sc.nextDouble();

        System.out.print("Enter quantity sold: ");
        quantity = sc.nextInt();

        totalSales = price * quantity;

        System.out.println("---Farmers Market ---");
        System.out.println("Farmer: " + farmerName);
        System.out.println("Product: " + productName);
        System.out.println("Price per kg: Rs." + price);
        System.out.println("Quantity sold: " + quantity + " kg");
        System.out.println("Total Sales: Rs." + totalSales);
        //co2
        if (totalSales >= 1000) {
            System.out.println("Status: Good Sales");
        } else {
            System.out.println("Status: Low Sales");
        }
        sc.close();
    }
}
