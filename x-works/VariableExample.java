public class VariableExample {

    // Static variables
    static String name = "StaticName";
    static int age = 25;
    static String city = "StaticCity";
    static boolean isStudent = true;
    static double score = 95.5;

    public static void main(String[] args) {

        // Local variables (same names as static variables)
        String name = "LocalName";
        int age = 20;
        String city = "LocalCity";
        boolean isStudent = false;
        double score = 88.0;

        // Printing local variables
        System.out.println("Local Variables:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);
        System.out.println("Is Student: " + isStudent);
        System.out.println("Score: " + score);

        // Printing static variables (using class name)
        System.out.println("\nStatic Variables:");
        System.out.println("Name: " + VariableExample.name);
        System.out.println("Age: " + VariableExample.age);
        System.out.println("City: " + VariableExample.city);
        System.out.println("Is Student: " + VariableExample.isStudent);
        System.out.println("Score: " + VariableExample.score);
    }
}
