package annualflowers.com.example;

import java.time.LocalDate;

public class OrderFlowers {
    private int quantity;
    private final AnnualFlowers annualFlowers;

    public OrderFlowers() {
        this.annualFlowers = new AnnualFlowers();
    }

    public void splitInput(String input) {
        String[] parts = input.split(",");
        if (parts.length == 2) {
            String flowerName = parts[0].trim();
            int quantity = Integer.parseInt(parts[1].trim());
            annualFlowers.setFlowerName(flowerName);
            this.quantity = quantity;
            annualFlowers.setFlowerPrice(annualFlowers.getPrice(flowerName));
        }
    }

    public double calculateTotalCost() {
        return annualFlowers.getFlowerPrice() * quantity;
    }

    @Override
    public String toString() {
        LocalDate purchaseDate = LocalDate.now();
        return "----------------------------\n" +
               "Purchase date: " + purchaseDate + "\n" +
               "Flower: " + annualFlowers.getFlowerName() + "\n" +
               "Quantity: " + quantity + "\n" +
               "Total Cost: $" + String.format("%.2f", calculateTotalCost());
    }
}
