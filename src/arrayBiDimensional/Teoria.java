package arrayBiDimensional;

public class Teoria {
	
	public static void main(String[] args) {
		//Un array Bidimensional genera una tabla,en donde suponiendo myNumbers[1][2], {1} indica el número de fila y el {2} indica el número de columnas
		//Para Declarar el Array Bidimensional
		int[][] myNumbers = { {1,2,3,4},{5,6,7}};
 		//El .length ahora indica el número de filas,
		//Para recorrer la Array Bidimensional hay que hacer un for dentro de otro for
		for (int i = 0; i < myNumbers.length ; i++) {
			//Así para recorrer las filas del Array
			for (int j = 0; j < myNumbers[i].length; j++) {
				//Así para recorrer las columnas de la fila que se esté viendo [i]
				
				//Una vez hecho los for para enseñarlo por pantalla hay que indicar la posición de la fila que se está viendo y la posición de la columna.
				//System.out.println(myNumbers[i][j]);
			}
		}
		
		//Otra forma de hacer los for es con for each
		for (int[]row : myNumbers) {
			for(int i : row) {
				System.out.println(i);
			}
		}
	}
}
