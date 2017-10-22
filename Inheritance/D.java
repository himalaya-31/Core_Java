//single inheritance ( super concept)



class D extends C
{
	int x = 20;

	void show()
	{
	  System.out.println(x);
	  System.out.println(super.x);
	}

	public static void main(String... s)
	{
	  D d = new D();
	  d.show();
	}
}