//Function overloading by changing the number of arguments

class Flash
{
  void show()
  {
    int a = 10;
    System.out.println(a);
  }
  void show(int x)
  {
    System.out.println(x);
  }
  void show(int x, int y)
  {
    System.out.println(x);
    System.out.println(y);
  }
  void show(int x, int y, int z)
  {
    System.out.println(x);
    System.out.println(y);
    System.out.println(z);
  }  

  public static void main(String... s)
  {
    Flash f = new Flash();
    f.show();
    f.show(1);
    f.show(1,2);
    f.show(1,2,3);
  }
}