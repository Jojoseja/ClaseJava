package ejerciciosarray;
//Introducir números por teclado y mostrarlos por orden inverso
import java.util.Scanner;

public class EjercicioDictado {
	
	
	static int[] crearArray(int num) {
	Scanner sc = new Scanner(System.in);
	int[] lista = new int[num];
	for (int i = 0; i < lista.length; i++) {
		lista[i] = sc.nextInt();
		}
	return lista;
	}
	
	
	static int[] invertirArray(int[] lista) {
		int[] listaINV = new int[lista.length];
		int cont = 0;
		for (int i = lista.length - 1; i >= 0; i--) {
			listaINV[cont] = lista[i];
			cont += 1;
		}
		return listaINV;
	}
	
	
	public static void main(String[] args) {
		int[] lista = crearArray(5);
		int[] listilla = invertirArray(lista);
		for (int i : listilla) {
			System.out.println(i);
		}
	}
}
