package enumsEjercicios;

public class Ejercicio1 {
    enum DiaSemana{
        LUNES,
        MARTES,
        MIERCOLES,
        JUEVES,
        VIERNES,
        SABADO,
        DOMINGO
    }
    public static void main(String[] args) {
        DiaSemana a = DiaSemana.LUNES;
        System.out.println(a);
    }
}