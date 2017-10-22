class B extends A
{
  void get()
  {
    System.out.println("Get");
  }

  public static void main(String... s)
  {
    B b = new B();
    b.get();
    b.show();
  }
}
