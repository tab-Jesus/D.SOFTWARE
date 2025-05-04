/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea_ds.DESARROLLO;

/**
 *
 * @author JESUS DAVID
 */
public class Persona {
    private String nombre;
    private String apellidos;
    private String lugarNacimiento;
    private java.util.Date fechaNacimiento;
    private int edad;
    private float estatura;
    private String sexo;
    private String nivelEstudios;
    private String situacionMilitar;
    private String dni;
    
      public Persona(String nombre, String apellidos, String lugarNacimiento, java.util.Date fechaNacimiento, int edad, float estatura, String sexo, String nivelEstudios, String situacionMilitar, String dni) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.lugarNacimiento = lugarNacimiento;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
        this.estatura = estatura;
        this.sexo = sexo;
        this.nivelEstudios = nivelEstudios;
        this.situacionMilitar = situacionMilitar;
        this.dni = dni;
    }
    
}
