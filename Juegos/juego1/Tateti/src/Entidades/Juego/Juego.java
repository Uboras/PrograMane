package Entidades.Juego;


import Entidades.Juegadores.JugadorAzul;
import Entidades.Juegadores.JugadorRojo;
import Pantallas.PantallaFin;
import Pantallas.PantallaInicio;
import Pantallas.PantallaJuego;


/**
 *
 * @author Hernan Manera
 */
public abstract class Juego implements JuegoIT {

   protected PantallaInicio pantallaInicio;
   protected PantallaJuego pantallaJuego;
   protected PantallaFin pantallaFin;
   protected JugadorAzul jugador1;
   protected JugadorRojo jugador2;

    public Juego() {
        this.pantallaInicio = new PantallaInicio();
        this.pantallaJuego = new PantallaJuego();
        this.pantallaFin = new PantallaFin();
        this.jugador1 = new JugadorAzul();
        this.jugador2 = new JugadorRojo();
    }
  
    
    
   
    @Override
    public void start() {
    pantallaInicio.setVisible(true);
    
    }
   
    @Override
    public void end() {

        pantallaInicio.dispose();
        pantallaJuego.dispose();
    }

}
