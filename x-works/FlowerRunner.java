class FlowerRunner
{
public static void main(String[] args)
{
Flower flower = new Flower();
System.out.println(flower.getName());
flower.setName("jasmin");
String name = flower.getName();
System.out.println(name);
}
}