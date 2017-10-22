//string concatenation

class C
{
	public static void main(String... s)
	{
		String s1 = "Him" + 4;
		String s2 = 1 + 2 + 3 + "Hima" + 4 + "laya";

		System.out.println(s1);
		System.out.println(s2);

		String s3 = "Him";
		s3 = s3 + "alaya";

		System.out.println(s3);

		System.out.println("OSA".concat("HUB"));	//other way of concatenation
	}
}