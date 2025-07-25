public class StringConversionCheck {
    public static void main(String[] args) {
        String strNumber = "123";
        String strDecimal = "45.67";
        String strBoolean = "true";
        String strInvalid = "abc";

        // Convert to int
        try {
            int intValue = Integer.parseInt(strNumber);
            System.out.println("String to int: " + intValue);
        } catch (NumberFormatException e) {
            System.out.println("Cannot convert '" + strNumber + "' to int.");
        }

        // Convert to double
        try {
            double doubleValue = Double.parseDouble(strDecimal);
            System.out.println("String to double: " + doubleValue);
        } catch (NumberFormatException e) {
            System.out.println("Cannot convert '" + strDecimal + "' to double.");
        }

        // Convert to boolean
        boolean boolValue = Boolean.parseBoolean(strBoolean);
        System.out.println("String to boolean: " + boolValue);

        // Try invalid string to int
        try {
            int invalidInt = Integer.parseInt(strInvalid);
            System.out.println("String to int (invalid): " + invalidInt);
        } catch (NumberFormatException e) {
            System.out.println("Cannot convert '" + strInvalid + "' to int.");
        }
    }
}
