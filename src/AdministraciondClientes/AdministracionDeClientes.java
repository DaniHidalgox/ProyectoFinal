package AdministraciondClientes;

import Entity.Clientes;
import java.util.ArrayList;
import java.util.List;

public class AdministracionDeClientes {
    private List<Clientes> clientes;

    public AdministracionDeClientes() {
        clientes = new ArrayList<>();
    }

    public void agregarCliente(int IdCliente, String Nombre, String FechaNacimiento, String NumeroTelefono, String Correo) {
        Clientes nuevoCliente = new Clientes(IdCliente, Nombre, FechaNacimiento, NumeroTelefono, Correo);
        clientes.add(nuevoCliente);
    }

    public Clientes buscarCliente(int id) {
        for (Clientes cliente : clientes) {
            if (cliente.getIdCliente() == id) {
                return cliente;
            }
        }
        return null;
    }

    public void actualizarCliente(int id, String nuevoNombre, String nuevoTelefono, String nuevoCorreo) {
        Clientes cliente = buscarCliente(id);
        if (cliente != null) {
            cliente.setNombre(nuevoNombre);
            cliente.setNumeroTelefono(nuevoTelefono);
            cliente.setCorreo(nuevoCorreo);
        }
    }

    public void eliminarCliente(int id) {
        Clientes cliente = buscarCliente(id);
        if (cliente != null) {
            clientes.remove(cliente);
        }
    }

    public List<Clientes> buscarClientes(String filtro) {
        List<Clientes> clientesEncontrados = new ArrayList<>();
        for (Clientes cliente : clientes) {
            if (cliente.getNombre().toLowerCase().contains(filtro.toLowerCase())) {
                clientesEncontrados.add(cliente);
            }
        }
        return clientesEncontrados;
    }

    public List<Clientes> getClientes() {
        return new ArrayList<>(clientes);
    }
}
