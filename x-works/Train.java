class Train
{

private String  name;
private int cost;
private int speed;


public static int length;
static{
System.out.println("Static block in Train");
length = 100;
}
{
System.out.println("non-Static block in Train");
length = 200;
}
public void setName(String trainName) {
name = trainName;
}

public String getName(){
return name;
}
public void setCost(int trainCost) {
cost = trainCost;
}
public int getCost(){
return cost;
}
 public void setSpeed(int trainSpeed){
 speed = trainSpeed;
 }
 public int getSpeed(){
	 return speed;
 }
}
 