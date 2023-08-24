package AdministracionEmpleados;

import AdministracionEmpleados.AdministracionDeEmpleados;
import Entity.Empleado.Empleados;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AdministracionController {
    
    
    private AdministracionDeEmpleados administracion;

    public AdministracionController() {
        this.administracion = new AdministracionDeEmpleados();
    }

    public void agregarEmpleado(int id, String nombre, String telefono, String puesto) {
        if (administracion == null) {
            System.out.println("La variable administracion es nula");
            return;
        }
        administracion.agregarEmpleado(id, nombre, telefono, puesto);
    }

    public void actualizarEmpleado(int id, String nombre, String telefono, String puesto) {
        administracion.actualizarEmpleado(id, nombre, telefono, puesto);
    }

    public void eliminarEmpleado(int id) {
        administracion.eliminarEmpleado(id);
    }

    public Empleados buscarEmpleado(int id) {
        return administracion.buscarEmpleado(id);
    }

   public List<Empleados> obtenerListaEmpleados() {
        if (administracion == null) {
            System.out.println("La variable administracion es nula");
            return new ArrayList<>(); 
        }

        List<Empleados> empleadosList = new ArrayList<>();
        Map<Integer, Empleados> empleadosMap = administracion.obtenerEmpleados();
        for (Empleados empleado : empleadosMap.values()) {
            empleadosList.add(empleado);
        }
        return empleadosList;
    }
}
