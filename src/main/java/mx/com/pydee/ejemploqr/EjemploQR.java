/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.pydee.ejemploqr;

import com.google.zxing.WriterException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author David
 */
public class EjemploQR {
    static public void main(String[] args) {
        try {
            Ventana ventana = new Ventana();
            
            ventana.setVisible(true);
            
        } catch (WriterException ex) {
            Logger.getLogger(EjemploQR.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
