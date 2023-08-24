package Entity;

import Interfaces.AdminHabitaciones;
import java.util.List;

public class Habitacion implements AdminHabitaciones {

    private int numeroHabitacion;
    private String tipo;
    private double precio;
    private boolean ocupada;

    @Override
    public String toString() {
        return "Habitacion{" + "numeroHabitacion=" + numeroHabitacion + ", tipo=" + tipo + ", precio=" + precio + ", ocupada=" + ocupada + '}';
    }

    public Habitacion(int numeroHabitacion, String tipo, double precio) {
        this.numeroHabitacion = numeroHabitacion;
        this.tipo = tipo;
        this.precio = precio;
        this.ocupada = false;
    }

//    public Habitacion(int numeroHabitacion, TipoHabitacion tipo, double precio) {
//        
//    }
    
    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    public double getPrecio() {
        return precio;
    }

    public int getNumero() {
        return getNumeroHabitacion();
    }

    @Override
    public void agregarHabitacion(int numero, String tipo, double precio) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void actualizarTipoHabitacion(int numero, String nuevoTipo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminarHabitacion(int numero) throws RuntimeException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Habitacion buscarHabitacion(int numero) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Habitacion> getHabitaciones() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
