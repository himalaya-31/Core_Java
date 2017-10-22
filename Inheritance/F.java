//single inheritance ( super concept)



class F extends E
{
	int x = 20;

	void show()
	{
	  System.out.println(x);
	  System.out.println(super.x);
	}

	public static void main(String... s)
	{
	  F f = new F();
	  f.show();
          System.out.println(super);			//Causes Error
	}
}