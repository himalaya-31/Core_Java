//Abstract class

class Coop1 extends Cooper1
{
	void show()
	{
	  System.out.println(x);
	  System.out.println(y);
	  System.out.println(super.x);
 	  System.out.println(super.y);
	  
	}

	
	void show1()
	{
	  System.out.println(x);
	  System.out.println(y);
	}

	public static void main(String... s)
	{
	  Coop1 c = new Coop1();
	  c.show();
	  c.get(5,4);
	  c.show1();
	}
}