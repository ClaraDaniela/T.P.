package proyecto_POO;

public class Fecha {
 private int dia;
 private int mes;
 private int anio;
 
public Fecha(int anio, int mes, int dia) {
	//aca hay que fijarse en el orden, primero es el año para saber si es
	//bisiesto, luego el mes para saber cuantos dias tiene
	validarAnio(anio);
	this.anio = anio;
	validarMes(mes);
	this.mes = mes;
	validarDia(dia, mes, anio);
	this.dia = dia;
}
 private void validarDia(int dia, int mes, int anio) {
	 if(dia < 1 && dia > numDias(mes, anio)) {
		 System.out.println("Dia no es valido.");
	 }
 }
 private void validarMes(int mes) {
	 if(mes < 1 && mes > 12) {
		 System.out.println("Mes no es valido.");
	 }
 }
 private void validarAnio(int anio) {
	 if(anio <= 0) {
		 System.out.println("Año no es valido.");
	 }
 }
 private boolean anioBisiesto(int anio) {
	 if(anio % 4 == 0 && (anio % 100 != 0 || anio % 400 == 0)) {
		 return true;
	 }
	 return false;
 }
 public int numDias(int mes, int anio) {
	 int numDias = 0;
	 
	 switch (mes) {
	 case 1:
	 case 3:
	 case 5:
	 case 7:
	 case 8:
	 case 10:
	 case 12:
		 numDias = 31;
		 break;
	 case 4:
	 case 6:
	 case 9:
	 case 11:
		 numDias = 30;
		 break;
	 case 2: 
		 numDias = 28;
		 if(anioBisiesto(anio)) {
			 numDias++;
		 }
		 break;
	 }
	 return numDias;
 }
}
