public class Car 
{
  String brand;
  int year;
  
  static String type;

    static 
	{
        type = "Vehicle";
        System.out.println("Static Block Executed");
    }

    {
        brand = "Toyota";
        year = 2023;
        System.out.println("Non-Static Block Executed");
    }
	
    public Car() {
        System.out.println("No-Argument Constructor Called");
    }

    public void displayInfo() 
	{
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
        System.out.println("Type: " + type);
    }

    public static void main(String[] args) 
	{
        Car car1 = new Car(); 
        car1.displayInfo(); 
    }
}
