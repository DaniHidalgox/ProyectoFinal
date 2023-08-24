/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AdministracionHabitacioness;

import Entity.Habitacion;
import Interfaces.AdminHabitaciones;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Daniel Hidalgo
 */
public class Admin_Habitaciones implements AdminHabitaciones {

    private List<Habitacion> Habitaciones;

    @Override
    public List<Habitacion> getHabitaciones() {
        return Habitaciones;
    }

    public Admin_Habitaciones() {
        this.Habitaciones = new ArrayList<>();
    }

    public Admin_Habitaciones(List<Habitacion> Habitaciones) {
        this.Habitaciones = new ArrayList<>(Habitaciones);
    }

    @Override
    public void agregarHabitacion(int numero, String tipo, double precio) {
        Habitacion nuevaHabitacion = new Habitacion(numero, tipo, precio);
        System.out.println(nuevaHabitacion);
        Habitaciones.add(nuevaHabitacion);
    }

    @Override
    public Habitacion buscarHabitacion(int numero) {
        for (Habitacion habitacion : Habitaciones) {
            if (habitacion.getNumero() == numero) {
                return habitacion;
            }
        }
        return null;
    }

    @Override
    public void actualizarTipoHabitacion(int numero, String nuevoTipo) {
        Habitacion habitacion = buscarHabitacion(numero);
        if (habitacion != null) {
            habitacion.setTipo(nuevoTipo);
        }
    }

    @Override
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
