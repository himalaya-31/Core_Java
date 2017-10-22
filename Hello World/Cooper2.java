//multiple main function in a class
class Cooper2
{
  public static void main(String a[])
  {
    System.out.println("Hello World!");
    main(5);
  }
  public static void main(int b)
  {
    System.out.println("Hello this is another main function!");
  }
}
