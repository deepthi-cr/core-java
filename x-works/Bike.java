class Bike 
{
static String name = "RX";
static float price = 1000.29f;
static float milage = 2000.20f;
static String color = "black";
static String company ="yahama";

public static void main(String[] args){
String bikeName = nameOfBike();
System.out.println(bikeName);

float bikePrice = priceOfBike();
System.out.println(bikePrice);

float bikeMilage = milageOfBike();
System.out.println(bikeMilage);

String bikeColor = colorOfBike();
System.out.println(bikeColor);

String bikeCompany = companyOfBike();
System.out.println(bikeCompany);
}
public static String nameOfBike(){
return name;
}
public static float priceOfBike(){
return price;
}

public static float milageOfBike(){
return milage;
}

public static String colorOfBike(){
return color;
}
public static String companyOfBike(){
return company;
}

}






//1. main method check you can string to other datatype
//2.declare method return data with different datatype
//3. create 5 different class, each class having 
//static variables and print static variables 
//by calling method