package Controllers;

import Entity.Clientes;
import Entity.Empleado;
import AdministraciondClientes.AdministracionDeClientes;
import java.util.List;

public class ClientesController {
    private AdministracionDeClientes model;

    public ClientesController(AdministracionDeClientes model) {
        this.model = model;
    }

    public ClientesController() {
        model = new AdministracionDeClientes();
    }

    public void agregarCliente(int IdCliente, String Nombre, String FechaNacimiento, String NumeroTelefono, String Correo) {
        model.agregarCliente(IdCliente, Nombre, FechaNacimiento, NumeroTelefono, Correo);
    }

    public void actualizarCliente(int id, String nuevoNombre, String nuevoTelefono, String nuevoCorreo) {
        model.actualizarCliente(id, nuevoNombre, nuevoTelefono, nuevoCorreo);
    }

    public void eliminarCliente(int id) {
        model.eliminarCliente(id);
    }

    public List<Clientes> buscarClientes(String filtro) {
        return model.buscarClientes(filtro);
    }

    public Iterable<Clientes> getClientes() {
                return model.getClientes();

    }

    public List<Empleado.Empleados> obtenerListaEmpleados() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
