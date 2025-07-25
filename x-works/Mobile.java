class Mobile{
String name;
float price;
int storage;
String features;
public Mobile(){
}
public static void main(String[] args) {
Mobile mobile = new Mobile();
mobile.name = "apple";
System.out.println(mobile.name);
mobile.setName("vivo");
System.out.println(mobile.name);
Mobile mobile1=new Mobile();
mobile1.setName("oneplus");
System.out.println(mobile1.name);
System.out.println(mobile.name);
}
public void setName(String mobileName){
	{
		name = mobileName;
	}
}
}