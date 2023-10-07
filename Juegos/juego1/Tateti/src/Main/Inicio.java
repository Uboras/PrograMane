package Main;

import Entidades.Juego.Tateti;

import javax.swing.JOptionPane;

/**
 *
 * @author Hernan Manera
 */
public class Inicio {

    public static void main(String[] args) {
      
        try {
            new Tateti();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "e.getCause()");
        } finally {
            
        }

        
        
        
    }
    
}
