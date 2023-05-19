package proyecto_POO;

import java.util.LinkedList;

public class Hotel {
private String nombre;
private LinkedList<Habitacion> habitaciones;
public Hotel(String nombre, LinkedList<Habitacion> habitaciones) {
	super();
	this.nombre = nombre;
	this.habitaciones = habitaciones;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public LinkedList<Habitacion> getHabitaciones() {
	return habitaciones;
}
public void setHabitaciones(LinkedList<Habitacion> habitaciones) {
	this.habitaciones = habitaciones;
}

}
