package CuerposGEOMETRICOS;

public class Hexaedro extends Geometricos{

	public Hexaedro(int lados, double altura, double perimetro, double lateral, double total, double volumen,
			double radio, double area, double arista) {
		super(lados, altura, perimetro, lateral, total, volumen, radio, area, arista);
		
		area =6 *  Math.pow(arista, 2);
		volumen =  Math.pow(arista, 3);
		
		System.out.println( );
		System.out.println("El area del hexaedro es:"+ area);
		System.out.println("EL volumen del hexaedro es:" + volumen);
		System.out.println( );
	}

}
