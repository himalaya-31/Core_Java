//Function Overriding (Condition 5: by changing access modifier)
//in this both the functions of parent and child class are static this concept is known as Function Hiding.


class Child4iii extends Base4iii
{
	static void show()
	{
	  System.out.println("Child");
	  
	}

	public static void main(String... s)
	{
	  Child4iii c = new Child4iii();
	  c.show();			      // calls child class function
	}	
}

