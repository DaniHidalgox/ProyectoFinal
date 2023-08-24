package AdministraciondClientes;

import Entity.Clientes;
import java.util.List;

public class ClientesModel {
    private AdministracionDeClientes administracionDeClientes;

    public ClientesModel() {
        administracionDeClientes = new AdministracionDeClientes();
    }

    public void agregarCliente(int IdCliente, String Nombre, String FechaNacimiento, String NumeroTelefono, String Correo) {
        administracionDeClientes.agregarCliente(IdCliente, Nombre, FechaNacimiento, NumeroTelefono, Correo);
    }

    public Clientes buscarCliente(int id) {
        return administracionDeClientes.buscarCliente(id);
    }

    public void actualizarCliente(int id, String nuevoNombre, String nuevoTelefono, String nuevoCorreo) {
        administracionDeClientes.actualizarCliente(id, nuevoNombre, nuevoTelefono, nuevoCorreo);
    }

    public void eliminarCliente(int id) {
        administracionDeClientes.eliminarCliente(id);
    }

    public List<Clientes> getClientes() {
        return administracionDeClientes.getClientes();
    }
}
