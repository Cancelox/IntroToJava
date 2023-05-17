import java.io.*;
import java.util.ArrayList;
import java.util.List;

import vehicles.*;

/* your tasks:
 * create a class called VehicleException
 * createVehicle should throw a VehicleException
 * in main(), you should catch the VehicleException
 * 
 */
public class ReadVehicleFile {
	public static void typeInclueded(String name) {
		List<String> all = new ArrayList<String>();
		all.add("Motorcycle");
		all.add("Bicycle");
		all.add("Car");
		all.add("CargoBike");
		if(!all.contains(name))
			throw new VehicleException();
	}

	public static Vehicle createVehicle(String vehicleName) throws VehicleException{
		typeInclueded(vehicleName);
		switch(vehicleName) {
		case "Motorcycle":
			return new Motorcycle(null, null);
		case "Car":
			return new Car(0, 0, null);
		case "CargoBike":
			return new CargoCycle(0, 0, null);
		case "Bicycle":
			return new Bicycle(null);
		}
		/* if vehicleName is "Motorcycle" return Motorcycle();
		 * if vehicleName is "Car" return Car();
		 * if vehicleName is "Bicycle" return Bicycle();
		 * if vehicleName is "CargoCycle" return CargoCycle();
		 * if it is not any one of these, it should throw
		 * a VehicleException
		 */
		return null;
	}
	
	public static void main(String[] args) {
		ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>();
		
		/* create a loop to read the file line-by-line */
		
		try {
			FileReader f = new FileReader("numberfile.txt");
			BufferedReader in = new BufferedReader(f); 
			String inString = in.readLine(); 
			while(inString != null) {
				vehicleList.add(createVehicle(inString));
				inString = in.readLine(); 
			}
			
			//Vehicle vehicle = createVehicle(inString);
		} catch (VehicleException | IOException ve) {
			System.err.println("Cannot create Vehicle");
		}

		System.out.println(vehicleList);
		
	}
}
