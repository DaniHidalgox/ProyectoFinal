/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

/**
 *
 * @author jeanc
 */
public interface GestionReservas {
    
    void reservar(int numeroReserva, String numeroCedulaCliente, String tipoHabitacion,
                 String fechaEntrada, String fechaSalida);
    
    void cancelarReserva(int numeroReserva);
    
    void buscarReserva(String filtro);
    
    void activarReserva(int numeroReserva);
}
