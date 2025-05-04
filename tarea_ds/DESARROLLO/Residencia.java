/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea_ds.DESARROLLO;

/**
 *
 * @author JESUS DAVID
 */
public class Residencia {
    private Persona persona;
    private String direccion;
    private Municipio municipio;
    private java.util.Date fechaInicio;
    
      public Residencia(Persona persona, String direccion, Municipio municipio, java.util.Date fechaInicio) {
        this.persona = persona;
        this.direccion = direccion;
        this.municipio = municipio;
        this.fechaInicio = fechaInicio;
    }
}
