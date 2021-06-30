package Trabajos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Proyecto {
	static Scanner lector = new Scanner (System.in);
	static Scanner otrolector = new Scanner (System.in);
	public static void main(String[] args) {
		boolean continua; 
		int compras;
		int opcion;
		System.out.println("Que desea hacer ");
		opcion = lector.nextInt();
		switch(opcion) {
		case 1:
		do {
		try {
			continua = false;
		do{
		System.out.println("INGRESE EL NUMERO DE COMPRAS  QUE REALIZO ");
		compras= lector.nextInt();
		if(compras<=0){
			System.out.println("ERRROR. No pueden haber numeros negativos");
			}
		}while(compras<=0);
		String  nombre[] = new String [compras];
		int cantidad[] = new int [compras];
		double[] cantidadprecio = new double [compras];
		double [] preciototal = new double [compras];
		double total = 0  ;
		System.out.println("Ingrese el nombre del producto que vendio");
		for(int i=0; i<nombre.length; i++) {
			System.out.println("producto #" + (i+1));
			nombre[i] = otrolector.next();		
		}//1

		System.out.println("Ingrese la cantidad Del producto que cvendio");
		for(int i= 0; i<cantidad.length; i++) {
			do {
			System.out.println(" Producto #"+ (i+1));
			cantidad[i] = otrolector.nextInt();
			if(cantidad[i]<=0) {
				System.out.println("ERRROR. No pueden haber numeros negativos");
				}
			}while(cantidad[i]<=0);
		}//2
	
		System.out.println("Ingrese el precio del producto por unidad que vendio");
		for(int i =0; i<cantidadprecio.length;i++) {
			do {
			System.out.println("Precio del producto #" + (i+1));
			cantidadprecio [i] = otrolector.nextDouble();
			if(cantidadprecio[i]<=0) {
				System.out.println("ERRROR. No pueden haber numeros negativos");
			}
			}while(cantidadprecio[i]<=0);
		}
		
		System.out.println("Las ventas que realizo");
			System.out.println("CANT"  +  " " + "Nombres" +  " " +  " "+  "Unidad"   +  " " + "unidad/precio" );
		double A[] = new double [compras];
		
		for(int i = 0 ;i <A.length ; i++) {
			preciototal[i] = cantidad[i]* cantidadprecio[i];
			
			System.out.println((i+1)   +  " " + nombre[i] +  " " +  " "+ cantidad[i] +  " " + cantidadprecio[i] + " "+ preciototal[i] );
			
		}
		for(int contador = 0; contador<preciototal.length; contador++) {
			total+=preciototal[contador];
		}
		System.out.println("Los gastos de sus compras totales son:$"+total);
		}catch(InputMismatchException e){
			System.out.println("Solo se aceptan numeros ");
			lector.next();
			continua = true;
		}
		}while(continua);
		break;
		
		case 2:
			System.out.println("Eliga lo que quiere comprar");
			
			
			System.out.println("Usted eligio comprar");
			int otro;
			otro= lector.nextInt();
			switch(otro) {
			case 1:
				System.out.println("Eliga ");
			}
			String plastillas[] = new String [10];
			double P[] = new double [0];
			plastillas[0] = "Acetaminofen";
			plastillas[1]= "Ibopofeno";
			plastillas[2]=	"Diuremide";
			plastillas[3] = "Dexona";
			plastillas[4] = "Fenodol";
			plastillas[5] = "Dolo-Neurobion";
			plastillas[6] = "Alopurinol";
			plastillas[7] = "Altastop";
			plastillas[8] = "Atenolol";
			plastillas[9] = "Dorival";
				
		}///swicg
	}

}
