package vehicles;

public class cars extends vehicle{
	private int doors;
	
	public cars(int doors, double cargo, String color) {
		super(4, cargo, color);
		this.doors = doors;
	}
	
	public int getDoors() {
		return doors;
	}
	
	public void setDoors(int doors) {
		this.doors = doors;
	}
	
	public String PressGasPedal() {
		return "accelerating";
	}
	
	public String toString() {
		return "Cars[ " + super.toString() + ", doors = " + this.doors + "]";
	}
}
