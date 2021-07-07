import java.util.Scanner;
#comment 
class Employee
{
   int id;
   String name;
   float basic_sal;

   public Employee()
   {
      id=0;
      basic_sal=0.0f;

   }

   public Employee(int id,String name,float basic_sal)
   {
      this.id=id;
      this.name=name;
      this.basic_sal=basic_sal;
   }
   public void compute()
   {
      float gross=(.1f)*basic_sal+(.15f)*basic_sal;
      System.out.println("The Gross salary is "+ gross);
   }


   public void display()
   {
      System.out.println("The id of Employee is " + id);
      System.out.println("The name of Employee is " + name);
      System.out.println("the Basic Salary of Employee is "+ basic_sal);
   }


}


public class Employee
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the id");
      int id=sc.nextInt();

      sc.nextLine();

      System.out.println("Enter the name");
      String name=sc.nextLine();

      System.out.println("Enter the basic salary");
      float basic_sal=sc.nextFloat();


      Employee obj1=new Employee(id,name,basic_sal);
      obj1.display();
      obj1.compute();

      Employee obj2=new Employee(id,name,basic_sal);
      obj2.display();
      obj2.compute();
      


   }



}