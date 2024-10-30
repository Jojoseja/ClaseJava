package enumsEjercicios;

public class EjemploSwitch {
	enum Mes {
		Enero,
		Febrero,
		Marzo,
		Abril,
		Mayo,
		Junio,
		Julio,
		Agosto,
		Septiembre,
		Octubre,
		Noviembre,
		Diciembre
	}
	static Mes mes = Mes.Febrero;
	static int numeroDias = 0;
	static int año = 2016;
	
	public static void main(String[] args) {
		switch (mes) {
		case Enero:
		case Marzo:
		case Mayo:
		case Julio:
		case Agosto:
		case Octubre:
		case Diciembre:
			numeroDias += 31;
			break;
		case Abril:
		case Junio:
		case Septiembre:
		case Noviembre:
			numeroDias += 31;
			break;
		case Febrero:
			if (año % 4 == 0) {
				numeroDias += 29;
			} else {
				numeroDias += 28;
			}
			break;
		}
		System.out.println(numeroDias);
	}

}
