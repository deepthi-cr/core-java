class Clock {

private String name;
private int cost;
private int second;
private int hours;
private int minutes;

public static int length;
static {
System.out.println("static block is clock");
}
{
System.out.println("non-static block is clock");
}
public static void main(String[] args){
}
public void setName(String clockName){
name = clockName;
}
public void setCost(int clockCost){
cost = clockCost;
}
public void setSecond(int clockSecond){
second = clockSecond;
}
public void setHours(int clockHours){
hours = clockHours;
}
public void setMinutes(int clockMinutes){
minutes = clockMinutes;
}
public String getName() {
return name;
}
public int getCost() {
return cost;
}
public int getSecond() {
return second;
}
public int getHours(){
return hours;
}
public int getMinutes(){
return minutes;
}
}
