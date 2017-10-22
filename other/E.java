class E
{
	int x = 20;
	final void show()
	{	
		int y = 10;
		y = y + 2;
		x = x + 1;
		System.out.println(x);
		System.out.println(y);
	}

	public static void main(String... s)
	{
		E e = new E();
		e.show();
	}
}