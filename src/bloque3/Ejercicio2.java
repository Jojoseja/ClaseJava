package bloque3;
//iva entre 0.00 y 1.00
public class Ejercicio2 {
	static double calcularIVA(double imp, double iva) {
		if (iva > 1.00 || iva < 0.00 || imp < 0) {
			return -1;
		} else {
			return imp * (1 + iva);
		}
	}
	public static void main(String[] args) {
		double a = calcularIVA(1000,0.21);
		System.out.println("El precio final con IVA es de : " + a + " €");
	}
}
