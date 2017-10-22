import java.util.Scanner;

class Test
{
	public static void main(String... s)
	{
	  Scanner scan = new Scanner(System.in);
	  System.out.println("Enter a number");
	  int i = scan.nextInt();
	  System.out.print(i);
	  System.out.print("\n");                //new line
	  System.out.print(i);
          System.out.print("\t");		 //tab
          System.out.println(i);
          System.out.println("\"");	  //display double quotes
	}
}