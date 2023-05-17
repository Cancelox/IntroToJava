
public class SquarePyramid {
	private int nextId;
	private int id;
	private double side;
	private double height;
	
	public SquarePyramid() {
		
	}
	
	public SquarePyramid(double s, double h) {
		id = ++nextId;
		side = s;
		height = h;
	}
	
	public double getSide() {
		return side;
	}
	
	public void setSide(double s) {
		side = s;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double h) {
		height = h;
	}
	
	public double getVolume() {
		return side*side*height/3;
	}
	
	public double getSurfaceArea() {
		return side*side + 2*side*Math.sqrt(side*side/4 + height*height);
	}

	public int getID() {
		return id;
	}
}
