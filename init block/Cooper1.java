//multiple init block

class Cooper1
{
	{						    //init block 1
	  System.out.println("This block is init block!");
	}

	{						    //init block 2
	  System.out.println("This is another init block");
	}

        Cooper1()
	{
	  System.out.println("Default Constructor");
	}	
	
	Cooper1(int x)
	{
	  System.out.println("Parameterized Constructor");
	}
	
	public static void main(String... s)
	{
	  new Cooper1();
	  new Cooper1(1);
	}
}