package Entity;

public class Empleado {

    public static class Empleados {

        private int id;
        private String nombre;
        private String telefono;
        private String puesto;
        private double salario;

        public Empleados(int id, String nombre, String telefono, String puesto, double salario) {
            this.id = id;
            this.nombre = nombre;
            this.telefono = telefono;
            this.puesto = puesto;
            this.salario = salario;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getTelefono() {
            return telefono;
        }

        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }

        public String getPuesto() {
            return puesto;
        }

        public void setPuesto(String puesto) {
            this.puesto = puesto;
        }

        public double getSalario() {
            return salario;
        }

        public void setSalario(double salario) {
            this.salario = salario;
        }
    }
}
