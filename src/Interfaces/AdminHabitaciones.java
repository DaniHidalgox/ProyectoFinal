package Interfaces;

import Entity.Habitacion;
import java.util.List;

public interface AdminHabitaciones {
    void agregarHabitacion(int numero, String tipo, double precio);
    void actualizarTipoHabitacion(int numero, String nuevoTipo);
    void eliminarHabitacion(int numero) throws RuntimeException;
    Habitacion buscarHabitacion(int numero);
    public List<Habitacion> getHabitaciones();
}
