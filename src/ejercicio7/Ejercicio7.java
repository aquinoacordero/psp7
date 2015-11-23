package ejercicio7;

/**
 *
 * @author aquinoacordero
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        int cont = 0;

        Buzon b = new Buzon("hola");
        Leer lec = new Leer(b);
        Escribir esc = new Escribir(b);

        lec.start();
        esc.start();

    }

}
