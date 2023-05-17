package vehicles;

public class Bicycle extends Vehicle{
	public Bicycle(String color) {
		super(2, 0.0, color);
	}
	
	public Bicycle(int wheels, double cargo, String color) {
		super(wheels, cargo, color);
	}

	public String pedal() {
		return "pedaling";
	}
	
	public String toString() {
		return "bicycles[ " + super.toString() + "]";
	}

}

