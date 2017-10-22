//Dynamic Binding
//Overriding data members



class Child2 extends Base2
{
	int x = 20;

	public static void main(String... s)
	{
	  Base2 b = new Child2();	       //Dynamic Binding or Upcasting
	  System.out.println(b.x);
	}
}

//output is 10 because data members cannot be ovverridden