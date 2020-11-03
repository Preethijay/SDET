
public class Car {

	String Color;
	String transmission;
	int make;
	int tyres;
	int doors;

	
	Car()	{
		tyres=4;
		doors=4;
}


public void displayCharacteristics()
{
	  
	  System.out.println("Make of the car is " + make);
	  System.out.println("Color of the car is " + Color);
	  System.out.println("Transmission of the car is " + transmission);
	  System.out.println("Tyres of the car is " + tyres);
	  System.out.println("Doors of the car is " + doors);
}
	
public void accelarate()
{

	 System.out.println("Car is moving forward.");
}


public void brake()
{
	  
	  System.out.println( "Car has stopped");
}

	
}
