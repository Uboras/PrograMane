package Entidades.Juego;

import Pantallas.PantallaJuego;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Hernan Manera
 */
public final class Tateti extends Juego {

//Constructor con inicio de pantalla
    public Tateti() {
        inicioJuego();
        accionesPantallaJuego();
    }
//===================================================================

    /*
    Pantalla Inicio del juego
     */
    //botones de pagina de Inicio
    public void inicioJuego() {
        pantallaInicio.setVisible(true);
      
        //Toma los datos de las variables para los nombres de los jugadores y empieza el juego
        pantallaInicio.getBotonInicioJuego().addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                jugador1.setNombre(pantallaInicio.getJugador1());
                jugador2.setNombre(pantallaInicio.getJugador2());
                if (jugador1.getNombre().isEmpty() && jugador2.getNombre().isEmpty()) {
                    
                } else {
                     pantallaInicio.setVisible (false);
            pantallaJuego.setVisible (true);
                }
            

          
              
            }

        }
);

    }
//===================================================================

    /*
    Pantalla del juego
     */
    //botones de pagina de juego (cuadricula)
    private void accionesPantallaJuego() {
        pantallaJuego.getButton1().addActionListener(new ActionListener() {
            @Override
public void actionPerformed(ActionEvent e) {
                int btn = 0;
                pantallaJuego.getButton1().setLabel(llenadoTablero(btn));
            verificacionTotal();
            }

        }
        );

        pantallaJuego.getButton2().addActionListener(new ActionListener() {
            @Override
public void actionPerformed(ActionEvent e) {
                int btn = 1;
                pantallaJuego.getButton2().setLabel(llenadoTablero(btn));
           verificacionTotal();
            }

        }
        );
        pantallaJuego.getButton3().addActionListener(new ActionListener() {
            @Override
public void actionPerformed(ActionEvent e) {
                int btn = 2;
                pantallaJuego.getButton3().setLabel(llenadoTablero(btn));
            verificacionTotal();
            }

        }
        );
        pantallaJuego.getButton4().addActionListener(new ActionListener() {
            @Override
public void actionPerformed(ActionEvent e) {
                int btn = 3;
                pantallaJuego.getButton4().setLabel(llenadoTablero(btn));
           verificacionTotal();
            }

        }
        );
        pantallaJuego.getButton5().addActionListener(new ActionListener() {
            @Override
public void actionPerformed(ActionEvent e) {
                int btn = 4;
                pantallaJuego.getButton5().setLabel(llenadoTablero(btn));
            verificacionTotal();
            }

        }
        );
        pantallaJuego.getButton6().addActionListener(new ActionListener() {
            @Override
public void actionPerformed(ActionEvent e) {
                int btn = 5;
                pantallaJuego.getButton6().setLabel(llenadoTablero(btn));
           verificacionTotal();
            }

        }
        );
        pantallaJuego.getButton7().addActionListener(new ActionListener() {
            @Override
public void actionPerformed(ActionEvent e) {
                int btn = 6;
                pantallaJuego.getButton7().setLabel(llenadoTablero(btn));
           verificacionTotal();
            }

        }
        );
        pantallaJuego.getButton8().addActionListener(new ActionListener() {
            @Override
public void actionPerformed(ActionEvent e) {
                int btn = 7;
                pantallaJuego.getButton8().setLabel(llenadoTablero(btn));
            verificacionTotal();
            }

        }
        );
        pantallaJuego.getButton9().addActionListener(new ActionListener() {
            @Override
public void actionPerformed(ActionEvent e) {
                int btn = 8;
                pantallaJuego.getButton9().setLabel(llenadoTablero(btn));
            verificacionTotal();
            
            }

        }
        );
    }
    //verificacion de contador
