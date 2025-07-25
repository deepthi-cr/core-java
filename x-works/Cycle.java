class Cycle
{
 static String name;
 static String color;
 static int speed =30;
 static boolean stock;
 public static void main(String[] args){
 System.out.println("name" + name);
 name = "Hero";
 
 System.out.println("name" + name);

 
 System.out.println(color);
 System.out.println("color" + color);
 color = "black";
 
 System.out.println("color" + color);

 System.out.println(speed);

 drive();
 Cycle.drive();
 
 System.out.println(Cycle.name);
 System.out.println(stock);
 }
 public static void drive(){
 System.out.println("The" + name + "Cycle" + "is driving with a " + speed + "km");
 }
 }
 
 