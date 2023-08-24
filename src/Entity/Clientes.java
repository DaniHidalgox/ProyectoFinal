/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author Daniel Hidalgo
 */
public class Clientes {
    private int IdCliente;
    private String Nombre;
    private String FechaNacimiento;
    private String NumeroTelefono;
    private String Correo;
    private int edadCliente;

    public Clientes() {
    }

    public Clientes(int IdCliente, String Nombre, String FechaNacimiento, String NumeroTelefono, String Correo) {
        this.IdCliente = IdCliente;
        this.Nombre = Nombre;
        this.FechaNacimiento = FechaNacimiento;
        this.NumeroTelefono = NumeroTelefono;
        this.Correo = Correo;
        
    }

    public int getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(int IdCliente) {
        this.IdCliente = IdCliente;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(String FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public String getNumeroTelefono() {
        return NumeroTelefono;
    }

    public void setNumeroTelefono(String NumeroTelefono) {
        this.NumeroTelefono = NumeroTelefono;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public int getEdadCliente() {
        return edadCliente;
    }

    public void setEdadCliente(int edadCliente) {
        this.edadCliente = edadCliente;
    }

    

    
}
