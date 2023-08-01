package mainPackage;

public class Main {

	public static void main(String[] args) {
		
		// Creating car objects using different constructors
        Car car1 = new Car(); // No-argument constructor
        Car car2 = new Car("Blue", 2); // Constructor with arguments
        Car car3 = new Car("Red"); // Constructor with a single argument

        System.out.println("Car 1 color: "+car1.color);
        System.out.println("Car 1 doors: "+car1.numberOfDoors);
        car1.drive();
        
        System.out.println("Car 2 color: "+car2.color);
        System.out.println("Car 2 color: "+car2.numberOfDoors);
        
        System.out.println("Car 3 color: "+car3.color);
        System.out.println("Car 3 number of doors: "+car3.numberOfDoors);
	}

}
