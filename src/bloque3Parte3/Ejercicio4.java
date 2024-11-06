package bloque3Parte3;
/*
 * Escribir una función llamada boolean esLaborable (int dia)
 * que reciba por parámetro un día compruebe que está entre el 1 al 7
 * y devuelva true si es de lunes a viernes y false si es sábado o domingo. 
 * En caso de recibir un número menor de uno o mayor que siete devolverá false.
 */
public class Ejercicio4 {
	static boolean esLaborable(int dia) {
		boolean resultado = true;
		switch (dia) {
		case 1,2,3,4,5:
			resultado = true;
			break;
		default:
			resultado = false;
		}
		return resultado;
	}
	public static void main(String[] args) {
		boolean a = esLaborable(4);
		System.out.println(a);
	}
}
