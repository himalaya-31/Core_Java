//Function Overriding (Condition 4: access specifier)



class Child3ii extends Base3ii
{
	public void show()
	{
	  System.out.println("Child");
	  super.show();			      // calls base class function
	}

	public static void main(String... s)
	{
	  Child3ii c = new Child3ii();
	  c.show();			      // calls child class function
	}	
}

