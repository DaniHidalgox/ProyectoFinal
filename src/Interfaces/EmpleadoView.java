package Interfaces;

import Entity.Empleado;
import java.util.List;

public interface EmpleadoView {
    void mostrarEmpleados(List<Empleado> empleados);

    void mostrarMensaje(String mensaje);

    void mostrarEmpleado(Empleado empleado);
}
