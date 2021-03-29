package Example2;

public class Airplane {
	String airlineBrand = "American Airlines", ManuFac="Airbus", model="A321";
	int capacity=185;
	

	void printLanding() { 
		System.out.println("This airplane needs around 5450ft of distance for landing.");
	}
	
	void printFly() { 
		System.out.println("The maximum flying range of this airplane is 7400km.");
	}
	
	void printAccelerate() { 
		System.out.println("This airplane is able to accelerate until 876km/h.");
	}
	
	void printDecelerate() { 
		System.out.println("This airplane can decelerate until around 300km/h in the air.");
	}
	

}



