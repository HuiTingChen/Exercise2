package Example2;

public class Main {
	
	public static void main (String [] args) {
		
		Airplane a = new Airplane();
		System.out.println("Airline brand of the airplane: " + a.airlineBrand);
		System.out.println("Manufactured company: " + a.ManuFac);
		System.out.println("Model: " + a.model);
		System.out.println("Capacity: " + a.capacity + " passengers");
		a.printLanding();
		a.printFly(); 	
		a.printAccelerate();
		a.printDecelerate();
		System.out.println();	
		
		Helicopter h = new Helicopter();
		System.out.println("Manufactured company of the helicopter: " + h.ManuFac);
		System.out.println("Model: " + h.model);
		System.out.println("Capacity: " + h.capacity + " troops");
		h.printLanding();
		h.printFly(); 	
		h.printAccelerate();
		h.printDecelerate();
			
	}
}
