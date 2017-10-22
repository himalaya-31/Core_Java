//Instance Member Function
class Emp2
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
    Emp2 e1 = new Emp2();
    e1.get("Shivam",1000);                 
    e1.show();

    Emp2 e2 = new Emp2();
    e2.get("Puneet",1200);
    e2.show(); 
  } 
}