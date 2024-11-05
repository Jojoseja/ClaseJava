package bloque3;
//iva entre 0.00 y 1.00
public class Ejercicio2 {
	static double calcularIVA(double imp, double iva) {
		double result;
		if (iva > 1.00 || iva < 0.00) {
			result = -1;
		} else {
			result = imp * (1 + iva);
		} return result;
	}
	public static void main(String[] args) {
		double a = calcularIVA(20,0.2);
		System.out.println(a);
	}
}
