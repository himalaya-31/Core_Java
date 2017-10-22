//Dynamic Binding



class Child1 extends Base1
{
	void show()
	{
	  System.out.println("Child");
	}

	void display()
	{
	  System.out.println("Display");
	}

	public static void main(String... s)
	{
	  Base1 b = new Child1();		       //Dynamic Binding or Upcasting
	  b.show();	 	    	       //calls child class function
	  b.display();			       //this will give error
	}
}