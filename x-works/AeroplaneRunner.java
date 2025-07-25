class AeroplaneRunner {
	{
System.out.println("static block in AeroplaneRunner");
}
public static void main(String[] args)
{
	
Aeroplane aeroplane = new Aeroplane();

aeroplane.setName("Indigo");
System.out.println(aeroplane.getName());

aeroplane.food = "noodles";
System.out.println(aeroplane.food);
}
}