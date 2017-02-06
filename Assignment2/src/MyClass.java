
public class MyClass {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.location = 0;
		System.out.println("Initial values:");
		System.out.println("Current gear: " + myCar.reportGear());
		System.out.println("Current location: " + myCar.reportLocation());
		System.out.println("Remaining miles to destination: " + myCar.reportRemaining());
		
		System.out.println("\nNow we make the car move for 6 hours. After this movement:");
		myCar.moveByTime(6); // myCar moves for 2 hours!!!
		System.out.println("Current location: " + myCar.reportLocation());
		System.out.println("Remaining miles to destination: " + myCar.reportRemaining());
		
		System.out.println("\nNow we change the gear and make the car move for 2 hours. After this movement:");
		myCar.gearUp();
		System.out.println("Current gear: " + myCar.reportGear());
		myCar.moveByTime(2); // myCar moves for 2 hours!!!
		System.out.println("Current location: " + myCar.reportLocation());
		System.out.println("Remaining miles to destination: " + myCar.reportRemaining());
		
		System.out.println("\nNow we change the gear to reverse and make the car move for 3 hours. After this movement:");
		myCar.reverseGear();
		System.out.println("Current gear: " + myCar.reportGear());
		myCar.moveByTime(3); // myCar moves back for 3 hour!!!
		System.out.println("Current location: " + myCar.reportLocation());
		System.out.println("Remaining miles to destination: " + myCar.reportRemaining());
		
		// here we check if the car has arrived to its destination
		System.out.println("Has myCar arrived? " + myCar.isArrived());
		
		System.out.println("\nNow we change the gear many time to test if the error messages work properly:");
		myCar.gearDown();
		System.out.println("Current gear: " + myCar.reportGear());
		myCar.gearUp();
		System.out.println("Current gear: " + myCar.reportGear());
		myCar.gearUp();
		System.out.println("Current gear: " + myCar.reportGear());
		myCar.gearUp();
		System.out.println("Current gear: " + myCar.reportGear());
		myCar.gearUp();
		System.out.println("Current gear: " + myCar.reportGear());
		myCar.gearUp();
		System.out.println("Current gear: " + myCar.reportGear());
		myCar.gearUp();
		System.out.println("Current gear: " + myCar.reportGear());
		myCar.gearUp();
		System.out.println("Current gear: " + myCar.reportGear());
		myCar.gearDown();
		System.out.println("Current gear: " + myCar.reportGear());
		
		System.out.println("\nNow we make sure that he error messages for non-positive time works properly:");
		myCar.moveByTime(-5);
		
	}

}