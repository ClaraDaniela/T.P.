package proyecto_POO;

import java.util.LinkedList;

public class Estado_de_Reserva {
private boolean estaReservado;
private LinkedList<Reserva> reservas;

public Estado_de_Reserva(boolean estaReservado, LinkedList<Reserva> reservas) {
	this.estaReservado = true;
	this.reservas = reservas;
}

public LinkedList<Reserva> getReservas() {
	return reservas;
}

public void setReservas(LinkedList<Reserva> reservas) {
	this.reservas = reservas;
}

//aca le paso una habitacion para comparar el num de reserva con la de esta
public boolean estado(Habitacion habitacion) {
	for(Reserva reserva: reservas) {
	if(reserva.getNumHabitacion() == habitacion.getNumero_habitacion()) {
		return estaReservado;
	}
	}
	return !estaReservado;
}
//aca creo una lista de habitaciones disponibles para mostrarle al usuario
public LinkedList<Habitacion> habitacionesDisponibles(Habitacion[] habitaciones){
	LinkedList<Habitacion> lista = new LinkedList<Habitacion>();
	for(int i = 0; i < habitaciones.length; i++) {
		if(!estado(habitaciones[i])) {
			lista.add(habitaciones[i]);
		}
	}
	return lista;
}

}
