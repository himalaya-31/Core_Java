class B
{
	public static void main(String... s)
	{
		String s1 = "Himalaya";
		System.out.println(s1.length());		//displays length of string

		String s2 = new String("Himalaya");		// other way of defining a string

		if(s1 == s2)				//checking reference id are same or not
		{
			System.out.println("Reference ids are same");
		}
		else
		{
			System.out.println("Reference ids are not same");
		}
	}
}