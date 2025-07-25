class BusRunner {
public static void main(String[] args)
{
System.out.println("busSeries" + Bus.busSeries);
System.out.println("busNumber" + Bus.busSeries);
System.out.println("numberOfPassenger " + Bus.numberOfPassenger);
System.out.println("mileage " + Bus.mileage);
System.out.println("bus price " + Bus.price);

int totalPrice;
totalPrice = Bus.getTotalPrice(5);
System.out.println("Total price of 8 buses is "+totalPrice);
int totalAmount = Bus.totalAmountInTrip();
System.out.println("totalAmount in a trip is" + totalAmount);
}
}
