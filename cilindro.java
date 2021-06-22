package CuerposGEOMETRICOS;

public class  cilindro  extends Geometricos{
  
	public cilindro(int lados, double altura, double perimetro, double radio,double lateral,double total,double volumen,double area,double arista) {
		super(lados, altura, perimetro,lateral,total,volumen,radio,area,arista);
		
		 
		lateral = 2* Math.PI *radio*altura ;
		 total = 2*Math.PI*radio*(altura+radio);
		 volumen = Math.PI* Math.pow(radio, 2)*altura;
		
		
		System.out.println( );
		System.out.println("El area lateral del cilindro es:"+lateral);
		System.out.println("EL area total del cilindro es:"+total);
		System.out.println("El volumen del cilindro es:"+ volumen);
		System.out.println();
	}
	 
}
