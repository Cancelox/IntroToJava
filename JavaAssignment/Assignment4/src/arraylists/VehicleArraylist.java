package arraylists;
import java.util.ArrayList;
import java.util.Iterator;

import vehicles.*;

public class VehicleArraylist {

	public static void main(String[] args) {
		// PartII a
		// this ArrayList MUST be parameterized
		ArrayList<vehicle> vehiclesArrayList = new ArrayList<vehicle>();
		
		// this is the variable you should retain to compare
		// to the other objects in the arraylist
		motorcycles redMotor = new motorcycles("grip warmers, usb charger", "red");
		vehiclesArrayList.add(redMotor);
		cars blueCar = new cars(4, 20, "blue");
		vehiclesArrayList.add(blueCar);
		bicycles blackBike = new bicycles("black");
		vehiclesArrayList.add(blackBike);
		cargocycles greenCargo1 = new cargocycles(3, 10, "green");
		vehiclesArrayList.add(greenCargo1);
		cargocycles greenCargo2 = new cargocycles(3, 10, "green");
		vehiclesArrayList.add(greenCargo2);
		cars grayCar = new cars(2, 10, "gray");
		vehiclesArrayList.add(grayCar);
		cars whiteCar = new cars(4, 25, "while");
		vehiclesArrayList.add(whiteCar);
		
		// PartII b
		double cargoSpace = 0;
		// compute the sum and then divide 
		for(int i = 0; i < vehiclesArrayList.size(); i++) {
			cargoSpace += vehiclesArrayList.get(i).getCargo();
		}
		System.out.println("Average cargo space is " + cargoSpace/vehiclesArrayList.size());
		
		//PartII c
		cars reference = new cars(4, 20, "blue");
		for(Iterator<vehicle> it = vehiclesArrayList.iterator(); it.hasNext();) {
			if(it.toString().contentEquals(reference.toString())) 
				// if object has same toString() content as reference, they are the same [toString() does not includes ID]
				it.remove();
		}
	}

}
