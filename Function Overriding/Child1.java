//Function Overriding (Condition 2: by changing return type)



class Child1 extends Base1
{
	void show()
	{
	  System.out.println("Child");
	  super.show();			      // calls base class function
	}

	public static void main(String... s)
	{
	  Child1 c = new Child1();
	  c.show();			      // calls child class function
	}	
}

//this condition is neither function overriding nor function overloading
//this program will give ambiguity error