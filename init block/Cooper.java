//init block

class Cooper 
{
	{						    //init block
	  System.out.println("This block is init block!");
	}

        Cooper()
	{
	  System.out.println("Default Constructor");
	}	
	
	Cooper(int x)
	{
	  System.out.println("Parameterized Constructor");
	}
	
	public static void main(String... s)
	{
	  new Cooper();
	  new Cooper(1);
	}
}