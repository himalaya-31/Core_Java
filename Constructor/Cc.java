//Constructor Chaining

class Cc
{
	Cc()
	{ 
          this(1);
	  System.out.println("Constructor Chaining ends");
	}

	Cc(int x)
        {
          this(2,3);
	  System.out.println(x);
        }

	Cc(int x, int y)
	{
	  System.out.println(x+y);
	}

	public static void main(String... s)
	{
          System.out.println("Constructor Chaining starts");
          new Cc();
	}
}