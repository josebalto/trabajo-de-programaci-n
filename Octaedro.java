package CuerposGEOMETRICOS;

public class Octaedro  extends Geometricos{

	public Octaedro(int lados, double altura, double perimetro, double lateral, double total, double volumen,
			double radio, double area, double arista) {
		super(lados, altura, perimetro, lateral, total, volumen, radio, area, arista);
		
		area = 2 * Math.pow(arista , 2) * Math.sqrt(3);
		volumen = Math.sqrt(2) /3 * Math.pow(arista , 3);
		
		System.out.println( );
		System.out.println("EL area del octraedro es:"+area);
		System.out.println("EL volumen del octraedro es:"+ volumen);
		System.out.println( );
	}

}
