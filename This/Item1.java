//using this as a object
class Item1
{
  int x = 1;
  
  void get(int y,Cooper this)     //causes error beacuse "this" is defined already by the compiler
  {
    System.out.println(y);
    System.out.println(this.x);
  }
  
  public static void main(String... s)
  { 
    Item1 i = new Item1();
    i.get(2,i); 
  }
}