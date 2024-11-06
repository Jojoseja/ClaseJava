package bloque3Parte2;
/*
 * Crear una función llamada String obtenerSiguienteDía (int dia, int mes, int año) 
 * que reciba por parámetro el día, el mes y el año de una fecha y si es la fecha correcta, 
 * devuelva el siguiente String con el formato dd-mm-yyyy. 
 * Suponer que todos los meses son de 30 días. 
 */
public class Ejercicio13 extends Ejercicio11 {
	static String obtenerSiguienteDía(int dia, int mes, int año) {
		String resultado;
		if (esFechaCorrecta(dia, mes, año) == true) {
			resultado = dia + "-" + mes + "-" + año;
		} else {
			resultado = "Introduce una fecha correcta";
		}
		return resultado;
	}
	static String obtenerSiguienteDíaB(int dia, int mes, int año) {
		String resultado = "";
		if (esFechaCorrectaB(dia, mes, año) == true) {
			resultado = dia + "-" + mes + "-" + año;
		} else {
			resultado = "Introduce una fecha correcta";
		}
		return resultado;
	}
	public static void main(String[] args) {
		String a = obtenerSiguienteDía(31,3,2002);
		System.out.println(a);
		String b = obtenerSiguienteDíaB(31,3,2002);
		System.out.println(b);
	}
}
