package proyecto_POO;

public class Habitacion {
	private int numero_habitacion;
	private String ubicacion;
	private int capacidad;
	private String tipo;
	
	public Habitacion(int numero_habitacion, String ubicacion, int capacidad, String tipo) {
		this.numero_habitacion = numero_habitacion;
		this.ubicacion = ubicacion;
		this.capacidad = capacidad;
		this.tipo = tipo;
	}
	public int getNumero_habitacion() {
		return numero_habitacion;
	}
	public void setNumero_habitacion(int numero_habitacion) {
		this.numero_habitacion = numero_habitacion;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	

}
