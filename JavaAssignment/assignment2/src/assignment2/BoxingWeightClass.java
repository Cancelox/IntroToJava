package assignment2;

public class BoxingWeightClass {

	public static String findWeightClass(float weight) {
		// this is really only valid for weights greater than 0.
		if (weight <= 0) return "invalid weight";
		else if (weight <= 108) return "light flyweight";
		else if (weight <= 115) return "flyweight";
		else if (weight <= 123) return "bantamweight";
		else if (weight <= 132) return "lightweight";
		else if (weight <= 141) return "light welterweight";
		else if (weight <= 152) return "welterweight";
		else if (weight <= 165) return "middleweight";
		else if (weight <= 178) return "light heavyweight";
		else if (weight <= 201) return "heavyweight";
		else return "super heavyweight";
	}
	
	public static void main(String[] args) {
		
		/* you probably want to use user input for the
		 * income using Scanner because you will have to convert
		 * a command line argument to an float, and we haven't
		 * gotten to string parsing yet
		 * 
		 * But you can also just set the "weight" variable
		 * to whatever you want in the code, and that's fine too
		 */
		
		float weight = 20;
		String weightClass = findWeightClass(weight);
		
		// if the digits are greater than zero print this out:
		System.out.println("The weight class for the weight " + weight + " is " 
		+ weightClass);
		
	}
}