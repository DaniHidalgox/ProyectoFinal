/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AdministracionReservas;

import AdministraciondClientes.Clientes;
import Habitaciones.Habitacion;
import java.util.Date;

/**
 *
 * @author jeanc
 */
public class Reserva {
   
    static int contadorReserva = 1;
    int numeroReserva;
    Clientes cliente;
    Habitacion habitacion;
    Date fechaEntrada;
    Date fechaSalida;
    String estado;
    int duracionEstadia;
    double subtotal;
    double impuestos;
    double total;

    public Reserva(Clientes cliente, Habitacion habitacion, Date fechaEntrada, Date fechaSalida) {
        this.numeroReserva = contadorReserva++;
        this.cliente = cliente;
        this.habitacion = habitacion;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.estado = "Pendiente";
    }

    public void activar() {
        if (estado.equals("Pendiente")) {
            estado = "En ejecución";
            System.out.println("Reserva activada exitosamente.");
        } else {
            System.out.println("La reserva no puede ser activada en este estado.");
        }
    }
}
    
