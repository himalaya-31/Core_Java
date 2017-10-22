//Interfaces

class B1 implements A,A1
{
	public void show()
	{
		System.out.println("A");
	}

	public void show1()
	{
		System.out.println("B");
	}

	public static void main(String... s)
	{
		A a = new B1();
		A1 a1 = new B1();
		a.show();
		a1.show1();
	}
}