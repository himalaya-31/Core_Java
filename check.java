class Temp
{
	Demo x = new Demo();	
}

class Demo
{
	void show()
	{
	  System.out.println("Hello");
	}
}

class Temp2
{
  public static void main(String... s)
  {  
    Temp t = new Temp();
    t.x.show();
  }
}