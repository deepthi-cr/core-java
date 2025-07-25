class Bird
{
private String name;
private int age;

public Bird()
{
System.out.println("no argument constuctor/ default constructor");
this.name = "pegion";
}

public Bird(String name)
{
System.out.println("paramterized constructor of one paramter");
this.name = name;
}
public Bird(String name, int age) { 
System.out.println("paramterized constructor of two paramter");
this.name = name;
this.age = age;
}

 public void setName(String name) 
 {
  this.name = name;
}

public String getName()
{
return name;
}
public void setAge(int age)
{
	this.age = age;
}
public int getAge()
{
	return age;
}
}
