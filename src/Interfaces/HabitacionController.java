package Interfaces;

import Entity.Habitacion;
import java.util.List;
//
public interface HabitacionController {

    void agregarHabitacion(int numero, String tipo, double precio);

    void actualizarHabitacion(Habitacion habitacion);

    boolean eliminarHabitacion(int numeroHabitacion);

    List<Habitacion> getHabitaciones();

    Habitacion getHabitacion(int numeroHabitacion);

    List<Habitacion> buscarHabitaciones(String filtro);
}
