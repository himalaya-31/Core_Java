class Temp4{
	static{
		System.out.println("Static Block");
	}

	static int i;

	public static void main(String... s){
		System.out.println("main");
		System.out.println(i);
	}
}