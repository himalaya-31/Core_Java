//init block execution in constructor chaining

class Cooper2
{
	{						    //init block 1
	  System.out.println("This block is init block!");
	}

	{						    //init block 2
	  System.out.println("This is another init block");
	}

        Cooper2()
	{
          this(1);
	  System.out.println("Default Constructor");
	}	
	
	Cooper2(int x)
	{
	  System.out.println("Parameterized Constructor");
	}
	
	public static void main(String... s)
	{
	  new Cooper2();
	}
}