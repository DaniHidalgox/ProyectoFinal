package AdministracionEmpleados.ViewEmpleado;

import AdministracionEmpleados.Empleado;
import java.util.List;

public interface EmpleadoView {
    void mostrarEmpleados(List<Empleado> empleados);

    void mostrarMensaje(String mensaje);

    void mostrarEmpleado(Empleado empleado);
}
