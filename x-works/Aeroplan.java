class Aeroplane
{

private String  name;
private int cost;
private int speed;

public Static String food;
static {
System.out.println("aeroplane Static variable");
food = "chicken";
}

{
	System.out.println("aeroplane non-Static variable");
food = "kabab";
}
	
	
public void setName(String aeroplaneName) {
name = aeroplaneName;
}

public String getName(){
return name;
}
public void setCost(int aeroplaneCost) {
cost = aeroplaneCost;
}
public int getCost(){
return cost;
}
 public void setSpeed(int aeroplaneSpeed){
 speed = aeroplaneSpeed;
 }
 public int getSpeed(){
	 return speed;
 }
}
 