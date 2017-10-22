//Function Overriding (Condition 5: by changing access modifier)



class Child4 extends Base4
{
	void show()
	{
	  System.out.println("Child");
	  super.show();			      // calls base class function
	}

	public static void main(String... s)
	{
	  Child4 c = new Child4();
	  c.show();			      // calls child class function
	}	
}

//this will give error
