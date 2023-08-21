import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Reserva implements GestionReservas {
    private Map<Integer, ReservaInfo> reservas;

    public Reserva() {
        this.reservas = new HashMap<>();
    }

    private class ReservaInfo {
        // Atributos de la reserva
        int numeroReserva;
        String numeroCedulaCliente;
        String tipoHabitacion;
        String fechaEntrada;
        String fechaSalida;
        String estado;

        ReservaInfo(int numeroReserva, String numeroCedulaCliente, String tipoHabitacion,
                    String fechaEntrada, String fechaSalida) {
            this.numeroReserva = numeroReserva;
            this.numeroCedulaCliente = numeroCedulaCliente;
            this.tipoHabitacion = tipoHabitacion;
            this.fechaEntrada = fechaEntrada;
            this.fechaSalida = fechaSalida;
            this.estado = "Pendiente";
        }
    }

    @Override
    public void reservar(int numeroReserva, String numeroCedulaCliente, String tipoHabitacion,
                         String fechaEntrada, String fechaSalida) {
        // Lógica para realizar la reserva
        // ...
        ReservaInfo reserva = new ReservaInfo(numeroReserva, numeroCedulaCliente,
                                              tipoHabitacion, fechaEntrada, fechaSalida);
        reservas.put(numeroReserva, reserva);
    }

    @Override
    public void cancelarReserva(int numeroReserva) {
        // Lógica para cancelar la reserva
        // ...
        reservas.remove(numeroReserva);
    }

    @Override
    public void buscarReserva(String filtro) {
        // Lógica para buscar la reserva
        // ...
    }

    @Override
    public void activarReserva(int numeroReserva) {
        // Lógica para activar la reserva
        // ...
        ReservaInfo reserva = reservas.get(numeroReserva);
        if (reserva != null && reserva.estado.equals("Pendiente")) {
            reserva.estado = "En ejecución";
            // Cambiar estado de la habitación a no disponible
            // ...
        }
    }
    
    // Otros métodos auxiliares si es necesario
    // ...
}
