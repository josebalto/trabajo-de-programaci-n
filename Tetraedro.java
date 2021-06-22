package CuerposGEOMETRICOS;

public class Tetraedro extends Geometricos {

	public Tetraedro(int lados, double altura, double perimetro, double lateral, double total, double volumen,
			double radio, double area, double arista) {
		super(lados, altura, perimetro, lateral, total, volumen, radio, area, arista);
		
		area =Math.pow(arista, 3) * Math.sqrt(3);
		volumen=Math.sqrt(2)/ 12 *  Math.pow(arista, 3);
		altura = arista * Math.sqrt(6)/ 3 ;
		
		System.out.println( );
		System.out.println("El area del tetraedro es:"+area);
		System.out.println("El volumen del tetraedo es:"+ volumen);
		System.out.println("La altura del tetraedo es:"+ altura);
		System.out.println( );
	}

}
