import java.util.Scanner;

class Largest
{
	void largest(int a, int b, int c)
	{
		if(a>b && a>c)
		{
			System.out.println("Largest number is " + a);
		}

		else if(b>a && b>c)
		{
			System.out.println("Largest number is " + b);
		}

		else
		{
			System.out.println("Largest number is " + c);
		}
	}

	public static void main(String... s)
	{
		Scanner scan  = new Scanner(System.in);

		System.out.print("Enter First Number: ");
		int x = scan.nextInt();

		System.out.print("Enter Second Number: ");
		int y = scan.nextInt();

		System.out.print("Enter Third Number: ");
		int z = scan.nextInt();

		Largest l = new Largest();
		l.largest(x,y,z);
	}
}