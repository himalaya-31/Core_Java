//Interfaces
//one interface extends multiple interfaces

class B4 implements A4
{
	public void show()
	{
		System.out.println("A");
	}

	public void show1()
	{
		System.out.println("A1");
	}

	public void show2()
	{
		System.out.println("A4");
	}

	public static void main(String... s)
	{
		A4 a4 = new B4();
		a4.show();
		a4.show1();
		a4.show2();
	}
}