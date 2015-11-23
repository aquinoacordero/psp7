package ejercicio7;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aquinoacordero
 */
public class Escribir extends Thread {

    Buzon b;

    Escribir(Buzon b) {
        this.b = b;
    }

    @Override
    public void run() {
        if (b.getMensaje().length() > 0) {
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Leer.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {

            synchronized (b) {
                System.out.println("Escribiendo mensaje");
                b.setMensaje("hola");
                notify();
            }
        }

    }
}
