class Item 
{
  int x = 1;
  
  void get(int y)
  {
    System.out.println(y);
    System.out.println(x);
  }
  
  public static void main(String... s)
  { 
    Item i = new Item();
    i.get(2); 
  }
}