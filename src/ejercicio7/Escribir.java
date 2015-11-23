package ejercicio7;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aquinoacordero
 */
public class Escribir extends Thread {

    Buzon b;
    String escritor;

    Escribir(Buzon b, String escritor) {
        this.b = b;
        this.escritor = escritor;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            
            synchronized (b) {
                if (b.getMensaje().length() > 0) {b.wait();}
                b.setMensaje("hola");
                System.out.println(escritor + " escribiendo mensaje: "+b.getMensaje());
                b.notify();
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Escribir.class.getName()).log(Level.SEVERE, null, ex);
        }


    }
}
