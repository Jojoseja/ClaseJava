package ejerciciosarray;
//Buscar un elemento dentro de un array, indicando la posición donde se encuentra/n 
public class Dictado {
	static void contadorArray (int[] lista, int num) {
		int contador = 0;
		int total = 0;
		boolean aparece = false;
		for (int i : lista) {
			contador +=1;
			if (i == num) {
				System.out.println("El número " + num + " se encuentra en la posición " +  (contador));
				aparece = true;
				total += 1;
			}
		}if (aparece) {
			System.out.println("El número " + num + " aparece un total de " + total + " vez/veces");
		} else {
			System.out.println("El número " + num + " no aparece en el Array");
		}
	}
	public static void main(String[] args) {
		int[] lista = {1, 3 ,4 , 5 , 6, 8, 1};
		contadorArray(lista, 1);
	}
}
