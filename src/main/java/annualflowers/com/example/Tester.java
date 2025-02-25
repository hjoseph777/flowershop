package annualflowers.com.example;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OrderFlowers order = new OrderFlowers();

        System.out.println("Select flowers available: Marigold, Pansy, Zinnias, Petunia");
        System.out.print("Enter flower: ");
        String flowerName = scanner.nextLine();
        
        System.out.print("Quantity: ");
        int quantity = scanner.nextInt();
        scanner.nextLine(); // consume the newline

        order.splitInput(flowerName + "," + quantity);
        
        System.out.println(order);

        scanner.close();
    }
}
