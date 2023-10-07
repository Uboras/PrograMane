/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades.Juegadores;

import java.awt.Color;

/**
 *
 * @author Herna
 */
public abstract class Jugadores implements JugadoresIT {

    protected Color color;
    protected int numeroJugador;
    protected String nombre = "";

    public Jugadores(Color color, int numeroJugador) {
        this.color = color;
        this.numeroJugador = numeroJugador;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public Color getColor() {
        return color;
    }

    public int getNumeroJugador() {
        return numeroJugador;
    }

}
