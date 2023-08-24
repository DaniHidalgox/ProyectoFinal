package AdministracionReservas;

import Interfaces.GestionReservas;
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

        int numeroReserva;
        String numeroCedulaCliente;
        String tipoHabitacion;
        String fechaEntrada;
        String fechaSalida;
        String estado;

        //Construct
        ReservaInfo(int numeroReserva, String numeroCedulaCliente, String tipoHabitacion,
                String fechaEntrada, String fechaSalida) {
            this.numeroReserva = numeroReserva;
            this.numeroCedulaCliente = numeroCedulaCliente;
            this.tipoHabitacion = tipoHabitacion;
            this.fechaEntrada = fechaEntrada;
            this.fechaSalida = fechaSalida;
            this.estado = "Pendiente";//Default
        }
    }

    @Override
    public void reservar(int numeroReserva, String numeroCedulaCliente, String tipoHabitacion,
            String fechaEntrada, String fechaSalida) {
        try {
            if (numeroReserva <= 0 || numeroCedulaCliente.isEmpty() || tipoHabitacion.isEmpty()
                    || fechaEntrada.isEmpty() || fechaSalida.isEmpty()) {
                throw new ReservaInvalidaException("Datos de reserva incompletos o inválidos");
            }

            ReservaInfo reserva = new ReservaInfo(numeroReserva, numeroCedulaCliente,
                    tipoHabitacion, fechaEntrada, fechaSalida);
            reservas.put(numeroReserva, reserva);
        } catch (ReservaInvalidaException e) {
            System.out.println("Error al realizar la reserva: " + e.getMessage());
        }
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
        return reserva.numeroCedulaCliente.equals(filtro)
                || reserva.tipoHabitacion.equals(filtro)
                || reserva.estado.equals(filtro);
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

    public void finalizarReserva(int numeroReserva) {
        ReservaInfo reserva = reservas.get(numeroReserva);
        if (reserva != null && reserva.estado.equals("En ejecución")) {
            reserva.estado = "Finalizada";
            cambiarEstadoHabitacionDisponible(reserva.tipoHabitacion);
        }
    }

    private void cambiarEstadoHabitacionDisponible(String tipoHabitacion) {

        Map<String, Boolean> estadosHabitaciones = new HashMap<>();
        estadosHabitaciones.put("Individual", true);
        estadosHabitaciones.put("Doble", true);
        estadosHabitaciones.put("Suite", true);

        if (estadosHabitaciones.containsKey(tipoHabitacion)) {
            estadosHabitaciones.put(tipoHabitacion, true);
        }
    }

    public void cancelarReservas(int numeroReserva) {
        ReservaInfo reserva = reservas.get(numeroReserva);
        if (reserva != null && reserva.estado.equals("Pendiente")) {
            reserva.estado = "Cancelada";
        }
    }
}
