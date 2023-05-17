package assignment2;

public class WireCapacitance {

	public static double calculateWireCapacitance(double l, double a, double d0, double d1) {
		double absolutePermittivity = 8.85E-12;
		double cInitial = (Math.PI*absolutePermittivity*l) / (Math.log(d0/(2*a)+Math.sqrt(d0*d0/(4*a*a)-1)));
		double cFinal = (Math.PI*absolutePermittivity*l) / (Math.log(d1/(2*a)+Math.sqrt(d1*d1/(4*a*a)-1)));
		return cFinal - cInitial;
	}
	
	public static void main(String[] args) {
		double Cd = calculateWireCapacitance(0.5, .002053, .01, .005);
		System.out.println("answer is " + Cd);
		
	}
}
