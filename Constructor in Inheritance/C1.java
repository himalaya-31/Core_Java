//Constructor in Inheritance




class C1 extends B1
{
	C1()
	{
	  super();		        //implicitly called
	  System.out.println("C");
	}

	public static void main(String... s)
	{
	  new C1();
	}
}