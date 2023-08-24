/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AdministracionHabitacioness;

/**
 *
 * @author Daniel Hidalgo
 */


public enum TipoHabitacion {
    Suite("Suite"),
    HabitacionSimple("Habitación Simple"),
    HabitacionDoble("Habitación Doble");

    private String descripcion;

    private TipoHabitacion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}



