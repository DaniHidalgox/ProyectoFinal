/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AdministracionHabitacioness;

import Habitaciones.Habitacion;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Daniel Hidalgo
 */
public class Admin_Habitaciones {
   private List<Habitacion> Habitaciones;

    public Admin_Habitaciones(List<Habitacion> Habitaciones) {
        Habitaciones = new ArrayList<>();
    }
   public void agregarHabitacion(int numero, String tipo, double precio) {
    Habitacion nuevaHabitacion = new Habitacion(numero, tipo, precio);
    Habitaciones.add(nuevaHabitacion);
}
  public Habitacion buscarHabitacion(int numero) {
        for (Habitacion habitacion : Habitaciones) {
            if (habitacion.getNumero() == numero) {
                return habitacion;
            }
        }
        return null;
    }
  public void actualizarTipoHabitacion(int numero, String nuevoTipo) {
        Habitacion habitacion = buscarHabitacion(numero);
        if (habitacion != null) {
            habitacion.setTipo(nuevoTipo);
        }
    }
   public void eliminarHabitacion(int numero) {
        Habitacion habitacion = buscarHabitacion(numero);
        if (habitacion != null) {
            if (!habitacion.isOcupada()) {
                Habitaciones.remove(habitacion);
            } else {
                throw new RuntimeException("No se puede eliminar una habitación ocupada");
            }
        }
   }
}
   
    
   
        


