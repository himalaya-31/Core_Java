//Function Overriding (Condition 4: access specifier)


class Child3i extends Base3i
{
	public void show()
	{
	  System.out.println("Child");
	  super.show();			      // calls base class function
	}

	public static void main(String... s)
	{
	  Child3i c = new Child3i();
	  c.show();			      // calls child class function
	}	
}
