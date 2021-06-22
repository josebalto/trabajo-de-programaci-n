package CuerposGEOMETRICOS;

public class Zonaesferfica extends Geometricos {

	public Zonaesferfica(int lados, double altura, double perimetro, double lateral, double total, double volumen,
			double radio, double area, double arista) {
		super(lados, altura, perimetro, lateral, total, volumen, radio, area, arista);
		
		area =2*Math.PI*radio*altura;
		volumen = (Math.PI*altura*(Math.pow(altura, 2)+3*Math.pow(radio, 2)+3*Math.pow(radio, 2))/6);
		
		System.out.println( );
		System.out.println("EL area de la zona esferica es:"+ area);
		System.out.println("EL volumen de la zona esferica es:"+ volumen);
		System.out.println( );
	}

}
