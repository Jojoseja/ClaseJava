package bloque3;

public class Ejercicio1 {
	static double divisionEntera(double num1, double num2) {
		double result;
		if (num2 == 0) {
			result = 0;
		} else {
			result = num1/num2;
		} return result;
	}
	public static void main(String[] args) {
		double a = divisionEntera(13, 0);
		System.out.println(a);
	}

}
