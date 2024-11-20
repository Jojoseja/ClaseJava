package arrays;
import java.util.Arrays;


public class Ejercicio13 {
	
	
	static int[] filtrarPares(int []numeros) {
		int counter = 0;
		for (int i : numeros) {
			if (i % 2 == 0) {
				counter += 1;
			}
		}
		
		int[] paresArray = new int[counter];
		int posi = 0;
		for (int i:numeros) {
			if (i%2 ==0) {
				paresArray[posi] = i;
				posi +=1;
			}
		}
		
		return paresArray;
	}
	
	
	static int[] filtrarPares2(int[]numeros) {
		int[] paresArray = Arrays.copyOf(numeros, 0);
		for (int i : numeros) {
			if (i % 2 == 0) {
				paresArray = Arrays.copyOf(paresArray, paresArray.length+1);
				paresArray[paresArray.length-1] = i;
			}
		}
		
		return paresArray;
	}
	
	
	public static void main(String[] args) {
		int[]lista = {1,2,3,4,5,5,4,4};
		int[] b = filtrarPares2(lista);
		for (int i : b) {
			System.out.println(i);
		}
	}
}
