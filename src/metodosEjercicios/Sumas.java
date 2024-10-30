package metodosEjercicios;

public class Sumas {
	static int sum (int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
	static int mul (int num1, int num2) {
		int result = num1 * num2;
		return result;
	}
	public static void main(String[] args) {
		int num2 = 5;
		int num1 = mul(4,num2);
		int num3 = mul(num1,num1);
		System.out.println(num3);
	}

}
