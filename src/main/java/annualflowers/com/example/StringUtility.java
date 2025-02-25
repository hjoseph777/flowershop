package annualflowers.com.example;

public class StringUtility {
    public static String capitalizeFirstLetter(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }
        return input.substring(0, 1).toUpperCase() + input.substring(1).toLowerCase();
    }

    public static String stringify2DArray(String[][] array) {
        StringBuilder result = new StringBuilder();
        for (String[] row : array) {
            for (String element : row) {
                result.append(element).append(" ");
            }
            result.append("\n");
        }
        return result.toString();
    }
}
