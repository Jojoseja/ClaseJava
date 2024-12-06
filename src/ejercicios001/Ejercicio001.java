package ejercicios001;
import java.util.Scanner;

public class Ejercicio001 {
	static Scanner sc = new Scanner(System.in);
	//Crea una matriz 2x2 que almacene los siguientes valores: 10,20,30,40 y muestra su resultado
	static void ejercicio1() {
		int [][] array = {{10,20},{30,40}};
		for (int[] a : array) {
			for (int b : a) {
				System.out.println(b);
			}
		}
	}
	
	//Crea una matriz nxm donde el usuario va a indicar el tamaño de la matriz. El usuario además debe llenar la matriz con números. 
	static void ejercicio2() {
		System.out.println("Introduce el tamaño de la array en formato NxM, empezando por N(Columnas): ");
		int let = sc.nextInt();
		System.out.println("Introduce ahora la M(Filas): ");
		int lat = sc.nextInt();
		int [][] customArray = new int [lat][let];
		for (int i = 0; i < customArray.length; i++) {
			for (int j = 0; j < customArray[i].length; j++ ) {
				System.out.println("Introduce el numero en la posicion " + (i+1) + ", " + (j+1));
				customArray[i][j] = sc.nextInt();
 			}
		}
	}
	
	//Crear una matriz n x m y llenala con los números que el usuario desee. Sume todos los números que componga la columna 1.
	static void ejercicio3() {
		int totalSum = 0;
		System.out.println("Introduce el tamaño de la array en formato MxN, empezando por M(Filas): ");
		int lat = sc.nextInt();
		System.out.println("Introduce ahora la N(Columnas): ");
		int let = sc.nextInt();
		int [][] customArray = new int [lat][let];
		for (int i = 0; i < customArray.length; i++) {
			for (int j = 0; j < customArray[i].length; j++ ) {
				System.out.println("Introduce el numero en la posicion " + (i+1) + ", " + (j+1));
				customArray[i][j] = sc.nextInt();
 			}
		}
		
		for (int a = 0; a < customArray.length; a++) {
			for (int b = 0; b < customArray[a].length; b++) {
				if (b==0) {
					totalSum += customArray[a][b];
				}
			}
		}
		System.out.println(totalSum);
	}
	
	//Llenar una matriz de 3 x 3 completamente de números aleatorios entre 0 y 9. Para rellenar con números aleatorios usa la función azar ()
	static int[][] ejercicio4(){
		int[][] array = new int[3][3];
		for (int i = 0; i < array.length; i++ ) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = (1 + (int) + (Math.random()*((9-1)+1)));
			}
		}
		return array;
	}
	
	//Hacer una matriz cuadrada, rellenarla y calcular la suma de la diagonal principal
	static void ejercicio5() {
		System.out.println("Introduce la longitud de la matriz cuadrada");
		int cuad = sc.nextInt();
		int diagonal =0;
		int[][] matriz = new int [cuad][cuad];
		for (int i = 0; i < matriz.length; i++ ) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = (1 + (int) + (Math.random()*((9-1)+1)));
			}
		}
		for (int [] a : matriz) {
			System.out.println();
			for (int b : a ) {
				System.out.print(b + " ");
			}
		}
		for (int x = 0; x < matriz.length; x++) {
			for (int y = 0; y < matriz[x].length; y++) {
				if (x == y) {
					diagonal += matriz [x][y];
				}
			}
		}
		System.out.println();
		System.out.println(diagonal);
	}
	
	//Lo mismo pero con la diagonal secundaria
	static void ejercicio6() {
		System.out.println("Introduce la longitud de la matriz cuadrada");
		int cuad = sc.nextInt();
		int diagonal = 0;
		int[][] matriz = new int [cuad][cuad];
		for (int i = 0; i < matriz.length; i++ ) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = (1 + (int) + (Math.random()*( (9 - 1) + 1)));
			}
		}
		for (int [] a : matriz) {
			System.out.println();
			for (int b : a ) {
				System.out.print(b + " ");
			}
		}
		for (int x = 0; x < matriz.length; x++) {
			for (int y = 0; y < matriz[x].length; y++) {
				if (x + y == (matriz.length-1) ) {
					diagonal += matriz [x][ ( (matriz.length) - x - 1) ];
				}
			}
		}
		System.out.println();
		System.out.println(diagonal);
	}
	
	public static void main(String[] args) {
		ejercicio6();
	}
}
