//Class and Local Variable 
class Variable
{  static int i;               //Class Variable
   public static void display()
   { 
     int b;                    //Local Variable
     b = 5;
     System.out.print("The value of class variable is ");
     System.out.println(i);
     System.out.print("The value of local variable is ");
     System.out.println(b);
   }
   public static void main(String... a)
  { display();
  }
}