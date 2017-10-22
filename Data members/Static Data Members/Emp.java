//Static Data Member
class Emp
{
  String name;
  int salary;
  static String cName = "Infosys";
  
  public void get(String n, int s)
  { 
    name = n;
    salary = s;
  }
  
  public void show()
  { 
    System.out.println(name);
    System.out.println(salary);
    System.out.println(cName);
  }
  
  public static void main(String a[])
  {
    Emp e1 = new Emp();
    e1.get("Shivam",1000);                 
    e1.show();

    Emp e2 = new Emp();
    e2.get("Puneet",1200);
    e2.show(); 

    System.out.println(cName);  //access the static data member directly
    System.out.println(Emp.cName); //access the static data member from the class name
  } 
}