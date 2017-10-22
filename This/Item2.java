//using this (refernce variable)
class Item2
{
  int x = 1;
  
  void get(int x)
  {
    System.out.println(x);
    System.out.println(this.x);
  }
  
  public static void main(String... s)
  { 
    Item2 i = new Item2();
    i.get(2); 
  }
}