class Laptop{
String name;
float price;
int storage;
String features;
public Laptop(){
}
public static void main(String[] args) {
Laptop laptop = new Laptop();
laptop.name = "Lenovo";
System.out.println(laptop.name);
laptop.setName("HP");
System.out.println(laptop.name);
Laptop laptop1=new Laptop();
laptop1.setName("Dell");
System.out.println(laptop1.name);
System.out.println(laptop.name);
}
public void setName(String laptopName){
	{
		name = laptopName;
	}
}
}
