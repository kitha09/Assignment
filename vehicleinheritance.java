import java.util.*;
class Vehicle
{
	String engine;
	public Vehicle(String engine)
	{
		this.engine=engine;
	}
	public void method()
	{
		
	}
}

class Four_Wheeler extends Vehicle
{
	Four_Wheeler(String engine)
	{
		super(engine);
		
		
	}
	String type_of_vehicle="FOUR WHEELER";
	int noOfWheels=4;
	
	public void display()
	{
		System.out.println(noOfWheels);
		System.out.println(engine);
		
	}
	
}

class Car extends Four_Wheeler
{
	String name_of_car;
	
	public Car(String name_of_car,String engine)
	{
		super(engine);
		
		this.name_of_car=name_of_car;
		
	}
	public void display()
	{
		System.out.println("The no of wheels in car is " +noOfWheels);
		System.out.println("The engine type of the car is " +engine);
		System.out.println("The name of the car is "+name_of_car);
		
	}
	
	
}

public class vehicleinheritance
{
	public static void main(String args[])
	{
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the name of the car");
		String name_of_car=sc.nextLine();
		
		System.out.println("Enter the engine type");
		
		String Engine=sc.nextLine();
		
		Car obj1=new Car(name_of_car,Engine);
		obj1.display();
		
		
		
		
		
		
		
	}
	
}