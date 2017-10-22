class Ascii
{
	public static void main(String... s)
	{
	  char a = 1;
          int x = 1;

	  for(int i = 1; i<=40; i++)
	  {
	    for(int j = 1; j<=5; j++)
	    {
 	      System.out.print("Ascii code " + x++ + "->" + a);
	      a++;
	      System.out.print("\t");
	    }
	   System.out.print("\n");
	  }
	}
}