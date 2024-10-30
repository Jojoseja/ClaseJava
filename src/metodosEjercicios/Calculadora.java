package metodosEjercicios;

public class Calculadora {
	static int sum (int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
	static int res (int num1, int num2) {
		int result = num1 - num2;
		return result;
	}
	static int mul (int num1, int num2) {
		int result = num1 * num2;
		return result;
	}
	static double div (double num1, double num2) {
		double result = num1 / num2;
		return result;
	}
	static double exp (double num1, double num2) {
		double result = 1;
		if (num2>0.0) {
			for (int i = 0; i < num2; i++) {
				result *= num1;
			}
		} else {
			for(int i = 0; i > num2; i--){
				result *= 1/num1;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		double baseD = exp(2,40);
		double baseEjercicio = 1 * baseD;
		double baseB = exp(2,30);
		double ejercicio2 = 1.2 * baseB;
		System.out.println(baseEjercicio/ejercicio2);
	}
}
