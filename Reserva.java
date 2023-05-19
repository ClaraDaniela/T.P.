package proyecto_POO;

import java.util.LinkedList;

public class Reserva {
	private Fecha fechahasta;
	private Fecha fechadesde;
	private int numDePersonas;
	//esta variable la hice porque necesitaba conectar habitacion con reserva
	//para poder saber luego si esta ocupada la habitacion.
	private Habitacion habitacion;
	private LinkedList<Pasajero> pasajeros;
	
	public Reserva(Fecha fechahasta, Fecha fechadesde, int numDePersonas, Habitacion habitacion, LinkedList<Pasajero> pasajeros) {
		this.fechahasta = fechahasta;
		this.fechadesde = fechadesde;
		this.numDePersonas = numDePersonas;
		this.habitacion = habitacion;
		this.pasajeros = pasajeros;
	}

	public Fecha getFechahasta() {
		return fechahasta;
	}

	public void setFechahasta(Fecha fechahasta) {
		this.fechahasta = fechahasta;
	}

	public Fecha getFechadesde() {
		return fechadesde;
	}

	public void setFechadesde(Fecha fechadesde) {
		this.fechadesde = fechadesde;
	}

	public int getNumDePersonas() {
		return numDePersonas;
	}

	public void setNumDePersonas(int numDePersonas) {
		this.numDePersonas = numDePersonas;
	}
	
public Habitacion getHabitacion() {
		return habitacion;
	}

	public void setHabitacion(Habitacion habitacion) {
		this.habitacion = habitacion;
	}

public LinkedList<Pasajero> getPasajeros() {
		return pasajeros;
	}

	public void setPasajeros(LinkedList<Pasajero> pasajeros) {
		this.pasajeros = pasajeros;
	}

	//crea una lista de pasajeros que van a habitar o usar los 
//servicios
	public LinkedList <Pasajero> listaPasajeros(Pasajero pasajero) {
		LinkedList <Pasajero> pasajeros = new LinkedList<Pasajero>();
		for(int i = 0; i < numDePersonas; i++) {
			pasajeros.add(pasajero);
		}
		return pasajeros;
	}

}
