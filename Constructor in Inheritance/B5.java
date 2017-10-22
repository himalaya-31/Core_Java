// Calling of constructor chaining and super() simultaneously

class B5 extends A5
{
	B5()
	{ this(5);
	  //super();		     //this will give error when i write this statement explicitly
	  
          System.out.println("B");
	}

	B5(int x)
	{
	  System.out.println(x);
	}
}

