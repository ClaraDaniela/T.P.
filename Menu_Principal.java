package proyecto_POO;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.InputMismatchException;

public class Menu_Principal {
	public static void main (String[] args) {
		  Scanner sn = new Scanner(System.in);
	        //Indica si salimos o no
	        boolean salir = false;
	        int opcion;
	        //Bucle para pedir las opciones hasta que elijamos salir
	        while (!salir) {
	            //señore usuarie aqui tiene sus pinches opciones
	            System.out.println("1. Reservar Habitacion");
	           // System.out.println("2. Reservas hechas");
	            /*System.out.println("3. Opcion 3");
	            System.out.println("4. Opcion 4");
	            System.out.println("5. Opcion 5");
	            System.out.println("6. Opcion 6");*/
	            System.out.println("7. Salir");

	            try{
	            
	                //Pide una opcion
	                System.out.println("Introduce un numero: ");
	                opcion = sn.nextInt();

	                //Realiza una de las opciones
	                switch (opcion) {
	                    case 1:
	                        System.out.println("Reserva de Habitacion");
	                       
	                        LinkedList<Habitacion> habitaciones= new  LinkedList<Habitacion>();
	                        //Hotel TuAbuela = new Hotel("Mendoza", habitaciones);
	                       // Estado_de_Reserva.habitacionesDisponibles(TuAbuela.getHabitaciones();
	                      
	                        Scanner sc = new Scanner(System.in);
	                        
	                        //esto nomas para pedir una fecha
	                        System.out.println("Fecha Desde");
	                        System.out.println("Ingrese año: ");
	                        int anio = sc.nextInt(); 
	                        System.out.println("Ingrese mes: ");
	                        int mes = sc.nextInt(); 
	                        System.out.println("Ingrese dia: ");
	                        int dia = sc.nextInt(); 
	                        Fecha fechadesde = new Fecha(anio, mes, dia);
	                        
	                        System.out.println("Fecha Hasta");
	                        System.out.println("Ingrese año: ");
	                        int anio1 = sc.nextInt(); 
	                        System.out.println("Ingrese mes: ");
	                        int mes1 = sc.nextInt(); 
	                        System.out.println("Ingrese dia: ");
	                        int dia1 = sc.nextInt(); 
	                        Fecha fechahasta = new Fecha(anio1, mes1, dia1);
	                        
	                        System.out.println("Ingrese el numero de personas: ");	                       
	                        int numDePersonas = sc.nextInt(); 
	                        System.out.println("Ingrese el numero de la habitacion que desea reservar: ");	                      
	                        int numDeHabitacion = sc.nextInt(); 
	                        
	                                               
	                        System.out.println("Pasajeros");
	                        LinkedList<Pasajero> pasajeros = new LinkedList<Pasajero>();
	                        LinkedList<Reserva> reservas = new LinkedList<Reserva>();
	                        System.out.println("Ingrese nombre de pasajero: ");
	                        for(int i = 0; i < numDePersonas; i++){	          
	                        String nombre = sc.nextLine();   
	                        Pasajero pasajero = new Pasajero(nombre);
	                        pasajeros.add(pasajero);
	                        System.out.println("Ingrese nombre de pasajero: ");
	                        }
	                        Reserva reserva = new Reserva(fechadesde, fechahasta, numDePersonas, numDeHabitacion, pasajeros);
	                        reservas.add(reserva);
	                        Estado_de_Reserva estados = new Estado_de_Reserva(true, reservas);
	                        System.out.println("Reservas hechas");
	                        for(Reserva estado: estados.getReservas()) {
	                        System.out.println(estados.getReservas());
	                        }
	                        if(reserva.getNumHabitacion() == habitaciones.getNumero_habitacion()) {
	                        	System.out.println(habitaciones);
	                        }
	                   /* case 2:
	                    	
	                      
	                        
	                        break;*/
	                    /*case 3:
	                        System.out.println("Esta es la opcion 3");
	                        break;
	                    case 4:
	                        System.out.println("Esta es la opcion 4");
	                        break;
	                    case 5:
	                        System.out.println("Esta es la opcion 5");
	                        break;
	                    case 6:
	                        System.out.println("Esta es la opcion 6");
	                        break;*/
	                    case 7:
	                        salir=true;
	                        break;
	                    default:
	                        System.out.println("Las opciones son entre 1 y 2");
	                }
	            
	                
	            //controla la excepcionn en caso de que se introduzca un valor no correcto
	            }catch(InputMismatchException e){
	                System.out.println("Debes escribir un numero");
	                sn.next();
	            }

	        }
	        
	        System.out.println("Fin del menu");

	    }
	}


