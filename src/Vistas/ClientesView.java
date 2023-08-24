package Vistas;

import Entity.Clientes;
import java.util.List;

public class ClientesView {
    public void displayClientes(List<Clientes> clientesList) {
        for (Clientes cliente : clientesList) {
            System.out.println("ID: " + cliente.getIdCliente());
            System.out.println("Nombre: " + cliente.getNombre());
            System.out.println("Fecha de Nacimiento: " + cliente.getFechaNacimiento());
            System.out.println("Número de Teléfono: " + cliente.getNumeroTelefono());
            System.out.println("Correo: " + cliente.getCorreo());
            System.out.println("Edad: " + cliente.getEdadCliente());
            System.out.println("-------------");
        }
    }
}
