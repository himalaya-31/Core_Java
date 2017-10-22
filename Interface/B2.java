//Interfaces
//one interface extends another interface

class B2 implements A2
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
		A2 a2 = new B2();
		a2.show();
		a2.show1();
	}
}