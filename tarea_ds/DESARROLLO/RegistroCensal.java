/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea_ds.DESARROLLO;

/**
 *
 * @author JESUS DAVID
 */
public class RegistroCensal {
    private Persona persona;
    private Municipio municipio;
    private String calle;
    private String numero;
    private java.util.Date fechaRegistro;
    
    
    public RegistroCensal(Persona persona, Municipio municipio, String calle, String numero, java.util.Date fechaRegistro) {
        this.persona = persona;
        this.municipio = municipio;
        this.calle = calle;
        this.numero = numero;
        this.fechaRegistro = fechaRegistro;
    }
}
