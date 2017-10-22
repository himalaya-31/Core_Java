abstract class F 
{
	abstract void show();
}

abstract class G extends F
{
	void show()
	{
		System.out.println("Show");
	}

  	public static void main(String... s)
	{
		//F f = new G();	
		System.out.println("Run");
	}		
}

