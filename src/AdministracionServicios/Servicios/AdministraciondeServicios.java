package AdministracionServicios.Servicios;

import java.util.ArrayList;
import java.util.List;

public class AdministraciondeServicios {
    private List<Servicios> servicios; // Declaración de la lista de servicios

    public AdministraciondeServicios() {
        servicios = new ArrayList<>(); // Inicialización de la lista de servicios en el constructor
    }

    public void agregarServicio(int codigo, String nombre, String descripcion, double precio) {
        Servicios nuevoServicio = new Servicios(codigo, nombre, descripcion, precio);
        servicios.add(nuevoServicio);
    }

    public void actualizarServicio(int codigo, String nuevaDescripcion, double nuevoPrecio) {
        for (Servicios servicio : servicios) {
            if (servicio.getCodigo() == codigo) {
                servicio.setDescripcion(nuevaDescripcion);
                servicio.setPrecio(nuevoPrecio);
                break;
            }
        }
    }

    public void eliminarServicio(int codigo) {
        servicios.removeIf(servicio -> servicio.getCodigo() == codigo);
    }

    public Servicios buscarServicio(int codigo) {
        for (Servicios servicio : servicios) {
            if (servicio.getCodigo() == codigo) {
                return servicio;
            }
        }
        return null;
    }

    public List<Servicios> getServicios() {
        return servicios;
    }
}