private void aumentarContador(){
pantallaJuego.setContador (pantallaJuego.getContador()+1);

}
private void verificacionTotal(){
    Integer ver1 = verificacionSeEspacios();
    Integer ver2 = verificacionGanandor();
    if(ver2 != 0){
        finJuego();
    }else if(ver1==0){
    reset();}
}
   private int verificacionSeEspacios(){
        int espacios= 9;
        for (int i = 0; i <pantallaJuego.getTablero().length ; i++) {
           if(0 != pantallaJuego.getTablero()[i]){
               espacios--;
           }
       }
    return espacios;}
   
   private void reset(){
      
        try {
            Thread.sleep(1000);
            pantallaJuego.setVisible(false);
            pantallaJuego.dispose();
            setPantallaJuego(new PantallaJuego());
            accionesPantallaJuego();
            pantallaJuego.setVisible(true);
        } catch (InterruptedException ex) {
           JOptionPane.showConfirmDialog(pantallaJuego,"Error en compilar" );
        }
   }
//===================================================================
    /*
    Pantalla fin del juego
     */
   public void finJuego(){
        try {
            pantallaJuego.setVisible(false);
            tablefinal();
            Thread.sleep(500);
            //salir
            pantallaFin.getjButton3().addActionListener(new ActionListener() {
                @Override
public void actionPerformed(ActionEvent e) {
                    System.exit(0);
                }
                
            }
            );
            pantallaFin.getjButton2().addActionListener(new ActionListener() {
                @Override
public void actionPerformed(ActionEvent e) {
                    pantallaFin.dispose();
                    reset();
                }
                
            }
            );
            pantallaFin.setVisible(true);

} catch (InterruptedException ex) {
            Logger.getLogger(Tateti.class  

.getName()).log(Level.SEVERE, null, ex);
        }
   }
//botones de pagina de fin de juego
    
   
    //comenzar de nuevo
    //metodos de modificacion de informacion
    private int verificacionGanandor() {

        int[] tablero = pantallaJuego.getTablero();
        
          int[][] combinacionesGanadoras = {
            {0, 1, 2}, {3, 4, 5}, {6, 7, 8}, // Filas
            {0, 3, 6}, {1, 4, 7}, {2, 5, 8}, // Columnas
            {0, 4, 8}, {2, 4, 6} // Diagonales
        };
            for (int[] combinacion : combinacionesGanadoras) {
            int a = combinacion[0];
            int b = combinacion[1];
            int c = combinacion[2];

            if (tablero[a] == tablero[b] && tablero[b] == tablero[c] && tablero[a] != 0) {
                return tablero[a]; // Un jugador ha ganado
            }
        }

        return 0; // Nadie ha ganado todavía
    }

     @Override
public void tablefinal() {
        String jugadorGanador = jugador1.getNombre();
        if (verificacionGanandor()== jugador2.getNumeroJugador()) {
            jugadorGanador = jugador2.getNombre();
        }
        String frase= jugadorGanador ;
        pantallaFin.getJtextGanador().setText(frase);
    }

    

    private String llenadoTablero(int posicion) {
                String ret ="";
        if (pantallaJuego.getTablero()[posicion] == 0) {
            if (pantallaJuego.getContador() % 2 == 0 || pantallaJuego.getContador() == 0) {
                pantallaJuego.getTablero()[posicion] = 1;
                aumentarContador();
                 ret = "0";
            }else if (pantallaJuego.getContador() % 2 != 0 && pantallaJuego.getContador() != 0) {
                pantallaJuego.getTablero()[posicion] = 2;
                aumentarContador();
                 ret = "X";
            }
        }else if(pantallaJuego.getTablero()[posicion]== 1){
            ret = "0";
        }else{
            ret ="X";
        }
        for (int i = 0; i < pantallaJuego.getTablero().length; i++) {

            if (i < 2) {
                System.out.print(pantallaJuego.getTablero()[i]);

            } else if (i == 2) {
                System.out.println(pantallaJuego.getTablero()[i]);
            } else if (i > 2 && i < 5) {
                System.out.print(pantallaJuego.getTablero()[i]);
            } else if (i == 5) {
                System.out.println(pantallaJuego.getTablero()[i]);
            } else if (i > 5 && i < 8) {
                System.out.print(pantallaJuego.getTablero()[i]);
            } else if (i == 8) {
                System.out.println(pantallaJuego.getTablero()[i]);
                System.out.println("Contador:" + pantallaJuego.getContador());
            }
        }
        return ret;
    }

}
