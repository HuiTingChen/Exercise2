package Example2;

public class Helicopter {
	String ManuFac="Boeing", model="CH-47 Chinook";
	int capacity = 55;
	

	void printLanding() { 
		System.out.println("This helicopter requires a sling length of at least 60 feet for landing.");
	}
	
	void printFly() { 
		System.out.println("The maximum flying range of this helicopter is 740.8km.");
	}
	
	void printAccelerate() { 
		System.out.println("This helicopter is able to accelerate until 302km/h.");
	}
	
	void printDecelerate() { 
		System.out.println("This helicopter can decelerate until around 240km/h in the air.");
	}
	
}
