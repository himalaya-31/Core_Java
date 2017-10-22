import java.util.Scanner;

class Operators
{
	public static void main(String... s)
	{
	  Scanner scan = new Scanner(System.in);
          
 	  System.out.print("Enter First Number: ");
	  int x = scan.nextInt();
	  
	  System.out.print("\nEnter Second Number: ");
	  int y = scan.nextInt();

	  System.out.println("\nUsing plus operator:");
	  System.out.print("x + y = ");
          System.out.println(x+y);

	  System.out.println("\nUsing minus operator:");
	  System.out.print("x - y = ");
	  System.out.println(x-y);

	  System.out.println("\nUsing slash operator:");
	  System.out.print("x / y = ");
	  System.out.println(x/y);

	  System.out.println("\nUsing asterisk operator:");
	  System.out.print("x * y = ");
	  System.out.println(x*y);

	  System.out.println("\nUsing percent operator:");
	  System.out.print("x % y = ");
	  System.out.println(x%y);

	  System.out.println("\nUsing less than operator");
	  if(x < y)
	  {
	    System.out.println(x + " is less than " + y);
	  }
	  else
	  {
	    System.out.println(y + " is less than " + x);
	  }

	  System.out.println("\nUsing greater than operator");
	  if(x > y)
	  {
	    System.out.println(x + " is greater than " + y);
	  }
	  else
	  {
	    System.out.println(y + " is greater than " + x);
	  }

	  System.out.println("\nUsing less than or equal operator");
	  if(x <= y)
	  {
	    System.out.println(x + " is less than or equal to " + y);
	  }
	  else
	  {
	    System.out.println(y + " is less than or equal to " + x);
	  }

	  System.out.println("\nUsing greater than or equal operator");
	  if(x >= y)
	  {
	    System.out.println(x + " is greater than or equal to " + y);
	  }
	  else
	  {
	    System.out.println(y + " is greater than or equal to " + x);
	  }
	}
}