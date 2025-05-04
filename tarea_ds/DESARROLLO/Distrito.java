/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea_ds.DESARROLLO;

/**
 *
 * @author JESUS DAVID
 */
public class Distrito {
    private int id;
    private String nombre;
    private Municipio municipio;
    
    public Distrito(int id, String nombre, Municipio municipio) {
        this.id = id;
        this.nombre = nombre;
        this.municipio = municipio;
    }
}
