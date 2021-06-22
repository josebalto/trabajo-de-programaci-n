package CuerposGEOMETRICOS;

public class Dodecaedro extends Geometricos {

	public Dodecaedro(int lados, double altura, double perimetro, double lateral, double total, double volumen,
			double radio, double area, double arista) {
		super(lados, altura, perimetro, lateral, total, volumen, radio, area, arista);
		
		area =3 * Math.pow(arista, 2)* Math.sqrt(25+10) * Math.sqrt(5);
		volumen = 1 /4 * 15 + 7 + Math.sqrt(5) * Math.pow(arista, 3);
		
		System.out.println( );
		System.out.println("El area del dodecaedro es:"+ area);
		System.out.println("El volumen del dodecaedro es:"+ volumen);
		System.out.println( );
	}

}
