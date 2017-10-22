//Function Overriding (Condition 4: access specifier)


class Child3 extends Base3
{
	protected void show()
	{
	  System.out.println("Child");
	  super.show();			      // calls base class function
	}

	public static void main(String... s)
	{
	  Child3 c = new Child3();
	  c.show();			      // calls child class function
	}	
}

//this program will give error