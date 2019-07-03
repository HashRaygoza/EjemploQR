/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.pydee.ejemploqr;

import com.google.zxing.WriterException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author David
 */
public class Ventana extends JFrame {
    
    public Ventana() throws WriterException {
        GeneraQR generaQR = new GeneraQR();
        ImageIcon icono = new ImageIcon(generaQR.crearQR("https://medium.com/el-acordeon-del-programador", 300, 300));
        JLabel etiqueta = new JLabel("");
        
        etiqueta.setIcon(icono);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Ejemplo de codigo QR");
        this.getContentPane().add(etiqueta);
        this.pack();        
    }
}
