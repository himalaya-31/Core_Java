//Interfaces

class B implements A
{
	public void show()
	{
		System.out.println("A");
	}

	public static void main(String... s)
	{
		B b = new B();
		b.show();
	}
}