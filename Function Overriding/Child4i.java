//Function Overriding (Condition 5: by changing access modifier)


class Child4i extends Base4i
{
	static void show()
	{
	  System.out.println("Child");
	  super.show();			      // calls base class function
	}

	public static void main(String... s)
	{
	  Child4i c = new Child4i();
	  c.show();			      // calls child class function
	}	
}

//this will give error
