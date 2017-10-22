//multilevel inheritance 


class I extends H
{
	int x = 20;

	void show()
	{
	  System.out.println(x);
	  System.out.println(super.x);
          System.out.println(((G)this).x);            //type casting
	}

	public static void main(String... s)
	{
	  I i = new I();
	  i.show();
        }
}