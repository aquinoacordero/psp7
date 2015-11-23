package ejercicio7;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aquinoacordero
 */
public class Leer extends Thread {

    Buzon b;

    Leer(Buzon b) {
        this.b = b;
    }

    @Override
    public void run() {
        if (b.getMensaje() == "") {
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Leer.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            synchronized (b) {
                System.out.println("Mensaje: " + b.getMensaje());
                b.setMensaje("");
                System.out.println("Mensaje: " + b.getMensaje());
                notify();
            }
        }
    }
}
