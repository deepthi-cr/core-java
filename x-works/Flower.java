class Flower
{
private String name;
private int age;

public Flower()
{
System.out.println("no argument constuctor/ default constructor");
this.name = "rose";
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