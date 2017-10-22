//Function Overriding (Condition 3: by changing return type(class type))



class Child2 extends Base2
{
	B show()
	{
	  System.out.println("Child");
	  super.show();			      // calls base class function
	  return new B();
	}

	public static void main(String... s)
	{
	  Child2 c = new Child2();
	  c.show();			      // calls child class function
	}	
}