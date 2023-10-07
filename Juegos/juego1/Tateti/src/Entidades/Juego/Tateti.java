package Entidades.Juego;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Hernan Manera
 */
public class Tateti extends Juego {

    static final String GANADOR = "El Ganador es el ";
    static int GANADORID = 0;
//Constructor con inicio de pantalla
    public Tateti() {
        inicioJuego();
    }
    //botones de pagina de Inicio
    public void inicioJuego() {
        pantallaInicio.setVisible(true);
        pantallaInicio.getBotonInicioJuego().addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                jugador1.setNombre(pantallaInicio.getJugador1());
                jugador2.setNombre(pantallaInicio.getJugador2());
                pantallaInicio.dispose();
                pantallaJuego.setVisible(true);
            }
        });
    }
    //botones de pagina de juego

    //botones de pagina de fin de juego
    //metodos de modificacion de informacion
    private int verificacion() {

        int[] tablero = pantallaJuego.getTablero();
        //verifica filas
        for (int i = 0; i < 3; i = +3) {
            if (tablero[i] == tablero[i + 1] && tablero[i] == tablero[i + 2]) {
                GANADORID = tablero[i];
            }
        }
        //verifica Columnas
        for (int j = 0; j < 3; j++) {
            if (tablero[j] == tablero[j + 3] && tablero[j] == tablero[j + 6]) {
                GANADORID = tablero[j];
            }
        }
        //verifica obliquas
        int k = 0;
        if (tablero[k] == tablero[k + 4] && tablero[k] == tablero[k + 4]) {
            GANADORID = tablero[k];
        }
        if (tablero[k + 2] == tablero[k + 4] && tablero[k] == tablero[k + 6]) {
            GANADORID = tablero[k];
        }

        return GANADORID;

    }

    @Override
    public void tablefinal() {
        String jugadorGanador = jugador1.getNombre();
        if (this.verificacion() == jugador2.getNumeroJugador()) {
            jugadorGanador = jugador2.getNombre();
        }
        pantallaFin.setjLabel2(GANADOR + jugadorGanador);
    }

    @Override
    public void turnos() {

    }
}
