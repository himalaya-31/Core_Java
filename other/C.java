abstract class A
{
	abstract static void show();
}

class B extends A
{
	static void show()
	{
		System.out.println("show");
	}

	public static void main(String... s)
	{
		A a = new B();
		a.show();
	}
}