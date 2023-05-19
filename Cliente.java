package poo;



public class Cliente {
	
	//atributos
	
	int dni;
	String nombre;
	String numTarjeta;
	int idCliente;
	
	//constructor
	public Cliente() {
		System.out.println("se creo objeto");
		
	}
	
	//setter y getter
	public void setDni(int dni) {
		this.dni = dni;
	}
	
	public int getDni() {
		return dni;
	}
	
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	
	public int getIdCliente() {
		return idCliente;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNumTarjeta(String numTarjeta) {
		this.numTarjeta = numTarjeta;
	}
	
	public String getNumTarjeta() {
		return numTarjeta;
	}
	
	public void mostrarDatos() {
		System.out.printf("los datos del cliente son:"+nombre+"\n");
		System.out.printf("numero dni:"+dni+"\n");
		System.out.printf("el numero de tarjeta es:"+numTarjeta+"\n");
		System.out.printf("el numero de id es:"+idCliente+"\n");
		
	}
}
