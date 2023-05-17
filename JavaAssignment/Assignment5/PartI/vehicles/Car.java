package vehicles;

public class Car extends Vehicle {
private int doors;
	
	public Car(int doors, double cargo, String color) throws ArithmeticException {
		super(doors, cargo, color);
		if (doors < 2)
			throw new ArithmeticException("Car's doors must be more than 2");
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
