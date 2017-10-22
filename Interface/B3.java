//Interfaces
//two interfaces having same function name

class B3 implements A,A3
{
	public void show()
	{
		System.out.println("A or B");
	}

	public static void main(String... s)
	{
		A a = new B3();
		A3 a3 = new B3();
		a.show();
		a3.show();
	}
}