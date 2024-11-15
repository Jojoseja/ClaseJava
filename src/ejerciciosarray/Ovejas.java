package ejerciciosarray;


public class Ovejas {
	static int contarOvejar (boolean[] lista) {
		int contador = 0;
		for (boolean i : lista) {
			if (i) {
				contador += 1;
			}
		}
		return contador;
	}
	public static void main(String[] args) {
		boolean[] arrayOvejas = {true,  true,  true,  false, true,  true,  true,  true , true,  false, true,  false, true,  false, false, true , true,  true,  true,  true , false, false, true,  true};		
		boolean[] array2 = {false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,true};
		int resultado = contarOvejar(array2);
		System.out.println(resultado);
	}
}
