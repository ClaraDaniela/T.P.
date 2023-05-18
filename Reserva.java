package proyecto_POO;

public class Reserva {
	private Fecha fechahasta;
	private Fecha fechadesde;
	private int numDePersonas;
	
	public Reserva(Fecha fechahasta, Fecha fechadesde, int numDePersonas) {
		super();
		this.fechahasta = fechahasta;
		this.fechadesde = fechadesde;
		this.numDePersonas = numDePersonas;
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
	public void registrar() {
		for(int i = 0; i < numPersonas; i++) {
			
		}
	}

}
