package CuerposGEOMETRICOS;

public class Icosaedro extends Geometricos {

	public Icosaedro(int lados, double altura, double perimetro, double lateral, double total, double volumen,
			double radio, double area, double arista) {
		super(lados, altura, perimetro, lateral, total, volumen, radio, area, arista);
		
		area = 5 * Math.pow(arista , 2) * Math.sqrt(3);
		volumen =  5/12 * 3 + Math.sqrt(5)  * Math.pow(arista , 3);
		
		System.out.println( );
		System.out.println("EL area del Icosaedro es:"+area);
		System.out.println("EL volumen del Icosaedro es:"+ volumen);
		System.out.println( );
	}

}
