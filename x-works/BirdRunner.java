class BirdRunner
{
public static void main(String[] args)
{
Bird bird = new Bird();
System.out.println(bird.getName());
bird.setName("sparrow");
String name = bird.getName();
System.out.println(name);


System.out.println("=============");
Bird bird1 = new Bird("sparrow");
System.out.println(bird1.getName());
bird.setAge(10);
int age = bird.getAge();
System.out.println(age);
}
}





//create a class with only one no arugement constructor and initialize instance variable in no argument consturctor
//print the values of instancevarible then chnge instance variable value using setmethod 
// print the values