//Function Overriding (Condition 5: by changing access modifier)



class Child4ii extends Base4ii
{
	void show()
	{
	  System.out.println("Child");
	  super.show();			      // calls base class function
	}

	public static void main(String... s)
	{
	  Child4ii c = new Child4ii();
	  c.show();			      // calls child class function
	}	
}

