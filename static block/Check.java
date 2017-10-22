//class without main function

class Check
{
	static int x;
	{
	  try
	  {
	    x = System.in.read();
	  }
	  catch(Exception e)
	  {
	  }
	}
}

//it will compile successfully but it will give error at runtime