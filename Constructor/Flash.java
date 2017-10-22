//Default and Parameterized Constructor

class Flash
{
	int x = 10;
	int y = 20;

	Flash()					//Default Constructor
	{ 
 	  System.out.println(x);
	  System.out.println(y);
	}
	
	Flash(int x, int y)			//Parameterized Constructor
        { 
          this.x = x;
	  this.y = y;
          System.out.println(this.x);
	  System.out.println(this.y);
	}

	Flash(Flash g)			//Parameterized or Copy Constructor
	{ 
          x = g.x;
          y = g.y;
          System.out.println(x);
          System.out.println(y);	  
	}

	void Flash()
	{
          System.out.println("This is the member function of the class not a constructor");
        } 

	public static void main(String... s)
	{
          new Flash();        		//Calling of Default Constructor
          Flash f = new Flash(30,40);   //Calling of Parameterized Constructor
          new Flash(f);                 //Calling of Copy Contructor
          new Flash().Flash();       //Calling of Default Contructor as well as Member Function of the class
	}
}