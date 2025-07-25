class Variable
{
	  public static void main(String[] args)
	  {
		  addition();
		  addition(10,20);
	  }
  public static void addition()
  {
	  System.out.println("calling additon");
		  int a = 10;
	  byte b = 127;
	  int c = a + b;
	  System.out.println(c);
	  
  }
	public static void addition(int a , int b)  
	{
		System.out.println("calling addition no argument");
			int c = a + b;
			System.out.println(c);
	}
}