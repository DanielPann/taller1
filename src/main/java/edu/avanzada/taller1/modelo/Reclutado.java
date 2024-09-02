/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.avanzada.taller1.modelo;

/**
 *
 * @author danie
 */
public class Reclutado extends Persona {
    
    private int codigoReclutamiento;
    
    public Reclutado(String nombre, String apellido, int cedula, int codigoReclutamiento) {
        super(nombre, apellido, cedula);
        
        this.codigoReclutamiento = codigoReclutamiento;
    }
    
}
