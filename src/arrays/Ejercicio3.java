package arrays;
import java.util.Scanner;

public class Ejercicio3 {
	static Scanner sc = new Scanner(System.in);
	
	static int[] crearArray() {
		int[] lista = new int[10];
		for (int i=0; i<lista.length; i++) {
			System.out.println("Escribe un número para la posición: " + (i+1));
			lista[i] = sc.nextInt();
		}
		return lista;
	}
	static void contadorArray(int lista[]) {
		int conN = 0, conP = 0, conC = 0;
		for (int i : lista) {
			if (i > 0) {
				conP += 1;
			} else if (i == 0) {
				conC += 1;
			} else {
				conN +=1;
			}
		}System.out.println("En la lista hay: " + conP + " Numeros Positivos, "+conN+" Numeros Negativos "+ conC + " Ceros");
	}
	public static void main(String[] args) {
		int[] lista = crearArray();
		contadorArray(lista);
	}
}
