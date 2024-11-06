package bloque3Parte2;
/*
 * Crear una función llamada Notas obtenerNota (int nota) 
 * que reciba nota del 0 al 10 que devuelve un tipo enumerado llamado Notas 
 * con los valores INSUFICIENTE, SUFICIENTE, BIEN, NOTABLE, SOBRESALIENTE y ERROR. 
 * En caso de que la nota sea menor que 0 o mayor que 10 devolverá ERROR.
 */
public class Ejercicio10 {
	enum Notas {INSUFICIENTE,SUFICIENTE,BIEN,NOTABLE,SOBRESALIENTE,ERROR};
	static Notas obtenerNota(int nota) {
		Notas resultado;
		if (nota >= 0 && nota < 5) {
			resultado = Notas.INSUFICIENTE;
		} else if (nota >= 5 && nota < 6) {
			resultado = Notas.SUFICIENTE;
		} else if (nota >= 6 && nota < 7) {
			resultado = Notas.BIEN;
		} else if (nota >= 7 && nota < 9) {
			resultado = Notas.NOTABLE;
		} else if (nota >= 9 && nota <= 10) {
			resultado = Notas.SOBRESALIENTE;
		} else {
			resultado = Notas.ERROR;
		}
		return resultado;
	}
	public static void main(String[] args) {
		Notas test = obtenerNota(0);
		System.out.println(test);
	}
}