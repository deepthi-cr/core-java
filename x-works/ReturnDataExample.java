public class ReturnDataExample {

    // Method returning an int
    public int returnData() {
        return 10;
    }

    // Method returning a float
    public float returnDataFloat() {
        return 10.5f;
    }

    // Method returning a double
    public double returnDataDouble() {
        return 99.99;
    }

    // Method returning a character
    public char returnDataChar() {
        return 'A';
    }

    // Method returning a String
    public String returnDataString() {
        return "Hello";
    }

    // Method returning a boolean
    public boolean returnDataBoolean() {
        return true;
    }

    // Method returning a long
    public long returnDataLong() {
        return 123456789L;
    }

    // Method returning nothing (void)
    public void returnDataVoid() {
        System.out.println("This method returns nothing.");
    }

    public static void main(String[] args) {
        ReturnDataExample obj = new ReturnDataExample();
        System.out.println("Int: " + obj.returnData());
        System.out.println("Float: " + obj.returnDataFloat());
        System.out.println("Double: " + obj.returnDataDouble());
        System.out.println("Char: " + obj.returnDataChar());
        System.out.println("String: " + obj.returnDataString());
        System.out.println("Boolean: " + obj.returnDataBoolean());
        System.out.println("Long: " + obj.returnDataLong());
        obj.returnDataVoid();
    }
}
