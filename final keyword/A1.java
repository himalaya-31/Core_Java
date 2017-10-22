//final local variables

class A1
{
	final static int x = 10;
	final int y;

	A1()
	{
		y = 20;
	}
	
	public static void main(String... s)
	{
		A1 a1 = new A1();
		System.out.println(x);
		System.out.println(a1.y);
	}
}