//Constructor in Inheritance





class C2 extends B2
{
	C2()
	{
	  super();		        //this will give error
	  System.out.println("C");
	}

	public static void main(String... s)
	{
	  new C2();
	}
}