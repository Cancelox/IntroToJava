package vehicles;

public class cargocycles extends vehicle{
	public cargocycles(int wheels, double cargo, String color) {
		super(wheels, cargo, color);
	}

	public String pedal() {
		return "pedaling";
	}
	
	public String toString() {
		return "cargocycles[ " + super.toString() + "]";
	}

}
