//Traversing of array

class B
{
	public static void main(String... s)
	{
		int x[] = {1,2,3,4,5};
		char y[] = {'6','7','8'};
		
		System.out.println(x.length);
		System.out.println(y.length);

		for(int i = 0; i < x.length; i++)
		{
			System.out.println(x[i]);
		}

		for(int i = 0; i < y.length; i++)
		{
			System.out.println(y[i]);
		}
	}
}