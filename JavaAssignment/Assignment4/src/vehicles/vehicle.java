package vehicles;

public class vehicle {
	private int id;
	private int next_id = 0;
	private int wheels;
	private double cargo;
	private String color;
	
	public vehicle(int wheels, double cargo, String color) {
		this.id = next_id++;
		this.wheels = wheels;
		this.cargo = cargo;
		this.color = color;
	}
	
	public int getId() {
		return id;
	}
	
	public int getWheels() {
		return wheels;
	}
	
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	
	public double getCargo() {
		return cargo;
	}
	
	public void setCargo(int cargo) {
		this.cargo = cargo;
	}
	
	public String toString() {
		return "Vehicle[ wheels = " + this.wheels + ", cargo = " + this.cargo + "]";
	}

}
