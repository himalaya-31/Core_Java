import java.util.Scanner;

class Format
{
	public static void main(String... s)
	{
		Scanner scan = new Scanner(System.in);

		String name = scan.next();
		int age = scan.nextInt();
		String city = scan.next();

		System.out.print("*-----------------------------------------------------------------------------------------------*");
		System.out.print("\n|												|");
		System.out.print("\n|												|");
		System.out.print("\n|												|");
		System.out.print("\n|												|");
		System.out.print("\n|												|");
		System.out.print("\n|												|");
		System.out.print("\n|												|");
		System.out.print("\n|								"+name+"			|");
		System.out.print("\n|								"+age+"				|");
		System.out.print("\n|								"+city+"				|");
		System.out.print("\n|												|");
		System.out.print("\n|												|");
		System.out.print("\n*-----------------------------------------------------------------------------------------------*");
	}
}