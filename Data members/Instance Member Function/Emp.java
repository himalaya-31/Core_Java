//Instance Member Function
class Emp
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
    get("Shivam",1000);                 //Causes Error 
    
  } 
}