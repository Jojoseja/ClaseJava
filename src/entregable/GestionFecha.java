package entregable;
import java.util.Scanner;
public class GestionFecha {
	static boolean esFechaCorrecta(int dia, int mes, int año) {
		boolean res;
		if (año >= 0) {
			switch (mes) {
			case 1,3,5,7,8,10,12:
				if (dia > 31 || dia <= 0) {
					res = false;
				} else {
					res = true;
				}
				break;
			case 4,6,9,11:
				if (dia > 30 || dia <= 0) {
					res = false;
				} else {
					res = true;
				}
				break;
			case 2:
				if (dia > 28 || dia <= 0) {
					res = false;
				} else {
					res = true;
				}
				break;
			default:
				res = false;
			}
		} else {
			res = false;
		}
		
		return res;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el día: ");
		int dia = sc.nextInt();
		System.out.println("Introduce el mes: ");
		int mes = sc.nextInt();
		System.out.println("Introduce el año: ");
		int año = sc.nextInt();
		boolean a = esFechaCorrecta(dia,mes,año);
		if (a == true) {
			System.out.println("La fecha es correcta");
		} else {
			System.out.println("La fecha es incorrecta");
		}
	}
}
