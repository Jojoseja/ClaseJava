package bloque3Parte2;
/*
 * Crear una función llamada boolean  esFechaCorrecta(int dia, int mes, int año)
 * que reciba por parámetro el día, el mes y el año de una fecha y devuelva true
 * si es correcto o false en caso contrario. Suponer que to
 * dos los meses son de 30 días. 
 */
public class Ejercicio11 {
	static boolean esFechaCorrecta(int dia, int mes, int año) {
		boolean resultado = true;
		if (dia <= 30 && dia > 0 && mes <= 12 && mes > 0) {
			resultado = true;
		} else {
			resultado = false;
		} return resultado;
	}
	static boolean esFechaCorrectaB(int dia, int mes, int año) {
		boolean resultado = true;
		if (mes == 1 ||mes == 3 ||mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
			if (dia <= 31 && dia > 0) {
				resultado = true;
			} else {
				resultado = false;
			}
		} else if (mes == 2) {
			if (año % 4 == 0 && dia <= 29 && dia > 0) {
				resultado = true;
			} else if (dia <= 28 && dia > 0) {
				resultado = true;
			} else {
				resultado = false;
			} 
		} else if (mes == 4 ||mes == 6 ||mes == 9 ||mes == 11) {
			if (dia <= 30 && dia > 0) {
				resultado = true;
			} else {
				resultado = false;
			}
		} else {
			resultado = false;
		}
		return resultado;
	}
	public static void main(String[] args) {
		boolean a = esFechaCorrectaB(30,2,2000);
		System.out.println(a);
	}
}
