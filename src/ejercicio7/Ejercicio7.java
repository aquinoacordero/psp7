package ejercicio7;

/**
 *
 * @author aquinoacordero
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        int cont = 0;

        Buzon b = new Buzon("hola");
        Leer lec = new Leer(b, "paco");
        Escribir esc = new Escribir(b, "marta");
        Leer lec2 = new Leer(b, "serena");
        Escribir esc2 = new Escribir(b, "manuel");
        Leer lec3 = new Leer(b, "santi");
        Escribir esc3 = new Escribir(b, "sara");

        lec.start();
        esc.start();
        lec2.start();
        esc2.start();
        lec3.start();
        esc3.start();

    }

}
