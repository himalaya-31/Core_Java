//final local variables

class A
{
	public static void main(String... s)
	{
		final int x = 10;
		//x = x + 5;			//this will give error

		final A a = new A();
		//a = new A();			//this will give error
	}
}