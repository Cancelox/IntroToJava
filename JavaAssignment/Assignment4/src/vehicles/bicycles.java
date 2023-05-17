package vehicles;

public class bicycles extends vehicle{
	public bicycles(String color) {
		super(2, 0.0, color);
	}

	public String pedal() {
		return "pedaling";
	}
	
	public String toString() {
		return "bicycles[ " + super.toString() + "]";
	}

}
