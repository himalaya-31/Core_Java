class Temp
{
	static int x;
	
	static
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