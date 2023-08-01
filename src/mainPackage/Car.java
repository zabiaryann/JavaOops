package mainPackage;

public class Car {
	//Fields and attributes
	public String color;
	public int numberOfDoors;
	// constructor with no arguments
	public Car() {
		color = "White";
		numberOfDoors = 4;
	}
	// constructor with arguments
	public Car(String color, int numberOfDoors) {
		this.color         = color;
		this.numberOfDoors = numberOfDoors;
	}
	// constructor with a single argument
	public Car(String color) {
		this.color         = color;
		this.numberOfDoors = 4;
	}
	public void start()
    {
        System.out.println("Car starting");
    }
 
    public void stop()
    {
        System.out.println("Car stopping");
    }
 
    public void drive()
    {
        System.out.println("Car driving");
    }
	
}
