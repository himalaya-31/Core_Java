//string compare

class D
{
	public static void main(String... s)
	{
		String s1 = "Same";
		String s2 = "Same";

		if(s1 == s2)
		{
			System.out.println("Strings are same");
		}

		System.out.println(s1.equals(s2));
		System.out.println("Himalaya".equals("himalaya"));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println("Himalaya".equalsIgnoreCase("hIMaLaya"));
		System.out.println(s1.compareTo(s2));
		System.out.println("sTring".compareTo("String"));
		System.out.println("Himalaya".compareTo("Puneet"));
		System.out.println("Shivam".compareTo("Himalaya"));
	}
}