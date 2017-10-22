//Constructor in Inheritance




class C4 extends B4
{
	C4()
	{		        
	  System.out.println("C");
	}

	C4(int x)		     	 //Parameterized Constructor
	{
          System.out.println(x);
	}

	public static void main(String... s)
	{
	  new C4();
          new C4(4);
	}
}