//Dynamic Binding



class Child extends Base
{
	void show()
	{
	  System.out.println("Child");
	}

	public static void main(String... s)
	{
	  Base b = new Child();		       //Dynamic Binding or Upcasting
	  b.show();	 	    	       //calls child class function
	}
}