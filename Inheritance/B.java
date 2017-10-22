//single inheritance



class B extends A
{
	void get(int x, int y)
	{
	  this.x = x;
	  this.y = y;
	}

	public static void main(String... s)
	{
	  B b = new B();
	  b.get(10,20);
	  b.show();
	}
}