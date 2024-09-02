/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.avanzada.taller1.modelo;

/**
 *
 * @author danie
 */
public class Reservista extends Persona {
    
    private int libretaMilitar;
    
    public Reservista(String nombre, String apellido, int cedula, int libretaMilitar) {
        super(nombre, apellido, cedula);
        this.libretaMilitar = libretaMilitar;
    }
    
}
