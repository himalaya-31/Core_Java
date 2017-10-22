//Instance Data Member
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
    new Emp();                          //Allocates Memory
    new Emp().get("Shivam",1000);
    
  } 
}