//Instance Member Function
class Emp1
{
  String name;
  int salary;
  
  public void get(String n, int s)
  { 
    name = n;
    salary = s;
  }
  
  public void show()
  { 
    System.out.println(name);
    System.out.println(salary);
  }
  
  public static void main(String a[])
  {
    Emp1 e1 = new Emp1();
    get("Shivam",1000);                 //Causes Error 
    
  } 
}