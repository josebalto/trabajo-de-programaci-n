package CuerposGEOMETRICOS;

public class Huso_y_cuña_esferica  extends Geometricos{
	private double angulo;
	public Huso_y_cuña_esferica(int lados, double altura, double perimetro, double lateral, double total,
			double volumen, double radio, double area, double arista,double angulo) {
		super(lados, altura, perimetro, lateral, total, volumen, radio, area, arista);
			this.angulo = angulo;
		area =(4*Math.PI*Math.pow(radio, 2)*angulo/360);
		volumen =(Math.PI*Math.pow(radio,3)*angulo/270);
		
		System.out.println( );
		System.out.println("EL area del huso esferico es:"+ area);
		System.out.println("El volumen de la cuña esferica es:"+ volumen);
		System.out.println( );
	}

}
