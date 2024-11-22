package arrays;
import java.util.Arrays;
import java.util.Collections;


//En ordern ascendente
public class Ejercicio14 {
	
	static int[] ordenarArrays(int[] numeros){
		int[] arrayOrdenada = new int[numeros.length];
		Arrays.sort(numeros, Collections.reverseOrder());
		
	}
	public static void main(String[] args) {
		int[] lista = {1,3,5,7,5,3,1};
		int[] a = ordenarArrays(lista);
		for (int b : a) {
			System.out.println(b);
		}
	}
}

