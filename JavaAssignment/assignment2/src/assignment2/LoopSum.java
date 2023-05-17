package assignment2;
import java.util.*;

public class LoopSum {

	public static long factorial(long number) {
		if(number <= 1) {
			return 1;
		}
		else return number*factorial(number-1);
	}
	
	public static void estimateExponential(int z) {
		double est = 0;
		int k = 0;
		long fac = factorial(z);
		
		while(Math.abs(Math.pow(Math.E, z)-est) > 0.001) {
			est += Math.pow(z, k)/fac;
			k += 1;
		}
		System.out.println("e^" + z + " is " + Math.pow(Math.E, z));
		System.out.println("result of " + k + " iterations is " + est);
		System.out.println("it requires " + k + " iterations to estimate e^" + z + " within .001");
	}
	
	public static void main(String[] args) {
		for(int z = 0; z <= 15; z++) {
			estimateExponential(2);
		}
				
	}
	
}
