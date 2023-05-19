package proyecto_POO;
	import java.util.Scanner;

	public class Main_de_Hotel {
	    public static void main(String[]args){
	            int n;
	            int p = 0;
	            int h = 0;
	            int bh = 0;
	            int mh = 0;
	            int eh = 0;
	            int ah = 0;
	           
	            System.out.println("-INGRESE NUMERO DE HOTEL-");
	            System.out.println("1-HOTEL PANAMERICANO");
	            System.out.println("2-HOTEL FAENA");
	            System.out.println("3-HOTEL HILTON");
	            System.out.println("4-HOTEL FOUR SEASON");
	            System.out.println("5-HOTEL PENNSYLVANIA");
	            
	            Scanner teclado=new Scanner(System.in);
	            
	            do{
	                n=teclado.nextInt();
	                switch(n)
	                    
	                {
	            case 1:
	                System.out.println("-HOTEL PANMERICANO-");
	                System.out.println("Ingrese el Pais");
	                System.out.println("1-ARGENTINA");
	                System.out.println("2-EE UU");
	                System.out.println("3-MEXICO");
	                p=teclado.nextInt();
	                if(p==1){
	                    
	                    System.out.println("-ARGENTINA-");
	                    System.out.println("Ingrese habitacion");
	                    System.out.println("1-INDIVIDUAL");
	                    System.out.println("2-QUEEN");
	                    System.out.println("3-KING");
	                h=teclado.nextInt();
	                } 
	                if(h==1){
	                     System.out.println("1-INDIVIDUAL");
	                }
	                if(h==2){
	                     System.out.println("2-QUEEN");
	                }
	                if(h==3){
	                     System.out.println("3-KING");
	                }
	                if(p==2){
	                    
	                    System.out.println("-EE UU-");
	                    System.out.println("Ingrese habitacion");
	                    System.out.println("1-INDIVIDUAL");
	                    System.out.println("2-QUEEN");
	                    System.out.println("3-KING");
	                h=teclado.nextInt();
	                } 
	                if(h==1){
	                     System.out.println("1-INDIVIDUAL");
	                }
	                if(h==2){
	                     System.out.println("2-QUEEN");
	                }
	                if(h==3){
	                     System.out.println("3-KING");
	                }
	                if(p==3){
	                    
	                    System.out.println("-MEXICO-");
	                    System.out.println("Ingrese habitacion");
	                    System.out.println("1-INDIVIDUAL");
	                    System.out.println("2-QUEEN");
	                    System.out.println("3-KING");
	                h=teclado.nextInt();
	                } 
	                if(h==1){
	                     System.out.println("1-INDIVIDUAL");
	                }
	                if(h==2){
	                     System.out.println("2-QUEEN");
	                }
	                if(h==3){
	                     System.out.println("3-KING");
	                }
	                
	            break;            
	            
	               
	            
	                
	            case   2:
	                System.out.println("-HOTEL FAENA-");
	                System.out.println("Ingrese el Pais");
	                System.out.println("1-ARGENTINA");
	                System.out.println("2-EE UU");
	                System.out.println("3-MEXICO");
	                p=teclado.nextInt();
	                if(p==1){
	                    
	                    System.out.println("-ARGENTINA-");
	                    System.out.println("Ingrese habitacion");
	                    System.out.println("1-INDIVIDUAL");
	                    System.out.println("2-QUEEN");
	                    System.out.println("3-KING");
	                h=teclado.nextInt();
	                } 
	                if(h==1){
	                     System.out.println("1-INDIVIDUAL");
	                }
	                if(h==2){
	                     System.out.println("2-QUEEN");
	                }
	                if(h==3){
	                     System.out.println("3-KING");
	                }
	                if(p==2){
	                    
	                    System.out.println("-EE UU-");
	                    System.out.println("Ingrese habitacion");
	                    System.out.println("1-INDIVIDUAL");
	                    System.out.println("2-QUEEN");
	                    System.out.println("3-KING");
	                h=teclado.nextInt();
	                } 
	                if(h==1){
	                     System.out.println("1-INDIVIDUAL");
	                }
	                if(h==2){
	                     System.out.println("2-QUEEN");
	                }
	                if(h==3){
	                     System.out.println("3-KING");
	                }
	                if(p==3){
	                    
	                    System.out.println("-MEXICO-");
	                    System.out.println("Ingrese habitacion");
	                    System.out.println("1-INDIVIDUAL");
	                    System.out.println("2-QUEEN");
	                    System.out.println("3-KING");
	                h=teclado.nextInt();
	                } 
	                if(h==1){
	                     System.out.println("1-INDIVIDUAL");
	                }
	                if(h==2){
	                     System.out.println("2-QUEEN");
	                }
	                if(h==3){
	                     System.out.println("3-KING");
	                }
	                
	            break;            
	            
	               
	            
	                
	            case   3:
	                 System.out.println("-HOTEL HILTON-");
	                System.out.println("Ingrese el Pais");
	                System.out.println("1-ARGENTINA");
	                System.out.println("2-EE UU");
	                System.out.println("3-MEXICO");
	                p=teclado.nextInt();
	                if(p==1){
	                    
	                    System.out.println("-ARGENTINA-");
	                    System.out.println("Ingrese habitacion");
	                    System.out.println("1-INDIVIDUAL");
	                    System.out.println("2-QUEEN");
	                    System.out.println("3-KING");
	                h=teclado.nextInt();
	                } 
	                if(h==1){
	                     System.out.println("1-INDIVIDUAL");
	                }
	                if(h==2){
	                     System.out.println("2-QUEEN");
	                }
	                if(h==3){
	                     System.out.println("3-KING");
	                }
	                if(p==2){
	                    
	                    System.out.println("-EE UU-");
	                    System.out.println("Ingrese habitacion");
	                    System.out.println("1-INDIVIDUAL");
	                    System.out.println("2-QUEEN");
	                    System.out.println("3-KING");
	                h=teclado.nextInt();
	                } 
	                if(h==1){
	                     System.out.println("1-INDIVIDUAL");
	                }
	                if(h==2){
	                     System.out.println("2-QUEEN");
	                }
	                if(h==3){
	                     System.out.println("3-KING");
	                }
	                if(p==3){
	                    
	                    System.out.println("-MEXICO-");
	                    System.out.println("Ingrese habitacion");
	                    System.out.println("1-INDIVIDUAL");
	                    System.out.println("2-QUEEN");
	                    System.out.println("3-KING");
	                h=teclado.nextInt();
	                } 
	                if(h==1){
	                     System.out.println("1-INDIVIDUAL");
	                }
	                if(h==2){
	                     System.out.println("2-QUEEN");
	                }
	                if(h==3){
	                     System.out.println("3-KING");
	                }
	                
	            break;            
	            
	               
	            
	                
	            case   4:
	                System.out.println("-HOTEL FOURSEASON-");
	                System.out.println("Ingrese el Pais");
	                System.out.println("1-ARGENTINA");
	                System.out.println("2-EE UU");
	                System.out.println("3-MEXICO");
	                p=teclado.nextInt();
	                if(p==1){
	                    
	                    System.out.println("-ARGENTINA-");
	                    System.out.println("Ingrese habitacion");
	                    System.out.println("1-INDIVIDUAL");
	                    System.out.println("2-QUEEN");
	                    System.out.println("3-KING");
	                h=teclado.nextInt();
	                } 
	                if(h==1){
	                     System.out.println("1-INDIVIDUAL");
	                }
	                if(h==2){
	                     System.out.println("2-QUEEN");
	                }
	                if(h==3){
	                     System.out.println("3-KING");
	                }
	                if(p==2){
	                    
	                    System.out.println("-EE UU-");
	                    System.out.println("Ingrese habitacion");
	                    System.out.println("1-INDIVIDUAL");
	                    System.out.println("2-QUEEN");
	                    System.out.println("3-KING");
	                h=teclado.nextInt();
	                } 
	                if(h==1){
	                     System.out.println("1-INDIVIDUAL");
	                }
	                if(h==2){
	                     System.out.println("2-QUEEN");
	                }
	                if(h==3){
	                     System.out.println("3-KING");
	                }
	                if(p==3){
	                    
	                    System.out.println("-MEXICO-");
	                    System.out.println("Ingrese habitacion");
	                    System.out.println("1-INDIVIDUAL");
	                    System.out.println("2-QUEEN");
	                    System.out.println("3-KING");
	                h=teclado.nextInt();
	                } 
	                if(h==1){
	                     System.out.println("1-INDIVIDUAL");
	                }
	                if(h==2){
	                     System.out.println("2-QUEEN");
	                }
	                if(h==3){
	                     System.out.println("3-KING");
	                }
	                
	            break;            
	            
	               
	            
	                
	            case   5:
	                 System.out.println("-HOTEL PENSYLVANIA-");
	                System.out.println("Ingrese el Pais");
	                System.out.println("1-ARGENTINA");
	                System.out.println("2-EE UU");
	                System.out.println("3-MEXICO");
	                p=teclado.nextInt();
	                if(p==1){
	                    
	                    System.out.println("-ARGENTINA-");
	                    System.out.println("Ingrese habitacion");
	                    System.out.println("1-INDIVIDUAL");
	                    System.out.println("2-QUEEN");
	                    System.out.println("3-KING");
	                h=teclado.nextInt();
	                } 
	                if(h==1){
	                     System.out.println("1-INDIVIDUAL");
	                }
	                if(h==2){
	                     System.out.println("2-QUEEN");
	                }
	                if(h==3){
	                     System.out.println("3-KING");
	                }
	                if(p==2){
	                    
	                    System.out.println("-EE UU-");
	                    System.out.println("Ingrese habitacion");
	                    System.out.println("1-INDIVIDUAL");
	                    System.out.println("2-QUEEN");
	                    System.out.println("3-KING");
	                h=teclado.nextInt();
	                } 
	                if(h==1){
	                     System.out.println("1-INDIVIDUAL");
	                }
	                if(h==2){
	                     System.out.println("2-QUEEN");
	                }
	                if(h==3){
	                     System.out.println("3-KING");
	                }
	                if(p==3){
	                    
	                    System.out.println("-MEXICO-");
	                    System.out.println("Ingrese habitacion");
	                    System.out.println("1-INDIVIDUAL");
	                    System.out.println("2-QUEEN");
	                    System.out.println("3-KING");
	                h=teclado.nextInt();
	                } 
	                if(h==1){
	                     System.out.println("1-INDIVIDUAL");
	                }
	                if(h==2){
	                     System.out.println("2-QUEEN");
	                }
	                if(h==3){
	                     System.out.println("3-KING");
	                }
	                
	            break;            
	            
	               
	            
	                
	           
	                }

	            } while(n>5);
	            }
	            
	            
	}

