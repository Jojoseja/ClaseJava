package arrayBiDimensional;
import java.util.Arrays;


public class Teoria2 {
	
	static void parte1() {		
		int[][] array = { {1,2,3}, {4,5,6}, {7,8,9} };
		int[][] arr2 = {{1,2},{3,4}};
		int[][] arr3 = {{1,2},{3,4}};
		int[] arr4 = {1,2,3};
		int[] arr5 = {1,2,3};
		boolean a = Arrays.deepEquals(arr2,arr3);
		boolean b = Arrays.equals(arr2, arr3);
		boolean c = Arrays.equals(arr4, arr5);
		boolean d = Arrays.equals(array[0],arr4);
		System.out.println("Usando deepequals en int[][] " + a);
		System.out.println("Usando equals en int[][]: " + b);
		System.out.println("Usando equals en int[]: " + c);
		System.out.println("Usando equals para compara int[x][] con int[]: " + d);
		}
	
	
	static boolean igualArrays(int[]arr1,int[]arr2) {
		int counter = -1;
		boolean result = true;
		for (int i : arr1) {
			counter += 1;
			if (arr2[counter] != i) {
				System.out.println("No son iguales");
				result = false;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		int[] lista1 = {1,2,3};
		int[] lista2 = {1,2,3};
		boolean a = igualArrays(lista1,lista2);
		System.out.println(a);
	}
}
