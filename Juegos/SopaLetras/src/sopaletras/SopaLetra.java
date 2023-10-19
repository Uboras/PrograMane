/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sopaletras;

/**
 *
 * @author Herna
 */
public class SopaLetra {
private Tablero tablero;

    public SopaLetra() {
        int alto= ((int)(Math.random()*10))+10;
        int ancho = ((int)(Math.random()*10))+10; 
        this.tablero = new Tablero(alto,ancho);
    }

    public Tablero getTablero() {
        return tablero;
    }
    
}
