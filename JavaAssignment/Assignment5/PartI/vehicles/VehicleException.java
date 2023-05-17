package vehicles;

import java.util.ArrayList;
import java.util.List;

public class VehicleException extends RuntimeException{  
	  public static void main(String[] args) {
	    try {
	      Car redCar = new Car(1, -1, "Red"); // test
	    }
	    catch (ArithmeticException ex) {
	      System.out.println(ex.toString());
	    }

	    System.out.println("Execution continues ...");
	  }

}
