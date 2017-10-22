//Static Member Function
class Emp1
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
  }
  
  public static void companyName()   //Static Member Function
  {
    System.out.println(cName);
  }
  
  public static void main(String a[])
  {
    Emp1 e1 = new Emp1();
    e1.get("Shivam",1000);                 
    e1.show();
    companyName();  //can call the static member function directly   

    Emp1 e2 = new Emp1();
    e2.get("Puneet",1200);
    e2.show(); 
    Emp1.companyName(); //can call the static member function from the class name 
    
    System.out.println(cName);  //access the static data member directly
    System.out.println(Emp.cName); //access the static data member from the class name
 
    System.out.println(e1);
    System.out.println(e2); 
  } 
}