package AdministracionEmpleados;

import AdministracionEmpleados.Empleado.Empleados;
import java.util.HashMap;
import java.util.Map;

public class AdministracionDeEmpleados {
    private Map<Integer, Empleados> empleados;

    public AdministracionDeEmpleados() {
        this.empleados = new HashMap<>();
    }

    public void agregarEmpleado(int id, String nombre, String telefono, String puesto) {
        double salario = obtenerSalarioPorPuesto(puesto);
        Empleados empleado = new Empleados(id, nombre, telefono, puesto, salario);
        empleados.put(id, empleado);
    }

    public void actualizarEmpleado(int id, String nombre, String telefono, String puesto) {
        if (empleados.containsKey(id)) {
            Empleados empleado = empleados.get(id);
            empleado.setNombre(nombre);
            empleado.setTelefono(telefono);
            empleado.setPuesto(puesto);
            empleado.setSalario(obtenerSalarioPorPuesto(puesto));
        }
    }

    public void eliminarEmpleado(int id) {
        empleados.remove(id);
    }

    public Empleados buscarEmpleado(int id) {
        return empleados.get(id);
    }

 

    private double obtenerSalarioPorPuesto(String puesto) {
        switch (puesto) {
            case "Recepcionista":
                return 800000;
            case "Gerente":
                return 1400000;
            case "Conserje":
                return 550000;
            case "Supervisor":
                return 1100000;
            case "Mantenimiento":
                return 650000;
            default:
                return 0;
        }
    }
}
