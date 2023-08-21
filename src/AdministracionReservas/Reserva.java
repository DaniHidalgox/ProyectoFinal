package AdministracionReservas;

import AdministracionReservas.GestionReservas;
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
      
        ReservaInfo reserva = new ReservaInfo(numeroReserva, numeroCedulaCliente,
                                              tipoHabitacion, fechaEntrada, fechaSalida);
        reservas.put(numeroReserva, reserva);
    }

    @Override
    public void cancelarReserva(int numeroReserva) {
       
        reservas.remove(numeroReserva);
    }

    @Override
    public void buscarReserva(String filtro) {
        List<ReservaInfo> resultados = new ArrayList<>();

        for (ReservaInfo reserva : reservas.values()) {
            if (cumpleCriterio(reserva, filtro)) {
                resultados.add(reserva);
            }
        }

        if (resultados.isEmpty()) {
            System.out.println("No se encontraron reservas que coincidan con el filtro.");
        } else {
            System.out.println("Reservas encontradas:");
            for (ReservaInfo reserva : resultados) {
                System.out.println("Número de Reserva: " + reserva.numeroReserva);
                System.out.println("Cliente: " + reserva.numeroCedulaCliente);
              
            }
        }
    }

    private boolean cumpleCriterio(ReservaInfo reserva, String filtro) {
    
    return reserva.numeroCedulaCliente.equals(filtro) ||
           reserva.tipoHabitacion.equals(filtro) ||
           reserva.estado.equals(filtro);
}


    @Override
    public void activarReserva(int numeroReserva) {
       
        ReservaInfo reserva = reservas.get(numeroReserva);
        if (reserva != null && reserva.estado.equals("Pendiente")) {
            reserva.estado = "En ejecución";
            
            cambiarEstadoHabitacion(reserva.tipoHabitacion);
        }
    }

  private void cambiarEstadoHabitacion(String tipoHabitacion) {
   
    Map<String, Boolean> estadosHabitaciones = new HashMap<>();
    estadosHabitaciones.put("Individual", false); 
    estadosHabitaciones.put("Doble", false);
    estadosHabitaciones.put("Suite", false);

  
    if (estadosHabitaciones.containsKey(tipoHabitacion)) {
        estadosHabitaciones.put(tipoHabitacion, true); 
    }
}
}

