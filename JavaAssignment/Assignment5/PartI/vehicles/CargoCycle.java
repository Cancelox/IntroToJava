package vehicles;

public class CargoCycle extends Bicycle {
	public CargoCycle(int wheels, double cargo, String color) {
		super(wheels, cargo, color);
	}

	public String pedal() {
		return "pedaling";
	}
	
	public String toString() {
		return "cargocycles[ " + super.toString() + "]";
	}

}
