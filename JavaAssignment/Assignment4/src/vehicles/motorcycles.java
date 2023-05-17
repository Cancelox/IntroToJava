package vehicles;

public class motorcycles extends vehicle{
	private String accessories;
	
	public motorcycles(String accessories, String color) {
		super(2, 0, color);
		this.accessories = accessories;
	}
	
	public String getAccessories() {
		return accessories;
	}
	
	public void setAccessories(String accessories) {
		this.accessories = accessories;
	}
	
	public String twistThrottle() {
		return "accelerating";
	}
	
	public String toString() {
		return "Motorcycles[ " + super.toString() + ", accessories = " + this.accessories + "]";
	}
}
