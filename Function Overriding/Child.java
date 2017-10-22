//Function Overriding (Condition 1)



class Child extends Base
{
	void show()
	{
	  System.out.println("Child");
	  super.show();			      // calls base class function
	}

	public static void main(String... s)
	{
	  Child c = new Child();
	  c.show();			      // calls child class function
	}	
}
