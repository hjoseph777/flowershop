package annualflowers.com.example;

public class AnnualFlowers {
    private final String[][] flowers = {
        {"Marigold", "2.30"},
        {"Pansy", "1.50"},
        {"Zinnias", "5.12"},
        {"Petunia", "3.25"}
    };

    private String flowerName;
    private double flowerPrice;

    public String getFlowerName() {
        return flowerName;
    }

    public void setFlowerName(String flowerName) {
        this.flowerName = flowerName;
    }

    public double getFlowerPrice() {
        return flowerPrice;
    }

    public void setFlowerPrice(double flowerPrice) {
        this.flowerPrice = flowerPrice;
    }

    public double getPrice(String flowerName) {
        for (String[] flower : flowers) {
            if (flower[0].equalsIgnoreCase(flowerName)) {
                return Double.parseDouble(flower[1]);
            }
        }
        return 0.0;
    }

    @Override
    public String toString() {
        return StringUtility.stringify2DArray(flowers);
    }
}
