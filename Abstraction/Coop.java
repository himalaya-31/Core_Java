//Abstract class

class Coop extends Cooper
{
	void show()
	{
	  System.out.println(x);
	  System.out.println(y);
	}

	public static void main(String... s)
	{
	  Coop c = new Coop();
  	  c.get(5,4);
	  c.show();
	}
}