package ejercicio7;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aquinoacordero
 */
public class Leer extends Thread {

    Buzon b;
    String lector;

    public Leer(Buzon b, String lector) {
        this.b = b;
        this.lector = lector;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            
            synchronized (b) {
                if (b.getMensaje() == "") {
                    b.wait();
                }
                System.out.println(lector + " leyendo mensaje: " + b.getMensaje());
                b.setMensaje("");
                System.out.println("Mensaje: " + b.getMensaje());
                b.notify();
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Leer.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
